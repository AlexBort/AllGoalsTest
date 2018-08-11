package com.example.s.allgoalstest.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.s.allgoalstest.R;
import com.example.s.allgoalstest.pojo.Events;
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class ExpandableRecyclerAdapter extends ExpandableRecyclerViewAdapter<LeagueViewHolder, EventViewHolder> {

    public ExpandableRecyclerAdapter(List<? extends ExpandableGroup> groups) {
        super(groups);
    }

    @Override
    public LeagueViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_league, parent, false);
        return new LeagueViewHolder(view);
    }

    @Override
    public EventViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_participant, parent, false);
        return new EventViewHolder(view);
    }

    @Override
    public void onBindChildViewHolder(EventViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {
//        final Events artist = ((Events) group).getParticipantsList().get(childIndex);
//        holder.setArtistName(artist.getName());

    }

    @Override
    public void onBindGroupViewHolder(LeagueViewHolder holder, int flatPosition, ExpandableGroup group) {

    }
}
