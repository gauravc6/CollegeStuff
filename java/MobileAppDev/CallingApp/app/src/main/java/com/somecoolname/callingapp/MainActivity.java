package com.somecoolname.callingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText phone;
    ImageView call;
    private static int call_request = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_relative);

        phone = findViewById(R.id.phoneView);
        call = findViewById(R.id.callView);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               makeCall();
            }
        });
    }

    private void makeCall() {
        String number = phone.getText().toString();
        if (number.trim().length() > 0) {
            if (checkSelfPermission(Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, call_request);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        } else {
            Toast.makeText(getApplicationContext(), "Enter a valid number", Toast.LENGTH_LONG).show();
        }

    }

    public void onRequestPermissionResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grant) {
        super.onRequestPermissionsResult(requestCode, permissions, grant);
        if (requestCode == call_request) {
            if (grant.length>0 && grant[0] == PackageManager.PERMISSION_GRANTED) {
                makeCall();
            } else {
                Toast.makeText(this, "Permission is denied.",Toast.LENGTH_LONG).show();
            }
        }
    }
}
