package com.example.timewithkid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
     ;

    ArrayList<String> taskNames = new ArrayList<>();

    ArrayList<String> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mlistView = findViewById(R.id.listView);
        taskNames.add("CLOSED CONES");
        taskNames.add("ICE");
        taskNames.add("ONE+MORE");
        images.add(R.drawable.pinecone);
        images.add(R.drawable.pinecone);
        images.add(R.drawable.pinecone);
        images.add(R.drawable.pinecone);
        arrayList.add("CLOSED CONES\n" +
                "materials: " +
                "two pinecones from a white pine or hemlock pine" +
                "bowl of tap water" +
                "timer");
        arrayList.add("kjgkfj");
        arrayList.add("kjgkfj");
        arrayList.add("kjgkfj");
        arrayList.add("kjgkfj");
        arrayList.add("kjgkfj");
        arrayList.add("kjgkfj");
        arrayList.add("kjgkfj");
        arrayList.add("kjgkfj");
        arrayList.add("kjgkfj");
        arrayList.add("kjgkfj");
        arrayList.add("kjgkfj");
        arrayList.add("kjgkfj");
        arrayList.add("kjgkfj");
        arrayList.add("kjgkfj");
        arrayList.add("kjgkfj");
        arrayList.add("kjgkfj");
        arrayList.add("kjgkfj");
        arrayList.add("kjgkfj");
        arrayList.add("kjgkfj");
        arrayList.add("kjgkfj");
        arrayList.add("kjgkfj");

        CustomAdaptor customAdaptor = new CustomAdaptor();
        mlistView.setAdapter(customAdaptor);

        //ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);

        //listView.setAdapter(arrayAdapter);



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
            TextView mTextView = view.findViewById(R.id.textView);
            mImageView.setImageResource(images.get(position));
            mTextView.setText(taskNames.get(position));
            return view;
        }
    }


}
