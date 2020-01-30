package com.somecoolname.simplemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView trigger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        trigger = findViewById(R.id.showTrigger);
        switch (item.getItemId()) {

            case R.id.add:
                trigger.setText("Add menu option triggered!");
                return false;

            case R.id.reset:
                Toast.makeText(getApplicationContext(),"Trigger reset!",Toast.LENGTH_LONG).show();
                trigger.setText("");
                return false;

            case R.id.about:
                Intent aboutIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(aboutIntent);
                return false;

            case R.id.exit:
                finish();
                return false;
        }
        return false;
    }
}
