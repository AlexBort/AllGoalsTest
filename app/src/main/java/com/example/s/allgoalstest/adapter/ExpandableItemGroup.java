package com.example.s.allgoalstest.adapter;

import com.example.s.allgoalstest.pojo.Events;
import com.example.s.allgoalstest.pojo.League;
import com.example.s.allgoalstest.pojo.Participants;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class ExpandableItemGroup extends ExpandableGroup<Events> {

    public ExpandableItemGroup(String titleLeague,
                               List<Events> events/*, List<Participants> participants*/) {
        super(titleLeague, events/*, participants*/);
    }

}
