package com.gmrit.csigmrit.activities.membership;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.gmrit.csigmrit.R;
import com.gmrit.csigmrit.activities.events.EventsActivity;
import com.gmrit.csigmrit.activities.general.MainActivity;
import com.gmrit.csigmrit.activities.news.NewsActivity;
import com.gmrit.csigmrit.activities.team.TeamDisplayActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MembershipActivity extends AppCompatActivity {

    BottomNavigationView Bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membership);

        Bottom = findViewById(R.id.bottomnav);

        /*bottomnavigation*/
        Bottom.setSelectedItemId(R.id.membership);

        Bottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.home:
                        Intent home = new Intent(MembershipActivity.this, MainActivity.class);
                        startActivity(home);
                        overridePendingTransition(0,0);
                        finish();
                        return true;

                    case R.id.events:
                        Intent events = new Intent(MembershipActivity.this, EventsActivity.class);
                        startActivity(events);
                        overridePendingTransition(0,0);
                        finish();
                        return true;

                    case R.id.team:
                        Intent team = new Intent(MembershipActivity.this, TeamDisplayActivity.class);
                        startActivity(team);
                        overridePendingTransition(0,0);
                        finish();
                        return true;

                    case R.id.news:
                        Intent news = new Intent(MembershipActivity.this, NewsActivity.class);
                        startActivity(news);
                        overridePendingTransition(0,0);
                        finish();
                        return true;

                    case R.id.membership:
                        return true;
                }
                return false;
            }
        });

    }
}