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

public class sixties extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixties);


        //Create an array of 90's music
        ArrayList<Song> musicInSixties = new ArrayList<Song>();
        musicInSixties.add(new Song ("Andre Hill", "Point of Departure"));
        musicInSixties.add(new Song ("Dusty Springfield", "Dusty in Memphis"));
        musicInSixties.add(new Song ("The Rolling Stones", "Let it Bleed"));
        musicInSixties.add(new Song ("The Beatles", "Abbey Road"));
        musicInSixties.add(new Song ("Eric Dolphy", "Out to Lunch"));


        MusicAdapter adapter = new MusicAdapter(this, musicInSixties);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

    public void backButton(View v)
    {
        finish();
    }
}



