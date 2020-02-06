package com.somecoolname.fragmentapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add:
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                BlankFragment firstFragment = new BlankFragment();
                fragmentTransaction.add(R.id.fragment2, firstFragment, null);
                fragmentTransaction.commit();
                return true;

            case R.id.reset:
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(intent);
                return true;

            case R.id.about:
                mTextView = findViewById(R.id.mainTextView);
                mTextView.setText("You clicked about!");
                return false;

            case R.id.exit:
                finish();

            default:
                return false;
        }
    }
}
