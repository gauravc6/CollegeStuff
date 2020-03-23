package com.somecoolname.chatapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.firebase.client.Firebase;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final EditText userMessage;
        ImageView sendButton;
        final ListView listView;
        final ArrayAdapter<String> adapter;
        final ArrayList<String> chatList;

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

        listView = findViewById(R.id.chatListView);
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference mref = firebaseDatabase.getReference("chat");
        chatList = new ArrayList<>();
        adapter = new ArrayAdapter<String>(this, R.layout.list_layout, R.id.textView, chatList);
        mref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                chatList.clear();
                for (DataSnapshot ds: dataSnapshot.getChildren()) {
                    Chat chat = ds.getValue(Chat.class);
                    chatList.add(chat.getUsername()+ ":\n" + " " + chat.getMessage());
                }
                listView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
