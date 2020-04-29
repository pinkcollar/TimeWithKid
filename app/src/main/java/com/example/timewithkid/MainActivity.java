package com.example.timewithkid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Matrix;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView progressTextView;
    ListView mlistView;
    static ActivityHelper activities = new ActivityHelper();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mlistView = findViewById(R.id.listView);
        progressTextView = findViewById(R.id.progressTextView);

        activities.addActivities();

        mlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent showActivityDescription = new Intent(getApplicationContext(), ActivityDescription.class);
                showActivityDescription.putExtra("com.example.timewithkid.DESCRIPTION_INDEX", position);
                startActivity(showActivityDescription);
            }
        });

        CustomAdaptor customAdaptor = new CustomAdaptor();
        mlistView.setAdapter(customAdaptor);
    }

    class CustomAdaptor extends BaseAdapter{

        @Override
        public int getCount() {
            return activities.getActivities().size();
        }

        @Override
        public Object getItem(int position) {
            return activities.getActivities().get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }
        ImageView mImageView;

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.customlayout, null);
            mImageView = view.findViewById(R.id.round_image);
            TextView mTaskNamesTextView = view.findViewById(R.id.textView);
            TextView mMaterialsTextView = view.findViewById(R.id.materialsTextView);
            mImageView.setImageResource(activities.getActivities().get(position).getLogoImgSrc());
            mTaskNamesTextView.setText(activities.getActivities().get(position).getTaskName());
            mMaterialsTextView.setText(activities.getActivities().get(position).getMaterials());
            return view;
        }

    }



} //End of MainActivity
