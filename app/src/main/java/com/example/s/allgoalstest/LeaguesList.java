package com.example.s.allgoalstest;

import com.example.s.allgoalstest.pojo.League;

import java.util.ArrayList;

public class LeaguesList {

    private ArrayList<League> leagues = new ArrayList<>();

    public ArrayList<League> getLeagues(){
        return leagues;
    }

    public void setLeagues(ArrayList<League> leagues) {
        this.leagues = leagues;
    }
}
