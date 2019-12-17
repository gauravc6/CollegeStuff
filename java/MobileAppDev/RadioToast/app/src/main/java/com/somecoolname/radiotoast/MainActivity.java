package com.somecoolname.radiotoast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button submit, clear;
    private RadioGroup courseGroup, teacherGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);

        submit = findViewById(R.id.submitButton);
        clear = findViewById(R.id.clearButton);
        courseGroup = findViewById(R.id.courseGroup);
        teacherGroup = findViewById(R.id.teacherGroup);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int teacher = teacherGroup.getCheckedRadioButtonId();
                int course = courseGroup.getCheckedRadioButtonId();

                if (teacher == -1 && course == -1) {
                    Toast.makeText(getApplicationContext(),"No teacher and course selected.",Toast.LENGTH_LONG).show();
                }
                if (course == -1) {
                    Toast.makeText(getApplicationContext(),"No course selected.",Toast.LENGTH_LONG).show();
                }
                if (teacher == -1){
                    Toast.makeText(getApplicationContext(),"No teacher selected.",Toast.LENGTH_LONG).show();
                }
                if (teacher != -1 && course != -1) {
                    RadioButton teacherRadio = teacherGroup.findViewById(teacher);
                    RadioButton courseRadio = courseGroup.findViewById(course);
                    Toast.makeText(getApplicationContext(),"You selected "+ teacherRadio.getText() +" in "
                            + courseRadio.getText() +".",Toast.LENGTH_LONG).show();
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                courseGroup.clearCheck();
                teacherGroup.clearCheck();
                Toast.makeText(getApplicationContext(),"Choices reset!",Toast.LENGTH_LONG).show();
            }
        });
    }
}
