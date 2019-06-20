package com.example.calmomatic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Music extends AppCompatActivity {

    /**
     * Variables
     */
    MediaPlayer mp  = null;
    String harpMusic  = "Harp Music";
    String pianoMusic = "Piano Music";
    String pianoMusic2  = "Piano Music 2";
    String softPiano = "Soft Piano";
    String relaxingMusic  = "Relaxing Music";
    String tuneMusic = "Tune Music";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        /**
         * Talking with the buttonOne
         */
        final Button buttonHello = (Button) findViewById(R.id.idHarp);
        buttonHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                managerOfSound(harpMusic);
            } // END onClick()
        }); // END buttonOne

        /**
         * Talking with the buttonTwo
         */
        final Button buttonGoodBye = (Button) findViewById(R.id.idPiano);
        buttonGoodBye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                managerOfSound(pianoMusic);
                ;
            } // END onClick()
        }); // END buttonTwo

        /**
         * Talking with the buttonThree
         */
        final Button buttonThree = (Button) findViewById(R.id.idPiano2);
        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                managerOfSound(pianoMusic2);
            } // END onClick()
        }); // END buttonThree

        /**
         * Talking with the buttonFour
         */
        final Button buttonFour = (Button) findViewById(R.id.idSoftPiano);
        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                managerOfSound(softPiano);
            } // END onClick()
        }); // END buttonFour

        /**
         * Talking with the buttonFive
         */
        final Button buttonFive = (Button) findViewById(R.id.idRelaxingMusic);
        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                managerOfSound(relaxingMusic);
            } // END onClick()
        }); // END buttonFive

        /**
         * Talking with the buttonSix
         */
        final Button buttonSix = (Button) findViewById(R.id.idTuneMusic);
        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                managerOfSound(tuneMusic);
            } // END onClick()
        }); // END buttonSix
    } // END onCreate()

    /**
     * Manager of Sounds
     */
    protected void managerOfSound(String theText) {
        if (mp != null) {
            mp.reset();
            mp.release();
        }
        if (theText == harpMusic)
            mp = MediaPlayer.create(this, R.raw.harp_music);
        else if (theText == pianoMusic)
            mp = MediaPlayer.create(this, R.raw.piano_music);
        else if (theText == pianoMusic2)
            mp = MediaPlayer.create(this, R.raw.piano_music_free);
        else if (theText == softPiano)
            mp = MediaPlayer.create(this, R.raw.soft_piano_music);
        else if (theText == relaxingMusic)
            mp = MediaPlayer.create(this, R.raw.soul_relaxing_music);
        else if (theText == tuneMusic)
            mp = MediaPlayer.create(this, R.raw.tune_chill);
        else
            mp = MediaPlayer.create(this, R.raw.piano_music);
        mp.start();
    }

    @Override
    public void onBackPressed ()
    {
        if (mp != null)
            mp.stop();
        super.onBackPressed();
    }
}
