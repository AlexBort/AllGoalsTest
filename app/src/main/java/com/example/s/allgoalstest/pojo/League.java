package com.example.s.allgoalstest.pojo;

import java.util.List;

public class League {

    private String id;
    private String name;
    private String country;
    private Events events;

    private List<Events> eventsList;

    private Events[] eventsArray;

    public List<Events> getEventsList() {
        return eventsList;
    }

    public void setEventsList(List<Events> eventsList) {
        this.eventsList = eventsList;
    }

    public League(String id, String name) {
        this.id = id;
        this.name = name;
    }

//    public League(String id, String name, /*Events[] eventsArray*/List<Events> eventsList, String country) {
//        this.id = id;
//        this.name = name;
//        this.eventsArray = eventsArray;
//        this.eventsList = eventsList;
//        this.country = country;
//    }


    public League(String id, String name, String country, List<Events> eventsList) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.eventsList = eventsList;
    }

//    public League(String id, String name, String country, Events events) {
//        this.id = id;
//        this.name = name;
//        this.country = country;
//        this.events = events;
//    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public Events getEvents() {
        return events;
    }
}
