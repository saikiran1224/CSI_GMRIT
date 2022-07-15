package com.gmrit.csigmrit.activities.general;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.gmrit.csigmrit.R;
import com.gmrit.csigmrit.activities.events.EventRegistrationActivity;
import com.gmrit.csigmrit.activities.events.EventsActivity;
import com.gmrit.csigmrit.activities.membership.MembershipActivity;
import com.gmrit.csigmrit.activities.news.NewsActivity;
import com.gmrit.csigmrit.activities.team.TeamDisplayActivity;
import com.gmrit.csigmrit.adapters.EssentialAdapter;
import com.gmrit.csigmrit.adapters.HomePageNewsAdapter;
import com.gmrit.csigmrit.modals.EssentialData;
import com.gmrit.csigmrit.modals.HomePageNewsData;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView csiText;

    RecyclerView essentialRecycler;
    List<EssentialData> essentialDataList;
    EssentialAdapter essentialAdapter;

    RecyclerView homePageNewsRecycler;
    List<HomePageNewsData> homePageNewsDataList;
    HomePageNewsAdapter homePageNewsAdapter;

    BottomNavigationView Bootom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        csiText = findViewById(R.id.csiText);
        Bootom = findViewById(R.id.bottomnav);

        essentialDataList = new ArrayList<>();
        essentialRecycler = findViewById(R.id.essentialRecycler);

        essentialDataList.add(new EssentialData("OUR VISION", getResources().getString(R.string.visionText), R.drawable.vission));
        essentialDataList.add(new EssentialData("OUR MISSION", getResources().getString(R.string.missionText), R.drawable.mission));
        essentialDataList.add(new EssentialData("OUR PLAN", getResources().getString(R.string.missionText), R.drawable.values));


        essentialAdapter = new EssentialAdapter(MainActivity.this, essentialDataList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        essentialRecycler.setAdapter(essentialAdapter);
        essentialRecycler.setLayoutManager(linearLayoutManager);


        homePageNewsDataList = new ArrayList<>();
        homePageNewsRecycler = findViewById(R.id.homePageNewsRecylcer);

        homePageNewsDataList.add(new HomePageNewsData(R.drawable.vertical_forest));
        homePageNewsDataList.add(new HomePageNewsData(R.drawable.apartments));
        homePageNewsDataList.add(new HomePageNewsData(R.drawable.individual_house));

        homePageNewsAdapter = new HomePageNewsAdapter(MainActivity.this, homePageNewsDataList);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        homePageNewsRecycler.setAdapter(homePageNewsAdapter);
        homePageNewsRecycler.setLayoutManager(linearLayoutManager1);






        csiText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TeamDisplayActivity.class);
                startActivity(intent);
            }
        });

        /*bottomnavigation*/
        Bootom.setSelectedItemId(R.id.home);

        Bootom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.events:
                        Intent intent = new Intent(MainActivity.this,EventsActivity.class);
                        startActivity(intent);
                        overridePendingTransition(0,0);
                        finish();
                        return true;
                    case R.id.membership:
                        Intent membership = new Intent(MainActivity.this, MembershipActivity.class);
                        startActivity(membership);
                        overridePendingTransition(0,0);
                        finish();
                        return true;

                    case R.id.news:
                        Intent news = new Intent(MainActivity.this, NewsActivity.class);
                        startActivity(news);
                        overridePendingTransition(0,0);
                        finish();
                        return true;

                    case R.id.team:
                        Intent team = new Intent(MainActivity.this, TeamDisplayActivity.class);
                        startActivity(team);
                        overridePendingTransition(0,0);
                        finish();
                        return true;
                }
                return false;
            }
        });
    }
}