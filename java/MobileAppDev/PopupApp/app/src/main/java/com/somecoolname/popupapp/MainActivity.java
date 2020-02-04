package com.somecoolname.popupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = findViewById(R.id.imageView);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(MainActivity.this, image);
                popup.getMenuInflater().inflate(R.menu.popup, popup.getMenu());

                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {

                            case R.id.solid:
                                Toast.makeText(getApplicationContext(), "You selected Solid!", Toast.LENGTH_SHORT).show();
                                return true;

                            case R.id.gas:
                                Toast.makeText(getApplicationContext(), "You selected Gas!", Toast.LENGTH_SHORT).show();
                                return true;

                            case R.id.plasma:
                                Toast.makeText(getApplicationContext(), "You selected Plasma!", Toast.LENGTH_SHORT).show();
                                return true;

                            case R.id.exit:
                                finish();
                                return true;
                        }
                        return false;
                    }
                });
                popup.show();
            }
        });
    }
}

