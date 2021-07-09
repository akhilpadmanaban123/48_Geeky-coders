package com.example.healthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Sleep1 extends AppCompatActivity implements View.OnClickListener {

    TextView five,six,seven,eight,nine;
    public static int time_of_sleep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep1);

        five=findViewById(R.id.hour_5);
        five.setOnClickListener(this);
        six=findViewById(R.id.hour_6);
        six.setOnClickListener(this);
        seven=findViewById(R.id.hour_7);
        seven.setOnClickListener(this);
        eight=findViewById(R.id.hour_8);
        eight.setOnClickListener(this);
        nine=findViewById(R.id.hour_9);
        nine.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.hour_5:
                time_of_sleep=5;
                startActivity(new Intent(Sleep1.this,refreshment_page.class));
                finish();
                break;
            case R.id.hour_6:
                time_of_sleep=6;
                startActivity(new Intent(Sleep1.this,refreshment_page.class));
                finish();
                break;
            case R.id.hour_7:
                time_of_sleep=7;
                startActivity(new Intent(Sleep1.this,refreshment_page.class));
                finish();
                break;
            case R.id.hour_8:
                time_of_sleep=8;
                startActivity(new Intent(Sleep1.this,refreshment_page.class));
                finish();
                break;
            case R.id.hour_9:
                time_of_sleep=9;
                startActivity(new Intent(Sleep1.this,refreshment_page.class));
                finish();
                break;
        }
    }
}