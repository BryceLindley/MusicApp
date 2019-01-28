package com.example.bryce.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class nineties extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nineties);


        //Create an array of 90's music
        ArrayList<String> musicInNineties = new ArrayList<String>();
        musicInNineties.add("Nirvana");
        musicInNineties.add("OffSpring");
        musicInNineties.add("Sublime");
        musicInNineties.add("Limp Bizkit");
        musicInNineties.add("No Doubt");
        musicInNineties.add("Green Day");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, musicInNineties);
        //GridView for List
        GridView listView = (GridView) findViewById(R.id.gridList);

        listView.setAdapter(itemsAdapter);
    }

    public void backButton(View v) {
        finish();
    }
}
