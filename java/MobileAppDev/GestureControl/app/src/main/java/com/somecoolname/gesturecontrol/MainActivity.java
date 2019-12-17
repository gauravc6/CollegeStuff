package com.somecoolname.gesturecontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

import java.lang.reflect.GenericSignatureFormatError;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener {

    TextView gesView;
    GestureDetector gd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_gesture);

        gesView = findViewById(R.id.gestureText);
        gd = new GestureDetector(this,this);
        gd.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent e) {
        gd.onTouchEvent(e);
        return super.onTouchEvent(e);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        gesView.setText("Single Tap Gesture");
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        gesView.setText("Double Tap Event");
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        gesView.setText("Double Tap Gesture");
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        gesView.setText("Long Press Gesture");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {

        if(e2.getX()-e1.getX()>50) {
            gesView.setText("Swipe Right Gesture");
        }
        if(e1.getX()-e2.getX()>50) {
            gesView.setText("Swipe Left Gesture");
        }
        if(e2.getY()-e1.getY()>50) {
            gesView.setText("Swipe Down Gesture");
        }
        if(e1.getY()-e2.getY()>50) {
            gesView.setText("Swipe Up Gesture");
        }
        return false;
    }
}
