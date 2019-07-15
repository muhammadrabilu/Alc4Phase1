package com.example.abduhamidsanichaya.alc4phase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView username = (TextView) findViewById(R.id.slack_username);
        username.setText("@Rabilu Muhammad");
    }
}
