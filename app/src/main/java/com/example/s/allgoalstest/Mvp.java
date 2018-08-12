package com.example.s.allgoalstest;

import com.example.s.allgoalstest.adapter.ItemGroup;
import com.example.s.allgoalstest.pojo.League;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.List;

public interface Mvp {


    interface MainView {
        void showDataInTextView();

        void showLog(String textLog);

        void showDataInTextView(String str);

        void viewListLeague(List<ItemGroup> leagues);
    }

    interface MainRepository {

        //       List<League> getListWithObject();

        // void setList();
        //    JSONArray asyncJsonInString();

        // List<League> getListWithObject(JSONArray jsonArray);
        //    List<League> getListWithObject();

        String dataInString();

        List<League> getTestLeagueList();

        //   List<League> getLeagueList();

        List<ItemGroup> getItemGroup();
        //  List<League> getFullList();
        //   List<League> presentLeagueList();
    }

    interface MainPresenter {
        void presentAllData();

        void testGetFieldsLeague();

        void presentLeagueList();
    }
}
