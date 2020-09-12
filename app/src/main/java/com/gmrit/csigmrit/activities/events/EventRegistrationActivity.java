package com.gmrit.csigmrit.activities.events;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.gmrit.csigmrit.R;

public class EventRegistrationActivity extends AppCompatActivity {

    RelativeLayout eventImageLayout;
    TextView txtEventName, txtEventDateTime;
    ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_registration);

        eventImageLayout = findViewById(R.id.eventImageLayout);
        txtEventName = findViewById(R.id.eventName);
        txtEventDateTime = findViewById(R.id.eventDateTime);

        backButton = findViewById(R.id.back_button);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EventRegistrationActivity.this, EventsActivity.class);
                startActivity(intent);
            }
        });


        Bundle bundle = getIntent().getExtras();
        assert bundle != null;
        String eventName = bundle.getString("eventName");
        String eventDateTime = bundle.getString("eventDateTime");
        int eventImage = bundle.getInt("eventImage");

        eventImageLayout.setBackgroundResource(eventImage);
        txtEventName.setText(eventName);
        txtEventDateTime.setText(eventDateTime);

    }
}