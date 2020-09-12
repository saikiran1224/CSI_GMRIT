package com.gmrit.csigmrit.activities.events;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.gmrit.csigmrit.R;
import com.gmrit.csigmrit.activities.general.MainActivity;
import com.gmrit.csigmrit.activities.membership.MembershipActivity;
import com.gmrit.csigmrit.activities.news.NewsActivity;
import com.gmrit.csigmrit.activities.team.TeamDisplayActivity;
import com.gmrit.csigmrit.adapters.EventsDisplayAdapter;
import com.gmrit.csigmrit.modals.EventData;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class EventsActivity extends AppCompatActivity {

    BottomNavigationView Bottom;

    RecyclerView eventsDisplayRecycler;
    List<EventData> eventDataList;
    EventsDisplayAdapter eventsDisplayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        eventsDisplayRecycler = findViewById(R.id.eventsDisplayList);

        Bottom = findViewById(R.id.bottomnav);

        /*bottomnavigation*/
        Bottom.setSelectedItemId(R.id.events);

        Bottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.home:
                        Intent home = new Intent(EventsActivity.this, MainActivity.class);
                        startActivity(home);
                        overridePendingTransition(0,0);
                        finish();
                        return true;

                    case R.id.events:
                        return true;

                    case R.id.team:
                        Intent team = new Intent(EventsActivity.this, TeamDisplayActivity.class);
                        startActivity(team);
                        overridePendingTransition(0,0);
                        finish();
                        return true;

                    case R.id.news:
                        Intent news = new Intent(EventsActivity.this, NewsActivity.class);
                        startActivity(news);
                        overridePendingTransition(0,0);
                        finish();
                        return true;

                    case R.id.membership:
                        Intent membership = new Intent(EventsActivity.this, MembershipActivity.class);
                        startActivity(membership);
                        overridePendingTransition(0,0);
                        finish();
                        return true;
                }
                return false;
            }
        });


        eventDataList = new ArrayList<>();


        eventDataList.add(new EventData(R.drawable.csi_inaug,"CSI Foundation Day","There are two guests from Steelplant Vizag where, there will be demonstrating about Software Engineering Concepts","AUG 05 2020, 10.30AM","Workshop"));
        eventDataList.add(new EventData(R.drawable.web,"Web Development Workshop","Here we will be telling about Web Development using HTML, CSS and Javascript","SEP 11 2020, 9.00AM","Workshop"));
        eventDataList.add(new EventData(R.drawable.android,"Android App Development ","Here we will be telling about Mobile App Development using Android Studio","SEP 14 2020, 6.00PM","Event"));

        eventsDisplayAdapter = new EventsDisplayAdapter(EventsActivity.this, eventDataList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(EventsActivity.this, LinearLayoutManager.VERTICAL, false);
        eventsDisplayRecycler.setAdapter(eventsDisplayAdapter);
        eventsDisplayRecycler.setLayoutManager(linearLayoutManager);

    }
}