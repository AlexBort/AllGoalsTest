package com.example.s.allgoalstest.adapter;

import com.example.s.allgoalstest.pojo.Events;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class ExpandableItemGroup extends ExpandableGroup<Events> {

    public ExpandableItemGroup(String titleLeague, List<Events> events) {
        super(titleLeague, events);
    }

}
