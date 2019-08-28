package com.mikevogel;

import java.util.ArrayList;

public class Album {

    private String title;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public void addToAlbum(Song song){
        this.songs.add(song);
    }

    public void printTracks(){
        System.out.println("Track listing for " + this.title + ": ");
        for(int i = 0; i < songs.size(); i++){
            System.out.println((i+1) + ". " + songs.get(i).getTitle());
        }
    }

    public boolean containsSong(Song song){
        for(int i = 0; i < songs.size(); i++){
            if(songs.get(i).getTitle().equals(song.getTitle())){
                return true;
            }
        }
        return false;
    }


}

// Create a program that implements a playlist for songs

// Create a Song class having Title and Duration for a song.

// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList

// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.

// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()
