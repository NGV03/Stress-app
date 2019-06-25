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

    public void cardInfo(View view) {
        if(view.getId() == R.id.info)
        {
            //When user clicks music card, launch new screen
            Intent intent = new Intent(Home.this, Information.class);
            startActivity(intent);
        }
    }


    public void cardFive(View view) {
        if(view.getId() == R.id.card5)
        {
            //When user clicks music card, launch new screen
            Intent intent = new Intent(Home.this, Music.class);
            startActivity(intent);
        }
    }


    public void cardTop(View view) {
        if(view.getId() == R.id.cardTop)
        {
            //When user clicks music card, launch new screen
            Intent intent = new Intent(Home.this, Game.class);
            startActivity(intent);
        }
    }


}
