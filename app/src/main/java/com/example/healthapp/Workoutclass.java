package com.example.healthapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Workoutclass extends AppCompatActivity implements View.OnClickListener {

    CardView pushup,situp,crunch,planks,squats,jumpingjack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workoutclass);

        pushup=findViewById(R.id.pushups);
        pushup.setOnClickListener(this);

        situp=findViewById(R.id.situps);
        situp.setOnClickListener(this);

        crunch=findViewById(R.id.crunches);
        crunch.setOnClickListener(this);

        planks=findViewById(R.id.plank);
        planks.setOnClickListener(this);


        squats=findViewById(R.id.squat);
        squats.setOnClickListener(this);

        jumpingjack=findViewById(R.id.jumpjack);
        jumpingjack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.pushups:
                startActivity(new Intent(Workoutclass.this,Pushup_actiivity.class));
                break;

            case R.id.crunches:
                startActivity(new Intent(Workoutclass.this,Crunches_activity.class));
                break;
            case R.id.plank:
                startActivity(new Intent(Workoutclass.this,Plank_activity.class));
                break;

            case R.id.situps:
                startActivity(new Intent(Workoutclass.this,Situp_activity.class));
                break;

            case R.id.squat:
                startActivity(new Intent(Workoutclass.this,Squat_activity.class));
                break;

            case R.id.jumpjack:
                startActivity(new Intent(Workoutclass.this,Jumpindjack_activity.class));
                break;
        }
    }
}