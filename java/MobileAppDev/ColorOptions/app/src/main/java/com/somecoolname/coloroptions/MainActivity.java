package com.somecoolname.coloroptions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.graphics.Color;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int choice,checkCounter = 0;
    private CheckBox blue, red, green, magenta;
    private Button submit;
    private RelativeLayout relLayout;

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_relative);

        blue = findViewById(R.id.blueCheck);
        red = findViewById(R.id.redCheck);
        green = findViewById(R.id.greenCheck);
        magenta = findViewById(R.id.magentaCheck);

        submit = findViewById(R.id.submitButton);

        relLayout = findViewById(R.id.mainLayout);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(blue.isChecked()){
                    choice = Color.BLUE;
                    checkCounter += 1;
                }
                if(red.isChecked()){
                    choice = Color.RED;
                    checkCounter += 1;
                }
                if(green.isChecked()){
                    choice = Color.GREEN;
                    checkCounter += 1;
                }
                if(magenta.isChecked()){
                    choice = Color.MAGENTA;
                    checkCounter += 1;
                }
                if(checkCounter == 1){
                    relLayout.setBackgroundColor(choice);
                    checkCounter = 0;
                } else if(checkCounter<1) {
                    Toast.makeText(getApplicationContext(),"Select at least 1 color!",Toast.LENGTH_LONG).show();
                } else{
                    Toast.makeText(getApplicationContext(),"You have selected more than 1 color!",Toast.LENGTH_LONG).show();
                    checkCounter = 0;
                }
            }
        });
    }
}
