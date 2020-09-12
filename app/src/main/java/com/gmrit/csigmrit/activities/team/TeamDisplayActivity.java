package com.gmrit.csigmrit.activities.team;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.gmrit.csigmrit.R;
import com.gmrit.csigmrit.activities.events.EventsActivity;
import com.gmrit.csigmrit.activities.general.MainActivity;
import com.gmrit.csigmrit.activities.membership.MembershipActivity;
import com.gmrit.csigmrit.activities.news.NewsActivity;
import com.gmrit.csigmrit.adapters.TeamDisplayAdapter;
import com.gmrit.csigmrit.bottomnavigation.BottomNavigation;
import com.gmrit.csigmrit.modals.TeamData;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class TeamDisplayActivity extends AppCompatActivity {

    List<TeamData> facultyList, developersList;
    RecyclerView facultyRecycler, developersRecylcer;
    TeamDisplayAdapter facultyAdapter, developersAdapter;
   BottomNavigationView Bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_display);

        Bottom = findViewById(R.id.bottomnav);
        /*bottomnavigation*/
        Bottom.setSelectedItemId(R.id.team);

        Bottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.events:
                        Intent intent = new Intent(TeamDisplayActivity.this, EventsActivity.class);
                        startActivity(intent);
                        overridePendingTransition(0,0);
                        finish();
                        return true;
                    case R.id.team:
                        return true;

                    case R.id.news:
                        Intent news = new Intent(TeamDisplayActivity.this, NewsActivity.class);
                        startActivity(news);
                        overridePendingTransition(0,0);
                        finish();
                        return true;

                    case R.id.membership:
                        Intent membership = new Intent(TeamDisplayActivity.this, MembershipActivity.class);
                        startActivity(membership);
                        overridePendingTransition(0,0);
                        finish();
                        return true;
                    case R.id.home:
                        Intent member = new Intent(TeamDisplayActivity.this, EventsActivity.class);
                        startActivity(member);
                        finish();
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

        facultyRecycler = findViewById(R.id.facultyCoordinatorsList);
        developersRecylcer = findViewById(R.id.developersList);

        facultyList = new ArrayList<>();
        facultyList.add(new TeamData(R.drawable.satish_sir, "Mr. Satish Muppidi", "Dept. of CSE"));
        facultyList.add(new TeamData(R.drawable.chandra_sekhar_sir, "Mr. Chandra Sekhar Reddy", "Dept. of IT"));

        developersList = new ArrayList<>();
        developersList.add(new TeamData(R.drawable.koushik_modekurti,"Mr. Kouhsik Modekurti", "Dept. of IT"));
        developersList.add(new TeamData(R.drawable.santosh_burada,"Mr. Santosh Burada", "Dept. of IT"));
        developersList.add(new TeamData(R.drawable.saikiran,"Mr. Saikiran Kopparthi", "Dept. of IT"));
        developersList.add(new TeamData(R.drawable.saiteja_vankayala,"Mr. Saiteja Vankayala", "Dept. of CSE"));



        facultyAdapter = new TeamDisplayAdapter(TeamDisplayActivity.this, facultyList);
        GridLayoutManager gridLayoutManager1 = new GridLayoutManager(TeamDisplayActivity.this, 2,GridLayoutManager.VERTICAL, false);
        facultyRecycler.setAdapter(facultyAdapter);
        facultyRecycler.setLayoutManager(gridLayoutManager1);

        developersAdapter = new TeamDisplayAdapter(TeamDisplayActivity.this, developersList);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(TeamDisplayActivity.this, 2,GridLayoutManager.VERTICAL, false);
        developersRecylcer.setAdapter(developersAdapter);
        developersRecylcer.setLayoutManager(gridLayoutManager);

    }
}