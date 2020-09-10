package com.gmrit.csigmrit.activities.general;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.gmrit.csigmrit.R;
import com.gmrit.csigmrit.activities.events.EventsActivity;
import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity {

    TextView csiText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        csiText = findViewById(R.id.csiText);

        csiText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, EventsActivity.class);
                startActivity(intent);
            }
        });
    }
}