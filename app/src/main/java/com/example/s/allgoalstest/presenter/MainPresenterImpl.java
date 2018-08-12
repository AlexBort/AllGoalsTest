package com.example.s.allgoalstest.presenter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.design.widget.Snackbar;
import android.support.v4.content.LocalBroadcastManager;
import android.view.View;

import com.example.s.allgoalstest.Mvp;
import com.example.s.allgoalstest.adapter.ExpandableItemGroup;
import com.example.s.allgoalstest.data.MainRepositoryImpl;
import com.example.s.allgoalstest.internet.NetworkReceiver;

import java.util.List;

public class MainPresenterImpl implements Mvp.MainPresenter {

    private Mvp.MainView mainView;
    private MainRepositoryImpl repository;
    private Context context;


    public MainPresenterImpl(Mvp.MainView mainView, Context context) {
        repository = new MainRepositoryImpl();
        this.mainView = mainView;
        this.context = context;
    }

    @Override
    public void presentLeagueList(final View rootView) {
        IntentFilter intentFilter = new IntentFilter(NetworkReceiver.NETWORK_AVAILABLE_ACTION);
        LocalBroadcastManager.getInstance(context).registerReceiver(new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                boolean isNetworkAvailable = intent.getBooleanExtra(NetworkReceiver.IS_NETWORK_AVAILABLE,
                        false);
                if (!isNetworkAvailable) {
                    Snackbar.make(rootView,
                            "Увімкніть будь ласка інтернет для закачування даних", Snackbar.LENGTH_LONG).show();
                } else {
                    List<ExpandableItemGroup> listItems = repository.getItemGroup();
                    mainView.showListLeague(listItems);
                }
            }
        }, intentFilter);


    }


}
