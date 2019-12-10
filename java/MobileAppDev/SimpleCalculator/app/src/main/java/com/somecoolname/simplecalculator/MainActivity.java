package com.somecoolname.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText field1;
    private EditText field2;
    private TextView resText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_relative);
    }

    public void addNum(View v){
        field1 = findViewById(R.id.editText);
        field2 = findViewById(R.id.editText2);
        float num1 = Float.valueOf(field1.getText().toString());
        float num2 = Float.valueOf(field2.getText().toString());
        float res = num1 + num2;
        setVal(res);
    }
    
    public void subNum(View v){
        field1 = findViewById(R.id.editText);
        field2 = findViewById(R.id.editText2);
        float num1 = Float.valueOf(field1.getText().toString());
        float num2 = Float.valueOf(field2.getText().toString());
        float res = num1 - num2;
        setVal(res);
    }

    public void multNum(View v){
        field1 = findViewById(R.id.editText);
        field2 = findViewById(R.id.editText2);
        float num1 = Float.valueOf(field1.getText().toString());
        float num2 = Float.valueOf(field2.getText().toString());
        float res = num1 * num2;
        setVal(res);
    }

    public void divNum(View v){
        field1 = findViewById(R.id.editText);
        field2 = findViewById(R.id.editText2);
        float num1 = Float.valueOf(field1.getText().toString());
        float num2 = Float.valueOf(field2.getText().toString());
        float res = num1 / num2;
        setVal(res);
    }

    public void modNum(View v){
        field1 = findViewById(R.id.editText);
        field2 = findViewById(R.id.editText2);
        float num1 = Float.valueOf(field1.getText().toString());
        float num2 = Float.valueOf(field2.getText().toString());
        float res = num1 % num2;
        setVal(res);
    }

    public void resetField(View v){
        field1 = findViewById(R.id.editText);
        field2 = findViewById(R.id.editText2);
        field1.setText(String.valueOf(0));
        field2.setText(String.valueOf(0));
        setVal(0);
    }

    public void setVal(float x){
        resText = findViewById(R.id.resText);
        resText.setText("Result = "+x);

    }
}
