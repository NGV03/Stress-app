package com.example.calmomatic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void cardTwo(View view) {
        if(view.getId() == R.id.card2)
        {
            //When user clicks intermediate card, launch new screen
            Intent intent = new Intent(Home.this, intermediateLevel.class);
            startActivity(intent);
        }
    }
}
