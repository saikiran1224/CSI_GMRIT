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


        eventDataList.add(new EventData(R.drawable.apartments,"Tripura Galaxy","Ruminate & Unwind your thoughts in the Galaxy of Tripura Own a spacious and well-ventilated apartment @Tripura Galaxy to suit your modern lifestyle","2&3BHK Apartments","Ongoing"));
        eventDataList.add(new EventData(R.drawable.individual_house,"Tripura Landmark – III","Embrace your Pride in the form of a Duplex in Tripura Landmark III Have a Vacation for your lifetime","3BHK Villas","Ongoing"));
        eventDataList.add(new EventData(R.drawable.vertical_forest,"Green Alpha","first-ever high rise gated community with green buildings – vertical forest apartments, one of its kind in Hyderabad. This greenery is bizarre.","2&3BHK Apartments","Ongoing"));

        eventsDisplayAdapter = new EventsDisplayAdapter(EventsActivity.this, eventDataList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(EventsActivity.this, LinearLayoutManager.VERTICAL, false);
        eventsDisplayRecycler.setAdapter(eventsDisplayAdapter);
        eventsDisplayRecycler.setLayoutManager(linearLayoutManager);

    }
}