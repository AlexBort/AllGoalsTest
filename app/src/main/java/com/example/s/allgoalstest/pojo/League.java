package com.example.s.allgoalstest.pojo;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

@SuppressLint("ParcelCreator")
public class League implements Parcelable {

    private String id;
    private String name;
    private String country;
    private List<Events> eventsList;

    public List<Events> getEventsList() {
        return eventsList;
    }

    public void setEventsList(List<Events> eventsList) {
        this.eventsList = eventsList;
    }

    public League(String id, String name, String country, List<Events> eventsList) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.eventsList = eventsList;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }
}
