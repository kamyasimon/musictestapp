package com.hipipo.momusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openPlayLIst();
        openSongDetails();
    }

    //Open Playlist Intent
    public void openPlayLIst() {
        ImageView playlist = (ImageView) findViewById(R.id.playlist);
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playListScreen = new Intent(MainActivity.this, Playlist.class);
                startActivity(playListScreen);
            }
        });
    }

    //Open Song Details Intent
    public void openSongDetails() {
        ImageView songDetails = (ImageView) findViewById(R.id.songDetails);
        songDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songDetailsScreen = new Intent(MainActivity.this, Details.class);
                startActivity(songDetailsScreen);
            }
        });
    }
}