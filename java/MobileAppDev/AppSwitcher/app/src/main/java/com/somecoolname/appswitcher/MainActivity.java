package com.somecoolname.appswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button linear, radio, movieRating, wifiSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_relative);

        linear = findViewById(R.id.linearButton);
        radio = findViewById(R.id.radioButton);
        movieRating = findViewById(R.id.movieButton);
        wifiSwitch = findViewById(R.id.wifiButton);

        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activityIntent = getPackageManager().getLaunchIntentForPackage("com.somecoolname.setskin");
                startActivity(activityIntent);
            }
        });

        radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activityIntent = getPackageManager().getLaunchIntentForPackage("com.somecoolname.radiotoast");
                startActivity(activityIntent);
            }
        });

        movieRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activityIntent = getPackageManager().getLaunchIntentForPackage("com.somecoolname.movieratingapp");
                startActivity(activityIntent);
            }
        });

        wifiSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activityIntent = getPackageManager().getLaunchIntentForPackage("com.somecoolname.switchapp");
                startActivity(activityIntent);
            }
        });
    }
}
