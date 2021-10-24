package com.hipipo.momusic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;

public class Playlist extends AppCompatActivity {
int playListItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

       // String[] playlist= new String [] {"kamya","simon","peter"};
       // Log.i("Playlist", "playlist[1]");

        ArrayList<Songs> myPlaylist = new ArrayList<Songs>();
            myPlaylist.add(new Songs("Thats the way it is","Lucky Dube"));
            myPlaylist.add(new Songs("Prisoner","Luck Dube"));
            myPlaylist.add(new Songs("Ohana","Nettson"));
            myPlaylist.add(new Songs("Candy Land 1","Tobu"));
            myPlaylist.add(new Songs("Your Song","Elton John"));

         //  playListItems = myPlaylist.size();
       // Log.i("Playlist",myPlaylist.get(0));
       // LinearLayout playListItems = (LinearLayout) findViewById(R.id.playlistItems);
        songsAdapter itemsAdapter = new songsAdapter(this,myPlaylist);

        ListView listView = (ListView) findViewById(R.id.playlistItems);

        listView.setAdapter(itemsAdapter);




    }
}
