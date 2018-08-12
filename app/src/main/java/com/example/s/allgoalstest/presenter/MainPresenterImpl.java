package com.example.s.allgoalstest.presenter;

import android.util.Log;

import com.example.s.allgoalstest.Mvp;
import com.example.s.allgoalstest.pojo.League;
import com.example.s.allgoalstest.repository.MainRepositoryImpl;

import java.util.List;

public class MainPresenterImpl implements Mvp.MainPresenter {

    private static final String TAG = "MainPresenterImpl";
    private Mvp.MainView mainView;
    private MainRepositoryImpl repository;


    public MainPresenterImpl(Mvp.MainView mainView) {
        repository = new MainRepositoryImpl();
        this.mainView = mainView;
    }

    @Override
    public void presentAllData() {
        String string = repository.dataInString();
        mainView.showDataInTextView(string);
    }

    @Override
    public void testGetFieldsLeague() {
        List<League> leagues = repository.getTestLeagueList();
        for (int i = 0; i < leagues.size(); i++) {
            Log.e(TAG, "testGetFieldsLeague: name" + leagues.get(i).getName());
            Log.e(TAG, "testGetFieldsLeague: id" + leagues.get(i).getId());

        }

    }

    @Override
    public void presentLeagueList() {
        List<League> leagues = repository.getLeagueList();
        mainView.viewListLeague(leagues);
//        for (int i = 0; i < leagues.size(); i++) {
//            // Log.e(TAG, "presentLeagueList: checkLeague name: " + leagues.get(i).getName());
//            for (int j = 0; j < leagues.get(i).getEventsList().size(); j++) {
//                Log.e(TAG, "presentLeagueList: checkEvent: " + leagues.get(i).getEventsList().get(j).getId());
//                for (int k = 0; k < leagues.get(i).getEventsList().get(j).getParticipantsList().size(); k++) {
//                    Log.e(TAG, "presentLeagueList: checkParticipant" +
//                            leagues.get(i).getEventsList().get(j).getParticipantsList().get(k).getGoals());
//                }
//            }
//        }

    }


}
