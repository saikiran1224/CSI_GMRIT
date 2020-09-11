package com.gmrit.csigmrit.activities.team;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
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
import com.gmrit.csigmrit.adapters.TeamDisplayAdapter;
import com.gmrit.csigmrit.bottomnavigation.BottomNavigation;
import com.gmrit.csigmrit.modals.TeamData;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class TeamDisplayActivity extends AppCompatActivity {

    List<TeamData> facultyList, fourthYearList, thirdYearList, secondYearList;
    RecyclerView facultyRecycler, fourthYearRecycler, thirdYearRecycler, secondYearRecycler;
    TeamDisplayAdapter facultyAdapter, fourthYearAdapter, thirdYearAdapter, secondYearAdapter;
   BottomNavigationView Bootom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_display);

        Bootom = findViewById(R.id.bottomnav);
        /*bottomnavigation*/
        Bootom.setSelectedItemId(R.id.team);

        Bootom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
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
                    case R.id.membership:
                        Toast.makeText(TeamDisplayActivity.this, "No Vacancies", Toast.LENGTH_SHORT).show();
                        return false;
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
        fourthYearRecycler = findViewById(R.id.fourthYearCoordinatorsList);
        thirdYearRecycler = findViewById(R.id.thirdYearCoordinatorsList);
        secondYearRecycler = findViewById(R.id.secondYearCoordinatorsList);

        facultyList = new ArrayList<>();
        fourthYearList = new ArrayList<>();
        thirdYearList = new ArrayList<>();
        secondYearList = new ArrayList<>();

        facultyList.add(new TeamData(R.drawable.saikiran, "Mr. Saikiran Kopparthi", "Dept. of IT"));
        facultyList.add(new TeamData(R.drawable.koushik_modekurti, "Mr. Koushik Modekurti", "Dept. of IT"));
        facultyList.add(new TeamData(R.drawable.csi_inaug, "Mr. Saiteja Vankayala", "Dept. of CSE"));



        facultyAdapter = new TeamDisplayAdapter(TeamDisplayActivity.this, facultyList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(TeamDisplayActivity.this, LinearLayoutManager.HORIZONTAL, false);
        facultyRecycler.setAdapter(facultyAdapter);
        facultyRecycler.setLayoutManager(linearLayoutManager);

        fourthYearAdapter = new TeamDisplayAdapter(TeamDisplayActivity.this, facultyList);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(TeamDisplayActivity.this, LinearLayoutManager.HORIZONTAL, false);
        fourthYearRecycler.setAdapter(fourthYearAdapter);
        fourthYearRecycler.setLayoutManager(linearLayoutManager1);

        thirdYearAdapter = new TeamDisplayAdapter(TeamDisplayActivity.this, facultyList);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(TeamDisplayActivity.this, LinearLayoutManager.HORIZONTAL, false);
        thirdYearRecycler.setAdapter(thirdYearAdapter);
        thirdYearRecycler.setLayoutManager(linearLayoutManager2);

        secondYearAdapter = new TeamDisplayAdapter(TeamDisplayActivity.this, facultyList);
        LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(TeamDisplayActivity.this, LinearLayoutManager.HORIZONTAL, false);
        secondYearRecycler.setAdapter(secondYearAdapter);
        secondYearRecycler.setLayoutManager(linearLayoutManager3);






    }
}