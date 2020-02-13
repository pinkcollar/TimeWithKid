package com.example.timewithkid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Display;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityDescription extends AppCompatActivity {
    ArrayList<Activity> activities = MainActivity.activities.getActivities();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        Intent in = getIntent();
        int index = in.getIntExtra("com.example.timewithkid.DESCRIPTION_INDEX", -1);



        if (index > -1){
            int pic = getDescriptionImage(index);
            ImageView img = (ImageView) findViewById(R.id.descriptionImageView);
            img.setImageResource(pic);
            //scaleImg(img, pic);
            TextView descriptionView = (TextView) findViewById(R.id.DescriprionTextView);
            descriptionView.setText(activities.get(index).description);

            TextView explanationView = (TextView) findViewById(R.id.ExplanationTextView);
            explanationView.setText(activities.get(index).getExplanation());
        }

    }

    private int getDescriptionImage(int index){

        return activities.get(index).getDescriptionImgView();

    }

    private void scaleImg(ImageView img, int pic){
        Display screen = getWindowManager().getDefaultDisplay();
        BitmapFactory.Options options = new BitmapFactory.Options();

        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), pic, options);

        int imgWidth = options.outWidth;
        int screenWidth = screen.getWidth();

        if(imgWidth > screenWidth){
            int ratio = Math.round((float)imgWidth/(float)screenWidth);
            options.inSampleSize = ratio;
        }

        options.inJustDecodeBounds = false;
        Bitmap scaledImg = BitmapFactory.decodeResource(getResources(), pic, options);
        img.setImageBitmap(scaledImg);
    }
}
