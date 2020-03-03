package com.somecoolname.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final EditText userMessage;
        ImageView sendButton;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Firebase.setAndroidContext(this);
        final Firebase ref = new Firebase("https://mad-chatapp.firebaseio.com/");

        userMessage = findViewById(R.id.messageField);

        sendButton = findViewById(R.id.send);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Chat chat = new Chat("Gaurav",userMessage.getText().toString());
                ref.push().setValue(chat);
                userMessage.setText("");
            }
        });
    }
}
