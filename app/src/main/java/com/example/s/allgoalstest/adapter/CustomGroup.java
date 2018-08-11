package com.example.s.allgoalstest.adapter;

import com.example.s.allgoalstest.pojo.Events;
import com.example.s.allgoalstest.pojo.League;
import com.example.s.allgoalstest.pojo.Participants;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class CustomGroup extends ExpandableGroup<Events> {

    public CustomGroup(String titleLeague,
                       List<Events> events/*, List<Participants> participants*/) {
        super(titleLeague, events/*, participants*/);


    }
}
