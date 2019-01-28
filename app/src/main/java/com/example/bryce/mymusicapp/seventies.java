package com.example.bryce.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class seventies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventies);

        //Create an array of music

        ArrayList<String> musicInSeventies = new ArrayList<String>();
        musicInSeventies.add("Jackson 5");
        musicInSeventies.add("George Harrison");
        musicInSeventies.add("Derrik and the Dominoes");
        musicInSeventies.add("Grateful Dead");
        musicInSeventies.add("Lynn Anderson");
        musicInSeventies.add("Led Zeppelin");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, musicInSeventies);
        //ListView for List
        ListView listView = (ListView)findViewById(R.id.seventiesList);

        listView.setAdapter(itemsAdapter);
    }

    public void backButton(View v) {
        finish();
    }
}
