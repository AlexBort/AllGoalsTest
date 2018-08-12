package com.example.s.allgoalstest.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.s.allgoalstest.R;
import com.example.s.allgoalstest.pojo.Events;
import com.squareup.picasso.Picasso;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

public class EventViewHolder extends ChildViewHolder {

    private String urlImage = "http://www.fclviv.com.ua/wp-content/uploads/9b52f7b3d16b1348afc714ef58e9f6d1-128x128.png";
    private TextView nameFirstParticip;
    private TextView nameSecondParticip;
    private ImageView imageFirst;
    private ImageView imageSecond;
    private TextView goalsFirstTeam;
    private TextView goalsSecondTeam;

    public EventViewHolder(View itemView) {
        super(itemView);
        nameFirstParticip = itemView.findViewById(R.id.title_team_1);
        nameSecondParticip = itemView.findViewById(R.id.title_team_2);
        imageFirst = itemView.findViewById(R.id.image_1);
        imageSecond = itemView.findViewById(R.id.image_2);
        goalsFirstTeam = itemView.findViewById(R.id.goals_team_1);
        goalsSecondTeam = itemView.findViewById(R.id.goals_team_2);

    }

    public void onBind(Events events) {
        nameFirstParticip.setText(events.getParticipantsList().get(0).getName());
        nameSecondParticip.setText(events.getParticipantsList().get(1).getName());
        Picasso.get().load(urlImage).into(imageFirst);
        Picasso.get().load(urlImage).into(imageSecond);
        goalsFirstTeam.setText(events.getParticipantsList().get(0).getGoals());
        goalsSecondTeam.setText(events.getParticipantsList().get(1).getGoals());
    }
}
