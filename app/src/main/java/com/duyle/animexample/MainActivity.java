package com.duyle.animexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view1 = findViewById(R.id.view1);

        Animation anim1 = AnimationUtils.loadAnimation(this, R.anim.anim1);

        view1.startAnimation(anim1);

        View view2 = findViewById(R.id.view2);

        Animation anim2 = AnimationUtils.loadAnimation(this, R.anim.anim2);

        view2.startAnimation(anim2);

    }
}