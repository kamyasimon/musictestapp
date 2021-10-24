package com.hipipo.momusic;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class songsAdapter extends ArrayAdapter<Songs> {

    public songsAdapter(Context context, ArrayList <Songs> Songs) {
        super(context, 0,Songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.sublist, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Songs currentSongs = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView songnameTextView = (TextView) listItemView.findViewById(R.id.songnames);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        songnameTextView.setText(currentSongs.getSongTitle());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView songartistView = (TextView) listItemView.findViewById(R.id.artists);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        songartistView.setText(currentSongs.getSongArtist());


        return listItemView;
    }
}

