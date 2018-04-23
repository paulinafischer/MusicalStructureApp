package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find the View that shows the heavyMetal category
        TextView heavyMetal = (TextView) findViewById(R.id.heavyMetal);

        // Set a click listener on that View
        heavyMetal.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link HeavyMetalsActivity}
                Intent heavyMetalIntent = new Intent(MainActivity.this, HeavyMetalActivity.class);

                // Start the new activity
                startActivity(heavyMetalIntent);
            }
        });

        // Find the View that shows the blackMetal category
        TextView blackMetal = (TextView) findViewById(R.id.blackMetal);

        // Set a click listener on that View
        blackMetal.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the blackMetal category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BlackMetalActivity}
                Intent blackMetalIntent = new Intent(MainActivity.this, BlackMetalActivity.class);

                // Start the new activity
                startActivity(blackMetalIntent);
            }
        });

        // Find the View that shows the deathMetal category
        TextView deathMetal = (TextView) findViewById(R.id.deathMetal);

        // Set a click listener on that View
        deathMetal.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the deathMetal category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link DeathMetalActivity}
                Intent deathMetalIntent = new Intent(MainActivity.this,DeathMetalActivity.class);

                // Start the new activity
                startActivity(deathMetalIntent);
            }
        });
    }
}
