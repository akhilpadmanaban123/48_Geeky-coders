package com.example.healthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Identity1 extends AppCompatActivity implements View.OnClickListener {

    TextView man1,woman1,other1;
    public static String user_man,user_woman,user_other;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identity1);

        man1=findViewById(R.id.man);
        man1.setOnClickListener(this);
        woman1=findViewById(R.id.woman);
        woman1.setOnClickListener(this);
        other1=findViewById(R.id.others);
        other1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //selecting the gender
        switch (v.getId()){
            case R.id.man:
                user_man="man";
                startActivity(new Intent(Identity1.this,Email1.class));
                finish();
                break;

                //if the selected one is a woman
            case R.id.woman:
                user_woman="woman";
                startActivity(new Intent(Identity1.this,Email1.class));
                finish();
                break;

            case R.id.others:
                user_other="others";
                startActivity(new Intent(Identity1.this,Email1.class));
                finish();
                break;
        }


    }
}