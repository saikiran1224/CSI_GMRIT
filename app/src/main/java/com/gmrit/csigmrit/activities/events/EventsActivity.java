package com.gmrit.csigmrit.activities.events;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.gmrit.csigmrit.R;
import com.gmrit.csigmrit.adapters.EventsDisplayAdapter;
import com.gmrit.csigmrit.modals.EventData;

import java.util.ArrayList;
import java.util.List;

public class EventsActivity extends AppCompatActivity {

    RecyclerView eventsDisplayRecycler;
    List<EventData> eventDataList;
    EventsDisplayAdapter eventsDisplayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        eventsDisplayRecycler = findViewById(R.id.eventsDisplayList);


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