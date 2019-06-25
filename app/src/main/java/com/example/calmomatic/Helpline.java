package com.example.calmomatic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class Helpline extends AppCompatActivity {
    String[] nameArray = {"Mental Health Foundation NZ","The LowDown NZ","Anxiety NZ","Samaritans"};
    Integer[] imageArray = {R.drawable.mhfnz,R.drawable.lowdownnz,R.drawable.anxietynz,R.drawable.samaritans};

    ListView listView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helplines);

        CustomListAdapter adapter = new CustomListAdapter(this, nameArray,imageArray);

        listView = (ListView) findViewById(R.id.listviewID);
        listView.setAdapter(adapter);
    }
}
