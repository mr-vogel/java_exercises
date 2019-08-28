package com.mikevogel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static LinkedList<Song> playList = new LinkedList<Song>();
    private static Song song1 = new Song("Jazz Song", 1.42);
    private static Song song2 = new Song("Funk Song", 4.13);
    private static Song song3 = new Song("Soul Song", 3.42);
    private static Song song4 = new Song("Rock Song", 5.02);
    private static Song song5 = new Song("Metal Song", 5.67);
    private static Song song6 = new Song("Death Metal Song", 6.66);
    private static Album mix1 = new Album("Mix 1", "Random");
    private static Album mix2 = new Album("Mix 2", "Don Funk");
    private static ArrayList<Album> albums = new ArrayList<Album>();


    public static void main(String[] args) {
        mix1.addToAlbum(song1);
        mix1.addToAlbum(song2);
        mix1.addToAlbum(song3);

        mix2.addToAlbum(song4);
        mix2.addToAlbum(song5);
        mix2.addToAlbum(song6);

        albums.add(mix1);
        albums.add(mix2);

        addToPlaylist(song1, albums);
        addToPlaylist(song2, albums);
        addToPlaylist(song3, albums);
        addToPlaylist(song4, albums);
        addToPlaylist(song5, albums);
        addToPlaylist(song6, albums);

        play(playList);


    }

    private static void play(LinkedList<Song> linkedList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = linkedList.listIterator();

        if (linkedList.isEmpty()) {
            System.out.println("Playlist is empty");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().getTitle());
            printActions();
        }


        while (!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nQuitting application...");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().getTitle());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().getTitle());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().getTitle());
                            goingForward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().getTitle());
                            goingForward = true;
                        } else {
                            System.out.println("You reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < linkedList.size(); i++) {
                        System.out.println((i + 1) + ". " + linkedList.get(i).getTitle() + " : " + linkedList.get(i).getDuration());
                    }
                    break;
                case 5:
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next().getTitle());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous().getTitle());

                        }
                    }
                    break;
                case 6:
                    printActions();
                    break;
            }
        }

    }


    public static boolean addToPlaylist(Song song, ArrayList<Album> albums) {
        for (int i = 0; i < albums.size(); i++) {
            if (albums.get(i).containsSong(song)) {
                playList.add(song);
                return true;
            }
        }
        System.out.println("You do not own this song, can't add to playlist.");
        return false;
    }

    public static void printActions() {
        System.out.println("\nAvailable actions: \npress");
        System.out.println("\t 0 - to quit");
        System.out.println("\t 1 - go to next song");
        System.out.println("\t 2 - go to previous song");
        System.out.println("\t 3 - replay the current song");
        System.out.println("\t 4 - list songs in the playlist");
        System.out.println("\t 5 - remove current song from playlist");
        System.out.println("\t 6 - to print a list of available actions");
        System.out.println("Choose your action: ");
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