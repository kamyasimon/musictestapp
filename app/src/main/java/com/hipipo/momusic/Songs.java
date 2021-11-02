package com.hipipo.momusic;

public class Songs {
    private String songTitle;
    private String songArtist;

    public Songs(String songTitle, String songArtist) {
        this.songTitle = songTitle;
        this.songArtist = songArtist;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public String getSongArtist() {
        return songArtist;
    }

}
