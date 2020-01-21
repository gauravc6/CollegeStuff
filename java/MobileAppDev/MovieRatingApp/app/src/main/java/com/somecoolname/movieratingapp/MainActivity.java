package com.somecoolname.movieratingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RatingBar barA,barB,barC;
    TextView ratingA,ratingB,ratingC,resView;
    public float valA = 0, valB = 0, valC = 0;
    static TextView movieA, movieB, movieC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_relative);

        movieA = findViewById(R.id.movieAView);
        movieB = findViewById(R.id.movieBView);
        movieC = findViewById(R.id.movieCView);

        barA = findViewById(R.id.movieABar);
        barB = findViewById(R.id.movieBBar);
        barC = findViewById(R.id.movieCBar);

        ratingA = findViewById(R.id.movieARating);
        ratingB = findViewById(R.id.movieBRating);
        ratingC = findViewById(R.id.movieCRating);
        resView = findViewById(R.id.resView);

        barA.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                ratingA.setText(String.valueOf(rating));
                valA = rating;
                compareRating();
            }
        });

        barB.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                ratingB.setText(String.valueOf(rating));
                valB = rating;
                compareRating();
            }
        });

        barC.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                ratingC.setText(String.valueOf(rating));
                valC = rating;
                compareRating();
            }
        });
       }
       private void compareRating() {
           if (valA == 0 && valB == 0 && valC == 0) {
               Toast.makeText(getApplicationContext(), "Rate atleast one movie!", Toast.LENGTH_LONG).show();
               resView.setText("No movie rated!");
           } else if(valA == valB && valB == valC) {
               Toast.makeText(getApplicationContext(), "You rated all movies the same!",Toast.LENGTH_LONG).show();
               resView.setText("All movies have same rating!");
           } else if(valA >= valB && valA >= valC) {
                resView.setText("Highest rated: "+movieA.getText());
           } else if(valB >= valA && valB >= valC) {
               resView.setText("Highest rated: "+movieB.getText());
           } else {
               resView.setText("Highest rated: "+movieC.getText());
           }
         }
       }
