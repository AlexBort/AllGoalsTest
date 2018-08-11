package com.example.s.allgoalstest.adapter;

import android.view.View;
import android.widget.TextView;

import com.example.s.allgoalstest.R;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

public class LeagueViewHolder extends GroupViewHolder {

    private TextView leagueTitle;

    public LeagueViewHolder(View itemView) {
        super(itemView);
        leagueTitle = itemView.findViewById(R.id.title_league); // TODO: 12.08.2018 поиграться еще с layout-ами
    }

    public void setLeagueTitle(ExpandableGroup group) {
        leagueTitle.setText(group.getTitle());
    }


}
