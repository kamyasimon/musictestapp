package com.hipipo.momusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    String playingSongArtist;
    String playingSongTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        displayNowPlayingDetails(playingSongArtist, playingSongTitle);
    }

    public void displayNowPlayingDetails(String artist, String song) {
        Intent detailsIntent = getIntent();
        playingSongArtist = detailsIntent.getStringExtra("nowPlayingArtistDetails");
        playingSongTitle = detailsIntent.getStringExtra("nowPlayingSongDetails");
        TextView newartist = (TextView) findViewById(R.id.artist);
        TextView newsong = (TextView) findViewById(R.id.song);
        if (playingSongArtist != null && playingSongTitle != null) {
            newartist.setText("ARTIST: " + playingSongArtist);
            newsong.setText("SONG: " + playingSongTitle);
        } else {
            newsong.setText("Select a song in the Playlist to see Details");
        }
    }
}