package com.somecoolname.switchapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Switch wifiSwitch;
    public WifiManager wifiManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wifiSwitch = findViewById(R.id.wifiSwitch);
        wifiManager = (WifiManager) getApplicationContext().getSystemService((getApplicationContext().WIFI_SERVICE));
        if (wifiManager.getWifiState() == WifiManager.WIFI_STATE_ENABLED) {
            wifiSwitch.setChecked(true);
        }
        wifiSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getApplicationContext(), "ON",Toast.LENGTH_LONG).show();
                    wifiManager.setWifiEnabled(true);
                } else {
                    Toast.makeText(getApplicationContext(), "OFF",Toast.LENGTH_LONG).show();
                    wifiManager.setWifiEnabled(false);
                }
            }
        });

    }
}
