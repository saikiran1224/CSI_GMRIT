package com.gmrit.csigmrit.activities.news;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.gmrit.csigmrit.R;
import com.gmrit.csigmrit.activities.events.EventsActivity;
import com.gmrit.csigmrit.activities.general.MainActivity;
import com.gmrit.csigmrit.activities.membership.MembershipActivity;
import com.gmrit.csigmrit.activities.team.TeamDisplayActivity;
import com.gmrit.csigmrit.adapters.NewsDisplayAdapter;
import com.gmrit.csigmrit.modals.NewsData;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class NewsActivity extends AppCompatActivity {

    BottomNavigationView Bottom;

    List<NewsData> newsDataList;
    RecyclerView newsListRecylcer;
    NewsDisplayAdapter newsDisplayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        newsDataList = new ArrayList<>();

        Bottom = findViewById(R.id.bottomnav);

        /*bottomnavigation*/

        Bottom.setSelectedItemId(R.id.news);

        Bottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.home:
                        Intent home = new Intent(NewsActivity.this, MainActivity.class);
                        startActivity(home);
                        overridePendingTransition(0,0);
                        finish();
                        return true;

                    case R.id.events:
                        Intent events = new Intent(NewsActivity.this, EventsActivity.class);
                        startActivity(events);
                        overridePendingTransition(0,0);
                        finish();
                        return true;

                    case R.id.team:
                        Intent team = new Intent(NewsActivity.this, TeamDisplayActivity.class);
                        startActivity(team);
                        overridePendingTransition(0,0);
                        finish();
                        return true;

                    case R.id.news:
                        return true;

                    case R.id.membership:
                        Intent membership = new Intent(NewsActivity.this, MembershipActivity.class);
                        startActivity(membership);
                        overridePendingTransition(0,0);
                        finish();
                        return true;
                }
                return false;
            }
        });



        newsListRecylcer = findViewById(R.id.newsList);

        newsDataList.add(new NewsData(R.drawable.ghmc, "Know The Difference Between GHMC & HMDA", "16","JAN","2022"));
        newsDataList.add(new NewsData(R.drawable.wfh, "Work From Home – Brightens – Demand For Homes", "09","JAN","2022"));
        newsDataList.add(new NewsData(R.drawable.findout, "Find Out – How To Buy a Property", "22","JAN","2022"));
        newsDataList.add(new NewsData(R.drawable.vertical_forest, "Vertical Garden & Its Impact On Summer", "03","MAR", "2022"));

        newsDisplayAdapter = new NewsDisplayAdapter(NewsActivity.this, newsDataList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(NewsActivity.this, LinearLayoutManager.VERTICAL, false);
        newsListRecylcer.setAdapter(newsDisplayAdapter);
        newsListRecylcer.setLayoutManager(linearLayoutManager);



    }
}