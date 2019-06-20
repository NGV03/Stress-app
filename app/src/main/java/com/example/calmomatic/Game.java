package com.example.calmomatic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Game extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }
        public void cardOne (View view){
            if (view.getId() == R.id.card1) {
                //When user clicks beginner card, launch new screen
                Intent intent = new Intent(Game.this, basicLevel.class);
                startActivity(intent);
            }
        }

        public void cardTwo (View view){
            if (view.getId() == R.id.card2) {
                //When user clicks intermediate card, launch new screen
                Intent intent = new Intent(Game.this, intermediateLevel.class);
                startActivity(intent);
            }
        }


        public void cardThree (View view){
            if (view.getId() == R.id.card3) {
                //When user clicks advanced card, launch new screen
                Intent intent = new Intent(Game.this, advancedLevel.class);
                startActivity(intent);
            }
        }




}