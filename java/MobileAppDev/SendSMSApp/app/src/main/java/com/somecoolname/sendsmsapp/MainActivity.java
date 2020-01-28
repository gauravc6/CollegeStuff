package com.somecoolname.sendsmsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText phone, smsText;
    Button sendSMS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_relative);

        phone = findViewById(R.id.phoneView);
        smsText = findViewById(R.id.smsTextView);
        sendSMS = findViewById(R.id.sendButton);

        sendSMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(phone.getText().toString(),null, smsText.getText().toString(),null,null);
                    Toast.makeText(getApplicationContext(),"Sent Success",Toast.LENGTH_LONG).show();
                } catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Failed sending!",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
