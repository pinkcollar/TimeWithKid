package com.example.timewithkid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        ArrayList<String> arrayList = new ArrayList<>();

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

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }


}
