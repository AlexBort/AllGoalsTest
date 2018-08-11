package com.example.s.allgoalstest.pojo;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

@SuppressLint("ParcelCreator")
public class Events implements Parcelable {


    private String id;
    private Participants participants;

    public List<Participants> getParticipantsList() {
        return participantsList;
    }

    public void setParticipantsList(List<Participants> participantsList) {
        this.participantsList = participantsList;
    }

    private List<Participants> participantsList;


    public Events(String id, List<Participants> participantsList) {
        this.id = id;
        this.participantsList = participantsList;
    }

    public String getId() {
        return id;
    }

    public Participants getParticipants() {
        return participants;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }
}
