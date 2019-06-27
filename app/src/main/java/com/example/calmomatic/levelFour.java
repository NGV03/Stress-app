package com.example.calmomatic;


import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.util.Arrays;
import java.util.Collections;

public class levelFour extends AppCompatActivity {

    private static int SPLASH_TIMEOUT = 4000;

    ImageView iv_11, iv_12, iv_13, iv_14,iv_21, iv_22, iv_23, iv_24,
            iv_31, iv_32, iv_33, iv_34,iv_41, iv_42, iv_43, iv_44;

    //array for the images
    Integer[] cardsArray = {101, 102, 103, 104, 105, 106, 107, 108,
            201, 202, 203, 204, 205, 206, 207, 208};

    //actual images
    int image101, image102, image103, image104, image105, image106,image107, image108,
            image201, image202, image203, image204, image205, image206, image207, image208;

    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.flipcard);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_four);

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
        iv_41 = (ImageView) findViewById(R.id.iv_41);
        iv_42 = (ImageView) findViewById(R.id.iv_42);
        iv_43 = (ImageView) findViewById(R.id.iv_43);
        iv_44 = (ImageView) findViewById(R.id.iv_44);

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
        iv_41.setTag("12");
        iv_42.setTag("13");
        iv_43.setTag("14");
        iv_44.setTag("15");

        //loading card images
        frontOfCardsResources();

        //rand the images
        Collections.shuffle(Arrays.asList(cardsArray));

        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                mp.start();
                doStuff(iv_11, theCard);
            }
        });
        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                mp.start();
                doStuff(iv_12, theCard);
            }
        });
        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                mp.start();
                doStuff(iv_13, theCard);
            }
        });
        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                mp.start();
                doStuff(iv_14, theCard);
            }
        });
        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                mp.start();
                doStuff(iv_21, theCard);
            }
        });
        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                mp.start();
                doStuff(iv_22, theCard);
            }
        });
        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                mp.start();
                doStuff(iv_23, theCard);
            }
        });
        iv_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                mp.start();
                doStuff(iv_24, theCard);
            }
        });
        iv_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                mp.start();
                doStuff(iv_31, theCard);
            }
        });
        iv_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                mp.start();
                doStuff(iv_32, theCard);
            }
        });
        iv_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                mp.start();
                doStuff(iv_33, theCard);
            }
        });
        iv_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                mp.start();
                doStuff(iv_34, theCard);
            }
        });
        iv_41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                mp.start();
                doStuff(iv_41, theCard);
            }
        });
        iv_42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                mp.start();
                doStuff(iv_42, theCard);
            }
        });
        iv_43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                mp.start();
                doStuff(iv_43, theCard);
            }
        });
        iv_44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                mp.start();
                doStuff(iv_44, theCard);
            }
        });

    }

    private void doStuff(ImageView iv, int card) {
        //set the correct image to the image view
        if (cardsArray[card] == 101){
            iv.setImageResource(image101);
        }else if (cardsArray[card] == 102){
            iv.setImageResource(image102);
        }
        else if (cardsArray[card] == 103){
            iv.setImageResource(image103);
        }
        else if (cardsArray[card] == 104){
            iv.setImageResource(image104);
        }
        else if (cardsArray[card] == 105){
            iv.setImageResource(image105);
        }
        else if (cardsArray[card] == 106){
            iv.setImageResource(image106);
        }
        else if (cardsArray[card] == 107){
            iv.setImageResource(image107);
        }
        else if (cardsArray[card] == 108){
            iv.setImageResource(image108);
        }
        else if (cardsArray[card] == 201){
            iv.setImageResource(image201);
        }
        else if (cardsArray[card] == 202){
            iv.setImageResource(image202);
        }
        else if (cardsArray[card] == 203){
            iv.setImageResource(image203);
        }
        else if (cardsArray[card] == 204){
            iv.setImageResource(image204);
        }
        else if (cardsArray[card] == 205){
            iv.setImageResource(image205);
        }
        else if (cardsArray[card] == 206){
            iv.setImageResource(image206);
        }
        else if (cardsArray[card] == 207){
            iv.setImageResource(image207);
        }
        else if (cardsArray[card] == 208){
            iv.setImageResource(image208);
        }

        //check which image is selected and save to temporary variable
        if(cardNumber == 1){
            firstCard = cardsArray[card];
            if(firstCard > 200){
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickedFirst = card;

            iv.setEnabled(false);
        }else if(cardNumber == 2){
            secondCard = cardsArray[card];
            if(secondCard > 200){
                secondCard = secondCard - 100;
            }
            cardNumber = 1;
            clickedSecond = card;

            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);
            iv_23.setEnabled(false);
            iv_24.setEnabled(false);
            iv_31.setEnabled(false);
            iv_32.setEnabled(false);
            iv_33.setEnabled(false);
            iv_34.setEnabled(false);
            iv_41.setEnabled(false);
            iv_42.setEnabled(false);
            iv_43.setEnabled(false);
            iv_44.setEnabled(false);


            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //check if selected images are equal
                    calculate();
                }
            }, 1000);
        }
    }

    private void calculate() {
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.correct);
        if(firstCard == secondCard){
            if(clickedFirst == 0){
                iv_11.setVisibility(View.INVISIBLE);
                mp.start();
            }else if(clickedFirst == 1){
                iv_12.setVisibility(View.INVISIBLE);
                mp.start();
            }
            else if(clickedFirst == 2){
                iv_13.setVisibility(View.INVISIBLE);
                mp.start();
            }
            else if(clickedFirst == 3){
                iv_14.setVisibility(View.INVISIBLE);
                mp.start();
            }
            else if(clickedFirst == 4){
                iv_21.setVisibility(View.INVISIBLE);
                mp.start();
            }
            else if(clickedFirst == 5){
                iv_22.setVisibility(View.INVISIBLE);
                mp.start();
            }
            else if(clickedFirst == 6){
                iv_23.setVisibility(View.INVISIBLE);
                mp.start();
            }
            else if(clickedFirst == 7){
                iv_24.setVisibility(View.INVISIBLE);
                mp.start();
            }
            else if(clickedFirst == 8){
                iv_31.setVisibility(View.INVISIBLE);
                mp.start();
            }
            else if(clickedFirst == 9){
                iv_32.setVisibility(View.INVISIBLE);
                mp.start();
            }
            else if(clickedFirst == 10){
                iv_33.setVisibility(View.INVISIBLE);
                mp.start();
            }
            else if(clickedFirst == 11){
                iv_34.setVisibility(View.INVISIBLE);
                mp.start();
            }
            else if(clickedFirst == 12){
                iv_41.setVisibility(View.INVISIBLE);
                mp.start();
            }
            else if(clickedFirst == 13){
                iv_42.setVisibility(View.INVISIBLE);
                mp.start();
            }
            else if(clickedFirst == 14){
                iv_43.setVisibility(View.INVISIBLE);
                mp.start();
            }
            else if(clickedFirst == 15){
                iv_44.setVisibility(View.INVISIBLE);
                mp.start();
            }


            if(clickedSecond == 0){
                iv_11.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 1){
                iv_12.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 2){
                iv_13.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 3){
                iv_14.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 4){
                iv_21.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 5){
                iv_22.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 6){
                iv_23.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 7){
                iv_24.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 8){
                iv_31.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 9){
                iv_32.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 10){
                iv_33.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 11){
                iv_34.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 12){
                iv_41.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 13){
                iv_42.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 14){
                iv_43.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 15){
                iv_44.setVisibility(View.INVISIBLE);
            }


        }else{
            iv_11.setImageResource(R.drawable.back);
            iv_12.setImageResource(R.drawable.back);
            iv_13.setImageResource(R.drawable.back);
            iv_14.setImageResource(R.drawable.back);
            iv_21.setImageResource(R.drawable.back);
            iv_22.setImageResource(R.drawable.back);
            iv_23.setImageResource(R.drawable.back);
            iv_24.setImageResource(R.drawable.back);
            iv_31.setImageResource(R.drawable.back);
            iv_32.setImageResource(R.drawable.back);
            iv_33.setImageResource(R.drawable.back);
            iv_34.setImageResource(R.drawable.back);
            iv_41.setImageResource(R.drawable.back);
            iv_42.setImageResource(R.drawable.back);
            iv_43.setImageResource(R.drawable.back);
            iv_44.setImageResource(R.drawable.back);
            MediaPlayer mpp = MediaPlayer.create(getApplicationContext(), R.raw.wrong);
            mpp.start();


        }
        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);
        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_23.setEnabled(true);
        iv_24.setEnabled(true);
        iv_31.setEnabled(true);
        iv_32.setEnabled(true);
        iv_33.setEnabled(true);
        iv_34.setEnabled(true);
        iv_41.setEnabled(true);
        iv_42.setEnabled(true);
        iv_43.setEnabled(true);
        iv_44.setEnabled(true);

        //check if the game is over
        checkEnd();
    }

    private void checkEnd() {
        if(iv_11.getVisibility() == View.INVISIBLE &&
                iv_12.getVisibility() == View.INVISIBLE &&
                iv_13.getVisibility() == View.INVISIBLE &&
                iv_14.getVisibility() == View.INVISIBLE &&
                iv_21.getVisibility() == View.INVISIBLE &&
                iv_22.getVisibility() == View.INVISIBLE &&
                iv_23.getVisibility() == View.INVISIBLE &&
                iv_24.getVisibility() == View.INVISIBLE &&
                iv_31.getVisibility() == View.INVISIBLE &&
                iv_32.getVisibility() == View.INVISIBLE &&
                iv_33.getVisibility() == View.INVISIBLE &&
                iv_34.getVisibility() == View.INVISIBLE &&
                iv_41.getVisibility() == View.INVISIBLE &&
                iv_42.getVisibility() == View.INVISIBLE &&
                iv_43.getVisibility() == View.INVISIBLE &&
                iv_44.getVisibility() == View.INVISIBLE){


            //display random quote after game finishes
            final String[] quoteArray =
                    {
                            "Give your stress wings and let it fly away ~ Terri Guillemets",
                            "It’s not the load that breaks you down, it’s the way you carry it ~ Lou Holtz",
                            "You are braver than you believe, stronger than you seem and smarter than you think! ~ Christopher Robin",
                            "Don’t stress the could haves, if it should have, i would have. ~ Unknown",
                            "For fast-acting relief, try slowing down. ~ Lily Tomlin",
                            "The comeback is always stronger than the setback ~ Dr. Jill Murray",
                            "Grow through what you go through ~ Tyrese Gibson",
                            "Was it a bad day? Or was it a bad five minutes that you milked all day? ~Unknown",
                            "A smooth sea never made a skilled sailor ~ Franklin D. Roosevelt",
                            "We may encounter many defeats but we must not be defeated. ~ Maya Angelou",
                            "Do something today that your future self will thank you for. ~Sean Patrick Flanery",
                            "Say No to the demands of the world. Say Yes to the longing of your own heart. ~Johnathan Lockwood Huie ",
                            "Tension is who you think you should be. Relaxation is who you are. ~Chinese Proverbs",
                            "Why feel blue when there’s so many other colors you can feel. ~ Karen Salmansohn",
                            "Stressed spelled backwards is desserts. ~Loretta Laroche",
                            "Difficult roads often lead to beautiful destinations. The best is yet to come. ~ Zig Ziglar",
                            "Just when the caterpillar thought the world was ending, he turned into a butterfly. ~ Proverbs",
                            "The greatest weapon against stress is our ability to choose one thought over another. ~ William James",
                            "Rule number one is, don’t sweat the small stuff. Rule number two is, it’s all small stuff. ~Robert Elliot",
                            "If stress burned calories, I’d be a supermodel. - Unknown",
                            "Dear Stress, let’s break up. ~Dr. Christina Hebbert",
                            "Be with those who bring out the best in you, not the stress in you. ~Unknown",
                            "Trust yourself. You’ve survived a lot, and you’ll survive whatever is coming. ~Thich Nhat Hanh",
                            "Keep walking through the storm. Your rainbow is waiting on the other side. ~Heather Stillufsen ",
                            "Do not rent out your brain to stress and fear, they do not pay. ~Rajesh Walecha",
                            "The struggle you’re in today is developing the strength you need for tomorrow. ~Robert Tew",
                            "Good things take time ~John Wooden",
                            "Stop focusing on how stressed you are and remember how blessed you are. ~ Anonymous."

                    };

            //generate random value from array list
            String randomValue = quoteArray[(int) Math.floor(Math.random() * quoteArray.length)];

            AlertDialog.Builder alertDialogueBuilder = new AlertDialog.Builder(levelFour.this);
            alertDialogueBuilder
                    .setMessage(randomValue)
                    .setCancelable(false)
                    .setPositiveButton("    NEW", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(getApplicationContext(), levelFive.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });

            AlertDialog alertDialogue = alertDialogueBuilder.create();
            alertDialogue.show();
        }

    }

    private void frontOfCardsResources() {
        image101 = R.drawable.dice1;
        image102 = R.drawable.dice2;
        image103 = R.drawable.dice3;
        image104 = R.drawable.dice4;
        image105 = R.drawable.dice5;
        image106 = R.drawable.dice6;
        image107 = R.drawable.dice7;
        image108 = R.drawable.dice8;
        image201 = R.drawable.dice1a;
        image202 = R.drawable.dice2a;
        image203 = R.drawable.dice3a;
        image204 = R.drawable.dice4a;
        image205 = R.drawable.dice5a;
        image206 = R.drawable.dice6a;
        image207 = R.drawable.dicd7a;
        image208 = R.drawable.dice8a;

    }
}
