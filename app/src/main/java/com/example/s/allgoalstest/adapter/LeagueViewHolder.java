package com.example.s.allgoalstest.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.s.allgoalstest.Urls;
import com.example.s.allgoalstest.R;
import com.squareup.picasso.Picasso;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

public class LeagueViewHolder extends GroupViewHolder {

    private TextView leagueTitle;
    private ImageView imageLeague;
    private ImageView imageArrow;
    private Context context;


    public LeagueViewHolder(View itemView, Context context) {
        super(itemView);
        this.context = context;
        leagueTitle = itemView.findViewById(R.id.title_league);
        imageLeague = itemView.findViewById(R.id.image_league);
        imageArrow = itemView.findViewById(R.id.image_arrow);
    }

    public void setLeagueTitle(ExpandableGroup group) {
        Picasso.get().load(Urls.URL_LEAGUE_IMAGE).into(imageLeague);
        leagueTitle.setText(group.getTitle());
    }


    @Override
    public void expand() {
        imageArrow.setBackground(context.getResources().getDrawable(R.drawable.ic_arrow_up));
    }


    @Override
    public void collapse() {
        imageArrow.setBackground(context.getResources().getDrawable(R.drawable.ic_arrow_down));
    }
}
