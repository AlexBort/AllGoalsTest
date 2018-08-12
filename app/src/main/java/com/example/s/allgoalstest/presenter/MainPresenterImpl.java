package com.example.s.allgoalstest.presenter;

import com.example.s.allgoalstest.Mvp;
import com.example.s.allgoalstest.adapter.ExpandableItemGroup;
import com.example.s.allgoalstest.data.MainRepositoryImpl;

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
    public void presentLeagueList() {
        mainView.startProgress();
        List<ExpandableItemGroup> listItems = repository.getItemGroup();
        mainView.showListLeague(listItems);
        mainView.stopProgress();
    }


}
