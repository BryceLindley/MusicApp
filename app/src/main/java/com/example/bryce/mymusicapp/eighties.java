package com.example.bryce.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class eighties extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighties);

        //Create an ArrayList of music

        ArrayList<String> musicInEighties = new ArrayList<String>();
        musicInEighties.add("Bon Jovi");
        musicInEighties.add("Def Leppard");
        musicInEighties.add("Duran Duran");
        musicInEighties.add("Prince");
        musicInEighties.add("Madonna");
        musicInEighties.add("Journey");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, musicInEighties);
        //GridView for List
        GridView listView = (GridView) findViewById(R.id.eightiesList);

        listView.setAdapter(itemsAdapter);
    }

    public void backButton(View v) {
        finish();
    }
}
