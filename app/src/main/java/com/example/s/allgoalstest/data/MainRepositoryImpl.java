package com.example.s.allgoalstest.data;

import android.util.Log;

import com.example.s.allgoalstest.Mvp;
import com.example.s.allgoalstest.adapter.ExpandableItemGroup;
import com.example.s.allgoalstest.data.DownloadDataTask;
import com.example.s.allgoalstest.pojo.Events;
import com.example.s.allgoalstest.pojo.League;
import com.example.s.allgoalstest.pojo.Participants;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainRepositoryImpl implements Mvp.MainRepository {


    private static final String TAG = "MainRepositoryImpl";

    // prepared JSON!
    @Override
    public String dataInString() {
        DownloadDataTask downloadDataTask = new DownloadDataTask();
        String result = downloadDataTask.executeInBackGround();
        Log.e(TAG, "method: " + result);
        return result;
    }

    private JSONArray stringIntoLeagueJsonArray() {
        try {
            return new JSONArray(dataInString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<League> getTestLeagueList() {
        List<League> leagues = new ArrayList<>();
        JSONArray jsonArray = stringIntoLeagueJsonArray();
        for (int i = 0; i < jsonArray.length(); i++) {
            try {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                League league = getTestLeagueFields(jsonObject);
                leagues.add(league);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return leagues;
    }


    private List<League> getLeagueList() {
        List<League> leagues = new ArrayList<>();
        JSONArray jsonLeagueArray = stringIntoLeagueJsonArray();
        for (int i = 0; i < jsonLeagueArray.length(); i++) {
            try {
                JSONObject jsonObject = jsonLeagueArray.getJSONObject(i);
                League league = getLeagueFields(jsonObject);
                leagues.add(league);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return leagues;
    }

    // adapted data for expandableRecycler
    public List<ExpandableItemGroup> getItemGroup() {
        List<League> leagues = getLeagueList();
        List<ExpandableItemGroup> listItems = new ArrayList<>();
        // TODO: 12.08.2018 вот эти трансформации надо будет сделать в репозитории
        for (int i = 0; i < leagues.size(); i++) {
            ExpandableItemGroup expandableItemGroup = new ExpandableItemGroup(leagues.get(i).getName(), leagues.get(i).getEventsList());
            listItems.add(expandableItemGroup);
        }
        return listItems;
    }


    private League getTestLeagueFields(JSONObject jsonObject) throws JSONException {
        return new League(jsonObject.getString("id"),
                jsonObject.getString("name"));
    }

    private Events getEventFields(JSONObject jsonObject) {
        try {
            List<Participants> participants = getParticipantsList(jsonObject);

            return new Events(jsonObject.getString("id"), participants);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    private League getLeagueFields(JSONObject jsonObject) {
        List<Events> events = new ArrayList<>();
        try {
            events = getEventsList(jsonObject);

            return new League(jsonObject.getString("id"),
                    jsonObject.getString("name"),
                    jsonObject.getString("country"),
                    events);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    private List<Events> getEventsList(JSONObject leagueSingleObject) {
        List<Events> events = new ArrayList<>();
        try {
            JSONArray jsonArEvents = leagueSingleObject.getJSONArray("events");

            for (int i = 0; i < jsonArEvents.length(); i++) {
                JSONObject jsonObjEvent = jsonArEvents.getJSONObject(i);
                Events event = getEventFields(jsonObjEvent);
                events.add(event);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return events;
    }

    private List<Participants> getParticipantsList(JSONObject eventSingleObject) {
        List<Participants> participants = new ArrayList<>();
        try {
            JSONArray jsonArParticipants = eventSingleObject.getJSONArray("participants");

            for (int i = 0; i < jsonArParticipants.length(); i++) {
                JSONObject jsonObjEvent = jsonArParticipants.getJSONObject(i);
                Participants participant = getParticipantFields(jsonObjEvent);
                participants.add(participant);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return participants;
    }

    private Participants getParticipantFields(JSONObject jsonObject) {
        try {
            return new Participants(jsonObject.getString("id"), jsonObject.getString("name"),
                    jsonObject.getString("goals"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }


} // end class
