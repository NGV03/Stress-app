package com.example.calmomatic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class helpline extends AppCompatActivity {

    String[] nameArray = {"Mental Health","Low Down","Anxiety NZ Trust","Samaritans"};

    String[] infoArray = {
            "0800 543 354",
            "0800 111 757",
            "0800 233 269",
            "0800 726 666",

    };

    Integer[] imageArray = {
            R.drawable.mentalhealthr,
            R.drawable.lowdownr,
            R.drawable.anxietyr,
            R.drawable.samaritansr
    };
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpline);

        CustomListAdapter adapter = new CustomListAdapter(this, nameArray, infoArray, imageArray);
        listView = (ListView) findViewById(R.id.listviewID);
        listView.setAdapter(adapter);


    }
}
