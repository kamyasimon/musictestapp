package com.hipipo.momusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Playlist extends AppCompatActivity {
    int playListItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);
        ArrayList<Songs> myPlaylist = new ArrayList<Songs>();
        myPlaylist.add(new Songs(getString(R.string.song1), getString(R.string.artist1)));
        myPlaylist.add(new Songs(getString(R.string.song2), getString(R.string.artist2)));
        myPlaylist.add(new Songs(getString(R.string.song3), getString(R.string.artist3)));
        myPlaylist.add(new Songs(getString(R.string.song4), getString(R.string.artist4)));
        myPlaylist.add(new Songs(getString(R.string.song5), getString(R.string.artist5)));

        songsAdapter itemsAdapter = new songsAdapter(this, myPlaylist);

        ListView listView = (ListView) findViewById(R.id.playlistItems);

        listView.setAdapter(itemsAdapter);

        String[] image = new String[]{"ma", "mb", "mc", "md", "me"};

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //get the current song from the ArrayList (songs) with the position of the clicked item.
                Songs currentPlayingSong = myPlaylist.get(position);
                //get the song name and artist name from the currentPlayingSong object
                String artistName = currentPlayingSong.getSongArtist();
                String playingSong = currentPlayingSong.getSongTitle();
                String songImage = image[position];
                Intent nowPlayinScreen = new Intent(view.getContext(), Nowplaying.class);
                nowPlayinScreen.putExtra("artist", artistName);
                nowPlayinScreen.putExtra("song", playingSong);
                nowPlayinScreen.putExtra("image", songImage);
                startActivity(nowPlayinScreen);
            }
        });
    }
}
