package com.example.s.allgoalstest;

import com.example.s.allgoalstest.adapter.ExpandableItemGroup;
import com.example.s.allgoalstest.pojo.League;

import java.util.List;

public interface Mvp {


    interface MainView {
        void showDataInTextView();

        void showLog(String textLog);

        void showDataInTextView(String str);

        void viewListLeague(List<ExpandableItemGroup> leagues);
    }

    interface MainRepository {

        //       List<League> getListWithObject();

        // void setList();
        //    JSONArray asyncJsonInString();

        // List<League> getListWithObject(JSONArray jsonArray);
        //    List<League> getListWithObject();

        String dataInString();

        List<League> getTestLeagueList();

        //   List<League> getLeagueList();

        List<ExpandableItemGroup> getItemGroup();
        //  List<League> getFullList();
        //   List<League> presentLeagueList();
    }

    interface MainPresenter {
        void presentAllData();

        void testGetFieldsLeague();

        void presentLeagueList();
    }
}
