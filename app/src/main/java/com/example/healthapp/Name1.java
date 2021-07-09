package com.example.healthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Name1 extends AppCompatActivity implements View.OnClickListener{

    EditText name;
    ImageView nxt;
    String name_of_user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name1);



        nxt=findViewById(R.id.next);
        nxt.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        name=findViewById(R.id.nme);
        name_of_user=name.getText().toString();
        if(name_of_user.equals("")){
            Toast.makeText(Name1.this,"Enter the name",Toast.LENGTH_LONG).show();
        }else
        {
            startActivity(new Intent(Name1.this,Identity1.class));
            finish();
        }
    }
}