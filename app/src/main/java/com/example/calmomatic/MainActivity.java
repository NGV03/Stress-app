package com.example.calmomatic;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView tv_p1, tv_p2;

    ImageView iv_11, iv_12, iv_13, iv_14,iv_21, iv_22, iv_23, iv_24,iv_31, iv_32, iv_33, iv_34;

    //array for the images
    Integer[] cardsArray = {101, 102, 103, 104, 105, 106, 201, 202, 203, 204, 205, 206};

    //actual images
    int image101, image102, image103, image104, image105, image106,
            image201, image202, image203, image204, image205, image206;

    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber = 1;
    int turn = 1;
    int playerPoints = 0, cpuPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_p1 = (TextView) findViewById(R.id.tv_p1);
        tv_p2 = (TextView) findViewById(R.id.tv_p2);

        iv_11 = (ImageView) findViewById(R.id.iv_11);
        iv_12 = (ImageView) findViewById(R.id.iv_12);
        iv_13 = (ImageView) findViewById(R.id.iv_13);
        iv_14 = (ImageView) findViewById(R.id.iv_14);
        iv_21 = (ImageView) findViewById(R.id.iv_21);
        iv_22 = (ImageView) findViewById(R.id.iv_22);
        iv_23 = (ImageView) findViewById(R.id.iv_23);
        iv_24 = (ImageView) findViewById(R.id.iv_24);
        iv_31 = (ImageView) findViewById(R.id.iv_31);
        iv_32 = (ImageView) findViewById(R.id.iv_32);
        iv_33 = (ImageView) findViewById(R.id.iv_33);
        iv_34 = (ImageView) findViewById(R.id.iv_34);

        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_21.setTag("4");
        iv_22.setTag("5");
        iv_23.setTag("6");
        iv_24.setTag("7");
        iv_31.setTag("8");
        iv_32.setTag("9");
        iv_33.setTag("10");
        iv_34.setTag("11");

        //loading card images
        frontOfCardsResources();

        //shuffle the images
        Collections.shuffle(Arrays.asList(cardsArray));

        //changing the color of second player inactive
        tv_p2.setTextColor(Color.GRAY);

        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        iv_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        iv_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        iv_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        iv_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        iv_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private void frontOfCardsResources(){
        image101 = R.drawable.image_101;
        image102 = R.drawable.image_102;
        image103 = R.drawable.image_103;
        image104 = R.drawable.image_104;
        image105 = R.drawable.image_105;
        image106 = R.drawable.image_106;
        image201 = R.drawable.image_201;
        image202 = R.drawable.image_202;
        image203 = R.drawable.image_203;
        image204 = R.drawable.image_204;
        image205 = R.drawable.image_205;
        image206 = R.drawable.image_206;
    }
}
