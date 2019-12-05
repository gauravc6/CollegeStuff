package com.somecoolname.displaymessage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText field1,field2;

    Toast toast_short,toast_long;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toast_short = Toast.makeText(MainActivity.this,"Toast Message!",Toast.LENGTH_SHORT);
        toast_short.setGravity(Gravity.TOP,0,0);
        toast_long = Toast.makeText(getApplicationContext(),"App started!", Toast.LENGTH_LONG);
        //toast_short.show();
        toast_long.show();
    }

    public void addNumber(View v){
        field1 = findViewById(R.id.editText);
        field2 = findViewById(R.id.editText2);
        textView = findViewById(R.id.textView);
        int num1 = Integer.parseInt(field1.getText().toString());
        int num2 = Integer.parseInt(field2.getText().toString());
        int sum = num1 + num2;
        textView.setText("Result = "+sum);
        Toast.makeText(getApplicationContext(),"Result = "+sum,Toast.LENGTH_LONG).show();
    }
}
