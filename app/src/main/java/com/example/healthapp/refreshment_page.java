package com.example.healthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class refreshment_page extends AppCompatActivity {


    ProgressBar progressBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refreshment_page);


        progressBar=findViewById(R.id.progress);
        textView=findViewById(R.id.progress_text);

        progressBar.setMax(100);
        progressBar.setScaleX(3f);

        ProgressbarAnim();
    }

    public void ProgressbarAnim(){
        ProgressbarAnim anim=new ProgressbarAnim(this,progressBar,textView,0f,100f);
        anim.setDuration(8000);
        progressBar.setAnimation(anim);
    }
}