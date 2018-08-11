package com.example.s.allgoalstest.pojo;

public class Participants {

    private String id;
    private String name;
    private String goals;

    public Participants(String id, String name, String goals) {

        this.id = id;
        this.name = name;
        this.goals = goals;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }


}
