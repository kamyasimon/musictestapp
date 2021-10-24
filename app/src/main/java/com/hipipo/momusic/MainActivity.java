package com.hipipo.momusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openPlayLIst(View view) {
        Intent playListScreen = new Intent(this,Playlist.class);
        startActivity(playListScreen);
    }

    public void openSongDetails(View view) {
        Intent songDetailsScreen = new Intent(this,Details.class);
        startActivity(songDetailsScreen);
    }
}