package com.example.timewithkid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Telephony;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //ListView listView;
    ListView mlistView;
    ArrayList<Integer> images  = new ArrayList<>();
    ArrayList<String> taskNames = new ArrayList<>();
    ArrayList<String> materials = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mlistView = findViewById(R.id.listView);
        mlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent showActivityDescription = new Intent(getApplicationContext(), ActivityDescription.class);
                showActivityDescription.putExtra("com.example.timewithkid.DESCRIPTION_INDEX", position);
                startActivity(showActivityDescription);
            }
        });
        taskNames.add("CLOSED CONES");
        taskNames.add("WINTER WORLD");
        taskNames.add("WINTER WORLD");
        taskNames.add("WINTER WORLD");
        taskNames.add("WINTER WORLD");
        taskNames.add("WINTER WORLD");
        taskNames.add("ONE+MORE");
        images.add(R.drawable.pinecone);
        images.add(R.drawable.pinecone);
        images.add(R.drawable.pinecone);
        images.add(R.drawable.pinecone);
        materials.add("materials:\n" +
                "- two pinecones from a white pine or hemlock pine\n" +
                "- bowl of tap water" +
                "timer");
        materials.add("materials:\n" +
                "two pinecones from a white pine or hemlock pine" +
                "bowl of tap water" +
                "timer");
        materials.add("materials:\n" +
                "two pinecones from a white pine or hemlock pine" +
                "bowl of tap water" +
                "timer");
        materials.add("materials:\n" +
                "two pinecones from a white pine or hemlock pine" +
                "bowl of tap water" +
                "timer");
        materials.add("materials:\n" +
                "two pinecones from a white pine or hemlock pine" +
                "bowl of tap water" +
                "timer");


        CustomAdaptor customAdaptor = new CustomAdaptor();
        mlistView.setAdapter(customAdaptor);

    }

    class CustomAdaptor extends BaseAdapter{

        @Override
        public int getCount() {
            return taskNames.size();
        }

        @Override
        public Object getItem(int position) {
            return taskNames.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.customlayout, null);
            ImageView mImageView = view.findViewById(R.id.imageView);
            TextView mTaskNamesTextView = view.findViewById(R.id.textView);
            TextView mMaterialsTextView = view.findViewById(R.id.materialsTextView);
            mImageView.setImageResource(images.get(position));
            mTaskNamesTextView.setText(taskNames.get(position));
            mMaterialsTextView.setText(materials.get(position));
            return view;
        }
    }


}
