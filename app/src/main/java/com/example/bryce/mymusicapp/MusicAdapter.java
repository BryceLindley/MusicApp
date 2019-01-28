package com.example.bryce.mymusicapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter<Song> {

    public MusicAdapter(Activity context, ArrayList<Song> musicInSixties) {
        super(context, 0, musicInSixties);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (convertView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        }
        Song currentWord = getItem(position);

        TextView songTextView = (TextView) listItemView.findViewById(R.id.songs_text_view);

        songTextView.setText(currentWord.getSong());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView albumTextView = (TextView) listItemView.findViewById(R.id.albums_text_view);

        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        albumTextView.setText(currentWord.getAlbum());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
