package com.example.healthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainHomeActivity extends AppCompatActivity implements View.OnClickListener {

    TextView exercise;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);

   exercise=findViewById(R.id.exercise1);
   exercise.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.exercise1:
                startActivity(new Intent(MainHomeActivity.this,MainExercisePage.class));
                break;
        }
    }
}