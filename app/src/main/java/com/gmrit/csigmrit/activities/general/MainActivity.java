package com.gmrit.csigmrit.activities.general;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity {

    TextView csiText;
    BottomNavigationView Bootom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        csiText = findViewById(R.id.csiText);
        Bootom = findViewById(R.id.bottomnav);

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