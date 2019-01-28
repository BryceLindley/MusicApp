package com.example.bryce.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the sixties category
        TextView Sixties = (TextView) findViewById(R.id.Sixties);

        // Set a click listener on that View
        Sixties.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the sixties category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link sixtiesActivity}
                Intent sixtiesIntent = new Intent(MainActivity.this, sixties.class);

                // Start the new activity
                startActivity(sixtiesIntent);
            }
        });


        // Find the View that shows the seventies category
        TextView Seventies = (TextView) findViewById(R.id.Seventies);

        // Set a click listener on that View
        Seventies.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the seventies category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link seventiesActivity}
                Intent seventiesIntent = new Intent(MainActivity.this, seventies.class);

                startActivity(seventiesIntent);
            }
        });


        // Find the View that shows the eighties category
        TextView Eighties = (TextView) findViewById(R.id.Eighties);

        // Set a click listener on that View
        Eighties.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the eighties category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link eightiesActivity}
                Intent eightiesIntent = new Intent(MainActivity.this, eighties.class);

                // Start the new activity
                startActivity(eightiesIntent);
            }
        });


        // Find the View that shows the nineties category for ListView
        TextView list = (TextView) findViewById(R.id.Nineties);

        // Set a click listener on that View
        list.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the eighties category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link eightiesActivity}
                Intent listIntent = new Intent(MainActivity.this, nineties.class);

                // Start the new activity
                startActivity(listIntent);
            }
        });

    }

}
