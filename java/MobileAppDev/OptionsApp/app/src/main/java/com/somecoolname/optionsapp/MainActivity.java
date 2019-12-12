package com.somecoolname.optionsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private CheckBox action,sci,fantasy;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_relative);

        submit = findViewById(R.id.submitButton);
        action = findViewById(R.id.actionCheck);
        sci = findViewById(R.id.scifiCheck);
        fantasy = findViewById(R.id.fantasyCheck);

        //code for when single option isnc selected
        /*
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (action.isChecked()){
                    Toast.makeText(getApplicationContext(),action.getText(),Toast.LENGTH_LONG).show();
                }
                if (sci.isChecked()){
                    Toast.makeText(getApplicationContext(),sci.getText(),Toast.LENGTH_LONG).show();
                }
                if (fantasy.isChecked()){
                    Toast.makeText(getApplicationContext(),fantasy.getText(),Toast.LENGTH_LONG).show();
                }
            }
        }); */


        //code for when multiple options are selected
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<String> opt = new LinkedList<>();
                if (action.isChecked()){
                   opt.add(action.getText().toString());
                }
                if (sci.isChecked()){
                    opt.add(sci.getText().toString());
                }
                if (fantasy.isChecked()){
                    opt.add(fantasy.getText().toString());
                }
                Toast.makeText(getApplicationContext(),opt.toString(),Toast.LENGTH_LONG).show();
            }

        });
    }
}
