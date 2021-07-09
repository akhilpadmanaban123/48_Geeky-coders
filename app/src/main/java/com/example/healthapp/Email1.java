package com.example.healthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Email1 extends AppCompatActivity implements View.OnClickListener {

    TextView email;
    ImageView next;
    public static String user_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email1);


        next=findViewById(R.id.nxt);
        next.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        email=findViewById(R.id.emailID);
        user_email=email.getText().toString();
        if(user_email.isEmpty()){
            Toast.makeText(Email1.this,"Enter the email",Toast.LENGTH_LONG).show();
        }else{
            startActivity(new Intent(Email1.this,Sleep1.class));
            finish();
        }
    }
}