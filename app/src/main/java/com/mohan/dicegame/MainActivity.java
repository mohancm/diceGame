package com.mohan.dicegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = (Button) findViewById(R.id.roll_button);

        final ImageView leftDie = (ImageView) findViewById(R.id.dice_left);
        final ImageView righDie = (ImageView) findViewById(R.id.dice_right);

        final int[] diceArray = {
                R.drawable.ic_dice_1,
                R.drawable.ic_dice_2,
                R.drawable.ic_dice_3,
                R.drawable.ic_dice_4,
                R.drawable.ic_dice_5,
                R.drawable.ic_dice_6
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNuberGenerator = new Random();
                int number = randomNuberGenerator.nextInt(6);
                Log.v("App Fired Up!!", "Dice are Throwing fine " + number);

                leftDie.setImageResource(diceArray[number]);

                number = randomNuberGenerator.nextInt(6);

                righDie.setImageResource(diceArray[number]);

            }
        });
    }
}