package com.hipipo.momusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Nowplaying extends AppCompatActivity {
    String theartist;
    String nowPlayingSong;
    Drawable nowPlayingImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowplaying);
        displayartist(theartist, nowPlayingSong, nowPlayingImage);
    }

    public void displayartist(String newartist, String newSong, Drawable imageSong) {
        Intent setartist = getIntent();
        theartist = setartist.getStringExtra("artist");
        nowPlayingSong = setartist.getStringExtra("song");
        String nowImage = setartist.getStringExtra("image");
        int imageId = getResources().getIdentifier(nowImage, "drawable", getPackageName());
        TextView artistSong = (TextView) findViewById(R.id.nowplayingartist);
        TextView playingSong = (TextView) findViewById(R.id.nowPlayingSong);
        ImageView playingImage = (ImageView) findViewById(R.id.songImage);
        artistSong.setText(theartist);
        playingSong.setText(nowPlayingSong);
        playingImage.setImageResource(imageId);
    }

    public void openPlayLIst2(View view) {
        Intent playListScreen2 = new Intent(Nowplaying.this, Playlist.class);
        startActivity(playListScreen2);
    }

    public void openSongDetails2(View view) {
        Intent setartist = getIntent();
        theartist = setartist.getStringExtra("artist");
        nowPlayingSong = setartist.getStringExtra("song");
        Intent songDetailsScreen = new Intent(Nowplaying.this, Details.class);
        songDetailsScreen.putExtra("nowPlayingArtistDetails", theartist);
        songDetailsScreen.putExtra("nowPlayingSongDetails", nowPlayingSong);
        startActivity(songDetailsScreen);

    }
}