package com.example.s.allgoalstest.adapters;

import com.example.s.allgoalstest.pojo.League;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class LeagueMatchesGroup extends ExpandableGroup {

    public LeagueMatchesGroup(String titleLeague, List<League> items) {
        super(titleLeague, items);
    }
}
