package com.example.s.allgoalstest.adapter;

import android.view.View;
import android.widget.TextView;

import com.example.s.allgoalstest.R;
import com.example.s.allgoalstest.pojo.Events;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

public class EventViewHolder extends ChildViewHolder {


    private TextView nameFirstParticip;
    private TextView nameSecondParticip;

    public EventViewHolder(View itemView) {
        super(itemView);
        nameFirstParticip = itemView.findViewById(R.id.title_team_1);// TODO: 12.08.2018 ДОБАВИТЬ СЮДА ТОЖЕ id
        nameSecondParticip = itemView.findViewById(R.id.title_team_2);
    }

    public void onBind(Events events) {
        nameFirstParticip.setText(events.getParticipantsList().get(0).getName());
        nameSecondParticip.setText(events.getParticipantsList().get(1).getName());
    }
}
