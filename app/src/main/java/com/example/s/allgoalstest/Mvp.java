package com.example.s.allgoalstest;

import com.example.s.allgoalstest.adapter.ExpandableItemGroup;
import com.example.s.allgoalstest.pojo.League;

import java.util.List;

public interface Mvp {

    interface MainView {
        void showListLeague(List<ExpandableItemGroup> leagues);
        void startProgress();
        void stopProgress();
    }

    interface MainRepository {
        String getDataInString();
        List<ExpandableItemGroup> getItemGroup();
    }

    interface MainPresenter {
        void presentLeagueList();
    }
}
