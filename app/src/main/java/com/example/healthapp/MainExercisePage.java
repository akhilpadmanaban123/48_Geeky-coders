package com.example.healthapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class MainExercisePage extends AppCompatActivity implements View.OnClickListener {

    LottieAnimationView r1;
    CardView breathe,work;   //breathing exercise and workout
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_exercise_page);

       /* r1=findViewById(R.id.read11);
        r1.setOnClickListener(this);*/

        breathe=findViewById(R.id.p1);
        work=findViewById(R.id.p2);
        work.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.p2:
                startActivity(new Intent(MainExercisePage.this,Workoutclass.class));
                break;

        }
    }
}