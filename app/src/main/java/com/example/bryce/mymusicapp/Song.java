package com.example.bryce.mymusicapp;

public class Song {
    /** Song */
    private String mSong;
    /** Album */
    private String mAlbum;
    /**
     * Create a new Song object.
     *
     * @param song is the song in the album
     *
     * @param album of the song
     */
    public Song(String song, String album) {
        mSong = song;
        mAlbum = album;
    }
    /**
     * Get the song of the album.
     */
    public String getSong() {
        return mSong;
    }
    /**
     * Get the Album of the song.
     */
    public String getAlbum() {
        return mAlbum;
    }
}