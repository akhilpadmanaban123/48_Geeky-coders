package com.example.healthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class Page_1 extends AppCompatActivity implements View.OnClickListener{


    TextView a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        a=findViewById(R.id.mental);
        a.setOnClickListener(this);

        b=findViewById(R.id.physical);
        b.setOnClickListener(this);

        c=findViewById(R.id.addiction);
        c.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.mental:
            case R.id.physical:
            case R.id.addiction:
                    startActivity(new Intent(Page_1.this,Name1.class));
                    finish();
                    break;
        }
    }
}
