package com.somecoolname.activitylifecycle;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("BasicApp","Create Invoked!");
        setContentView(R.layout.activity_main);
}


    @Override
    protected void onStart(){
        super.onStart();
        Log.d("TestingTag","Application start invoked!");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("TestingTag","Application pause invoked!");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("TestingTag","Application resume invoked!");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("TestingTag","Application destroy/end invoked!");
    }


    @Override
    protected void onStop(){
        super.onStop();
        Log.d("TestingTag","Application stop invoked!");
    }


}
