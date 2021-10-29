package com.hipipo.momusic;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;

public class Playlist extends AppCompatActivity {
int playListItems;
    Nowplaying nowplaying = new Nowplaying();
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

        /*TextView getsongdets = (TextView) findViewById(R.id.songnames);
        MainActivity main = new MainActivity();
        getsongdets.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
             getParentActivityIntent();
            }
        });*/

        listView.setOnClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent nowPlayinScreen = new Intent(view.getContext(),Nowplaying);
                startActivity(nowPlayinScreen);
            }
        });

    }

}
