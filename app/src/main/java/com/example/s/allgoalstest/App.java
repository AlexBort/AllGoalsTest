package com.example.s.allgoalstest;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;

import com.example.s.allgoalstest.internet.NetworkReceiver;

import static android.net.ConnectivityManager.CONNECTIVITY_ACTION;

public class App extends Application {

    private static final String WIFI_STATE_CHANGE_ACTION = "android.net.wifi.WIFI_STATE_CHANGED";
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        initReceiver(context);
    }

    private static void initReceiver(final Context context) {
        NetworkReceiver networkStateChangeReceiver = new NetworkReceiver();
        context.registerReceiver(networkStateChangeReceiver, new IntentFilter(CONNECTIVITY_ACTION));
        context.registerReceiver(networkStateChangeReceiver, new IntentFilter(WIFI_STATE_CHANGE_ACTION));
    }
}
