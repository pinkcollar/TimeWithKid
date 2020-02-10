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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        Intent in = getIntent();
        int index = in.getIntExtra("com.example.timewithkid.DESCRIPTION_INDEX", -1);

        ArrayList<String> descriptions = new ArrayList<>();
        ArrayList<String> explanations = new ArrayList<>();
        descriptions.add("PROCEDURE:\n1. Place one pinecode in the tap water for 10 minutes\n2. Keep one dry. What happens tothe wet pinecone in comparison to the dry one?\n" +
                "3. Let the pinecone dry out and inspect it again.");
        explanations.add("After few minutes, the wet pinecone's scales started to close. ");


        if (index > -1){
            int pic = getDescriptionImage(index);
            ImageView img = (ImageView) findViewById(R.id.descriptionImageView);
            img.setImageResource(pic);
            //scaleImg(img, pic);
            TextView descriptionView = (TextView) findViewById(R.id.DescriprionTextView);
            descriptionView.setText(descriptions.get(index));

            TextView explanationView = (TextView) findViewById(R.id.ExplanationTextView);
            explanationView.setText(explanations.get(index));
        }


    }

    private int getDescriptionImage(int index){
        switch (index){
            case 0: return R.drawable.pinecone;
            case 1: return R.drawable.pinecone;
            case 2: return R.drawable.pinecone;
            case 3: return R.drawable.pinecone;
            case 4: return R.drawable.pinecone;
            default: return -1;
        }
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
