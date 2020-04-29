package com.example.timewithkid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Display;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityDescription extends AppCompatActivity {
    ArrayList<Activity> activities = MainActivity.activities.getActivities();
    ImageView img;
    Matrix matrix = new Matrix();
    Float scale = 1f;
    ScaleGestureDetector SGD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        Intent in = getIntent();
        int index = in.getIntExtra("com.example.timewithkid.DESCRIPTION_INDEX", -1);
        int pic = getDescriptionImage(index);
        img = (ImageView) findViewById(R.id.descriptionImageView);
        img.setImageResource(pic);


        TextView descriptionView = (TextView) findViewById(R.id.DescriprionTextView);
        descriptionView.setText(activities.get(index).description);


        TextView explanationView = (TextView) findViewById(R.id.ExplanationTextView);
        explanationView.setText(activities.get(index).getExplanation());

        SGD = new ScaleGestureDetector(this, new ScaleListener());

    }

    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener{
        @Override
        public  boolean onScale(ScaleGestureDetector detector){
            scale = scale * detector.getScaleFactor();
            scale = Math.max(0.1f, Math.min(scale, 5f));
            matrix.setScale(scale, scale);
            img.setImageMatrix(matrix);
            return true;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        SGD.onTouchEvent(event);
        return true;
    }

    private int getDescriptionImage(int index){

        return activities.get(index).getDescriptionImgView();

    }


}
