package com.example.calmomatic;

import android.app.Notification;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class basicLevel extends AppCompatActivity {
    ImageView iv_11, iv_12, iv_13, iv_14,iv_21, iv_22, iv_23, iv_24;

    //array for images
    Integer[] cardsArray = {101, 102, 103, 104, 201, 202, 203, 204};

    //actual images
    int image101, image102, image103, image104, image201, image202, image203, image204;

    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_level);

        iv_11 = (ImageView) findViewById(R.id.iv_11);
        iv_12 = (ImageView) findViewById(R.id.iv_12);
        iv_13 = (ImageView) findViewById(R.id.iv_13);
        iv_14 = (ImageView) findViewById(R.id.iv_14);
        iv_21 = (ImageView) findViewById(R.id.iv_21);
        iv_22 = (ImageView) findViewById(R.id.iv_22);
        iv_23 = (ImageView) findViewById(R.id.iv_23);
        iv_24 = (ImageView) findViewById(R.id.iv_24);

        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_21.setTag("4");
        iv_22.setTag("5");
        iv_23.setTag("6");
        iv_24.setTag("7");

        //loading card images
        frontOfCardsResources();

        //shuffle the images
        Collections.shuffle(Arrays.asList(cardsArray));

        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_11, theCard);
            }
        });
        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_12, theCard);
            }
        });
        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_13, theCard);
            }
        });
        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_14, theCard);
            }
        });
        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_21, theCard);
            }
        });
        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_22, theCard);
            }
        });
        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_23, theCard);
            }
        });
        iv_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_24, theCard);
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

        //check which image is selected and save to temporary variable
        if(cardNumber == 1){
            firstCard = cardsArray[card];
            if(firstCard > 200){
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickedFirst = card;

            iv.setEnabled(false);
        }else if(cardNumber == 2) {
            secondCard = cardsArray[card];
            if (secondCard > 200) {
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
        //if images are equal, remove them and add points
        if (firstCard == secondCard) {
            if (clickedFirst == 0) {
                iv_11.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 1) {
                iv_12.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 2) {
                iv_13.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 3) {
                iv_14.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 4) {
                iv_21.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 5) {
                iv_22.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 6) {
                iv_23.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 7) {
                iv_24.setVisibility(View.INVISIBLE);
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
        }else{
            iv_11.setImageResource(R.drawable.back);
            iv_12.setImageResource(R.drawable.back);
            iv_13.setImageResource(R.drawable.back);
            iv_14.setImageResource(R.drawable.back);
            iv_21.setImageResource(R.drawable.back);
            iv_22.setImageResource(R.drawable.back);
            iv_23.setImageResource(R.drawable.back);
            iv_24.setImageResource(R.drawable.back);
        }
        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);
        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_23.setEnabled(true);
        iv_24.setEnabled(true);

        //check if the game is over
        checkEnd();
    }
    private void checkEnd(){
        if(iv_11.getVisibility() == View.INVISIBLE &&
                iv_12.getVisibility() == View.INVISIBLE &&
                iv_13.getVisibility() == View.INVISIBLE &&
                iv_14.getVisibility() == View.INVISIBLE &&
                iv_21.getVisibility() == View.INVISIBLE &&
                iv_22.getVisibility() == View.INVISIBLE &&
                iv_23.getVisibility() == View.INVISIBLE &&
                iv_24.getVisibility() == View.INVISIBLE){

            //display random quote after game finishes
           final String[] quoteArray =
                   {"Give your stress wings and let it fly away ~ Terri Guillemets",
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

            AlertDialog.Builder alertDialogueBuilder = new AlertDialog.Builder(basicLevel.this);
            alertDialogueBuilder
                    .setMessage(randomValue)
                    .setCancelable(false)
                    .setPositiveButton("    NEW", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(getApplicationContext(), intermediateLevel.class);
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
        image101 = R.drawable.kenya_resized;
        image102 = R.drawable.southafrica;
        image103 = R.drawable.malawi_resized;
        image104 = R.drawable.sudan_resized;
        image201 = R.drawable.kenya_resized2;
        image202 = R.drawable.southafrica2;
        image203 = R.drawable.malawi_resized2;
        image204 = R.drawable.sudan_resized2;
    }
}
