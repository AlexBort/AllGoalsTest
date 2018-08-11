package com.example.s.allgoalstest.pojo;

import java.util.List;

public class Events {


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


}
