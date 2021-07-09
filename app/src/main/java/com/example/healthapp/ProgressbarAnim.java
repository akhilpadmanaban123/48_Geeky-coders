package com.example.healthapp;

import android.content.Context;
import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
import android.widget.TextView;

/*
* The waiting loading screen for the user, while the database loads and prepares the data*/
public class ProgressbarAnim extends Animation {

    private Context context;
    private ProgressBar progressBar;
    private TextView textView;
    private float from;
    private float to;

    public ProgressbarAnim(Context context, ProgressBar progressBar, TextView textView,float from, float to){
        this.context=context;
        this.progressBar=progressBar;
        this.textView=textView;
        this.from=from;
        this.to=to;
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        super.applyTransformation(interpolatedTime, t);
        float value= from+(to-from)* interpolatedTime;
        progressBar.setProgress((int) value);
        textView.setText((int)value+" %");

        if(value==to){
            context.startActivity(new Intent(context,MainHomeActivity.class));
        }
    }
}
