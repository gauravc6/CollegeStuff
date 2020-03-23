package com.somecoolname.dynamicwifiswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView wifiSwitch;
    public WifiManager wifiManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wifiSwitch = findViewById(R.id.wifiSwitch);
        wifiManager = (WifiManager) getApplicationContext().getSystemService((getApplicationContext().WIFI_SERVICE));
        if (wifiManager.getWifiState() == WifiManager.WIFI_STATE_ENABLED) {
            wifiSwitch.setBackgroundColor(Color.GREEN);
        } else {
            wifiSwitch.setBackgroundColor(Color.RED);
        }
        wifiSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wifiManager.getWifiState() == WifiManager.WIFI_STATE_ENABLED) {
                    Toast.makeText(getApplicationContext(), "WIFI: OFF",Toast.LENGTH_LONG).show();
                    wifiSwitch.setBackgroundColor(Color.RED);
                    wifiManager.setWifiEnabled(false);
                } else {
                    Toast.makeText(getApplicationContext(), "WIFI: ON",Toast.LENGTH_LONG).show();
                    wifiSwitch.setBackgroundColor(Color.GREEN);
                    wifiManager.setWifiEnabled(true);
                }
            }
        });
    }
}
