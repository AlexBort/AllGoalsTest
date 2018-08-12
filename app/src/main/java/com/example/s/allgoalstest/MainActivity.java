package com.example.s.allgoalstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;

import com.example.s.allgoalstest.adapter.ItemGroup;
import com.example.s.allgoalstest.adapter.ExpandableRecyclerAdapter;
import com.example.s.allgoalstest.adapter.RecyclerAdapter;
import com.example.s.allgoalstest.pojo.League;
import com.example.s.allgoalstest.presenter.MainPresenterImpl;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements Mvp.MainView {

    private static final String TAG = "MainActivity";
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;
    private RecyclerAdapter adapter;
    private MainPresenterImpl mainPresenter;

//    @BindView(R.id.title_main)
//    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        setSupportActionBar(toolbar);
        toolbar.setTitle("Все");
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_menu));

        mainPresenter = new MainPresenterImpl(this);
        //  mainPresenter.presentAllData();
        //  mainPresenter.testGetFieldsLeague();
        mainPresenter.presentLeagueList();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public void showDataInTextView() {
        //        adapter = new RecyclerAdapter();
//        final LinearLayoutManager mLinearLayoutManager = new LinearLayoutManager(MainActivity.this);
//        recyclerView.setLayoutManager(mLinearLayoutManager);
//        recyclerView.setAdapter(adapter);
    }

    @Override
    public void showLog(String textLog) {
        Log.e(TAG, "showLog: " + textLog);
    }

    @Override
    public void showDataInTextView(String str) {
//        textView.setText(str);
    }

    @Override
    public void viewListLeague(List<ItemGroup> itemGroups) {
        ExpandableRecyclerAdapter adapter = new ExpandableRecyclerAdapter(itemGroups);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }


} // MainActivity end



