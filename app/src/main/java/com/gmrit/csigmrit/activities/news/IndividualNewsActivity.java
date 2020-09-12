package com.gmrit.csigmrit.activities.news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.gmrit.csigmrit.R;

public class IndividualNewsActivity extends AppCompatActivity {

    RelativeLayout eventImageLayout;
    ImageView backButton;
    TextView txtAchivementName, txtAchievementDate;
    // NEED TO INCLUDE txtAchievementDescription

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual_news);


        eventImageLayout = findViewById(R.id.eventImageLayout);
        backButton = findViewById(R.id.back_button);
        txtAchivementName = findViewById(R.id.achievementName);
        txtAchievementDate = findViewById(R.id.eventDateTime);

        Bundle bundle = getIntent().getExtras();
        assert bundle != null;
        int achievementImage = bundle.getInt("achievementImage");
        String achievementName = bundle.getString("achievementName");
        String achievementDate = bundle.getString("achievementDate");
        String achievementMonth = bundle.getString("achievementMonth");
        String achievementYear = bundle.getString("achievementYear");

        eventImageLayout.setBackgroundResource(achievementImage);
        txtAchivementName.setText(achievementName);
        txtAchievementDate.setText(achievementDate + " " + achievementMonth + ", " + achievementYear);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IndividualNewsActivity.this, NewsActivity.class);
                startActivity(intent);
            }
        });

    }
}