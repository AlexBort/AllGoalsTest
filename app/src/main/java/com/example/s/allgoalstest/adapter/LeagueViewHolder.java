package com.example.s.allgoalstest.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.s.allgoalstest.R;
import com.squareup.picasso.Picasso;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

public class LeagueViewHolder extends GroupViewHolder {

    private TextView leagueTitle;
    private ImageView imageLeague;

    public LeagueViewHolder(View itemView) {
        super(itemView);
        leagueTitle = itemView.findViewById(R.id.title_league); // TODO: 12.08.2018 поиграться еще с layout-ами
        imageLeague = itemView.findViewById(R.id.image_league);
    }

    public void setLeagueTitle(ExpandableGroup group) {
        Picasso.get().load("http://ua.365.wiki/img/flags/128/ua.png").into(imageLeague);
        leagueTitle.setText(group.getTitle());
    }

//    @Override
//    public void expand() {
//        super.expand();
//    }
//
//    @Override
//    public void collapse() {
//        super.collapse();
//    }
}
