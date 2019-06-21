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

public class advancedLevel extends AppCompatActivity {
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
        setContentView(R.layout.activity_advanced_two);

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
                      "Don’t Let Yesterday Take Up Too Much Of Today. – Will Rogers",
                        "You Learn More From Failure Than From Success. Don’t Let It Stop You. Failure Builds Character. – Unknown",
                        "If You Are Working On Something That You Really Care About, You Don’t Have To Be Pushed. The Vision Pulls You. – Steve Jobs",
                        "Failure Will Never Overtake Me If My Determination To Succeed Is Strong Enough. – Og Mandino",
                        "Your mind will answer most questions if you learn to relax and wait for the answer. –William Burroughs",
                        "Life isn’t as serious as the mind makes it out to be. –Eckhart Tolle",
                        "Give your stress wings and let if fly away. –Terri Guillemets",
                        "There is more to life than increasing its speed. –Mohandas Gandhi",
                        "Sometimes the most productive thing you can do is relax. –Mark Black",
                        "You don’t always need a plan.  Sometimes you just need to breathe, trust, let go and see what happens. –Mandy Hale",
                        "Nothing can bring you peace but yourself. –Ralph Waldo Emerson",
                        "Your calm mind is the ultimate weapon against your challenges.  So relax. –Bryant McGill",
                        "Slow down and everything you are chasing will come around and catch you. –John De Paola",
                        "The time to relax is when you don’t have time for it. –Sydney Harris",
                        "There is a calmness to a life lived in gratitude, a quiet joy. –Ralph Blum",
                        "Calm mind brings inner strength and self-confidence, so that’s very important for good health. –Dalai Lama",
                        "Calmness is the cradle of power. —Josiah Gilbert Holland",
                        "Set peace of mind as your highest goal, and organize your life around it. —Brian Tracy",
                        "The greatest weapon against stress is our ability to choose one thought over another. —William James.",
                        "Breathe. Let go. And remind yourself that this very moment is the only one you know you have for sure. —Oprah Winfrey",
                        "When you realize how perfect everything is you will tilt your head back and laugh at the sky. —Buddha",
                        "We May Encounter Many Defeats But We Must Not Be Defeated. – Maya Angelou",
                        "We Generate Fears While We Sit. We Overcome Them By Action. – Dr. Henry Link",
                        "Do What You Can With All You Have, Wherever You Are. – Theodore Roosevelt",
                        "You Are Never Too Old To Set Another Goal Or To Dream A New Dream. – C.S. Lewis",
                        "Today’s Accomplishments Were Yesterday’s Impossibilities. – Robert H. Schuller",
                        "There Are No Limits To What You Can Accomplish, Except The Limits You Place On Your Own Thinking. – Brian Tracy"

                    };

            //generate random value from array list
            String randomValue = quoteArray[(int) Math.floor(Math.random() * quoteArray.length)];

            AlertDialog.Builder alertDialogueBuilder = new AlertDialog.Builder(advancedLevel.this);
            alertDialogueBuilder
                    .setMessage(randomValue)
                    .setCancelable(false)
                    .setPositiveButton("    NEW", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(getApplicationContext(), advancedLevel.class);
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
        image101 = R.drawable.image1;
        image102 = R.drawable.image2;
        image103 = R.drawable.image3;
        image104 = R.drawable.image4;
        image105 = R.drawable.image5;
        image106 = R.drawable.image6;
        image107 = R.drawable.image7;
        image108 = R.drawable.image8;
        image201 = R.drawable.image1a;
        image202 = R.drawable.image2a;
        image203 = R.drawable.image3a;
        image204 = R.drawable.image4a;
        image205 = R.drawable.image5a;
        image206 = R.drawable.image6a;
        image207 = R.drawable.image7a;
        image208 = R.drawable.image8a;

    }
}

