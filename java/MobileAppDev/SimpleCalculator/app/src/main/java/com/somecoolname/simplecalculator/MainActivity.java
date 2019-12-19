package com.somecoolname.simplecalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText field1;
    private EditText field2;
    private TextView resText;
    private Button reset, add, mult, sub, div, mod;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_relative);

        reset = findViewById(R.id.resetbutton);
        add = findViewById(R.id.addbutton);
        mult = findViewById(R.id.multbutton);
        sub = findViewById(R.id.subbutton);
        div = findViewById(R.id.divbutton);
        mod = findViewById(R.id.modbutton);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                field1 = findViewById(R.id.editText);
                field2 = findViewById(R.id.editText2);
                float num1 = Float.valueOf(field1.getText().toString());
                float num2 = Float.valueOf(field2.getText().toString());
                float res = num1 + num2;
                setVal(res);
                createDialog("Addition of "+field1.getText()+" and "+field2.getText()+" is "+res+".", "Add operation");
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                field1 = findViewById(R.id.editText);
                field2 = findViewById(R.id.editText2);
                float num1 = Float.valueOf(field1.getText().toString());
                float num2 = Float.valueOf(field2.getText().toString());
                float res = num1 - num2;
                setVal(res);
                createDialog("Subtraction of "+field2.getText()+" from "+field1.getText()+" is "+res+".", "Subtract Operation");
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                field1 = findViewById(R.id.editText);
                field2 = findViewById(R.id.editText2);
                float num1 = Float.valueOf(field1.getText().toString());
                float num2 = Float.valueOf(field2.getText().toString());
                float res = num1 * num2;
                setVal(res);
                createDialog("Multiplication of "+field1.getText()+" and "+field2.getText()+" is "+res+".", "Multiply operation");
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                field1 = findViewById(R.id.editText);
                field2 = findViewById(R.id.editText2);
                float num1 = Float.valueOf(field1.getText().toString());
                float num2 = Float.valueOf(field2.getText().toString());
                float res = num1 / num2;
                setVal(res);
                createDialog("Division of "+field1.getText()+" by "+field2.getText()+" is "+res+".", "Divide operation");
            }
        });

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                field1 = findViewById(R.id.editText);
                field2 = findViewById(R.id.editText2);
                float num1 = Float.valueOf(field1.getText().toString());
                float num2 = Float.valueOf(field2.getText().toString());
                float res = num1 % num2;
                setVal(res);
                createDialog("Mod of "+field1.getText()+" and "+field2.getText()+" is "+res+".", "Mod operation");
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                field1 = findViewById(R.id.editText);
                field2 = findViewById(R.id.editText2);
                field1.setText(String.valueOf(0));
                field2.setText(String.valueOf(0));
                setVal(0);
                createDialog("Fields reset!", "Reset operation");
            }
        });
    }

    public void createDialog(String msg, String title) {
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(MainActivity.this);
        alertBuilder.setMessage(msg).setCancelable(true)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog alertDialog = alertBuilder.create();
        alertDialog.setTitle(title);
        alertDialog.show();
    }

    public void setVal(float x){
        resText = findViewById(R.id.resText);
        resText.setText("Result = "+x);

    }
}
