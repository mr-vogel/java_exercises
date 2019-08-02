package com.mikevogel;

public class Room {

    private Couch theCouch;
    private Bookshelf theBookshelf;
    private TV theTV;

    public Room(Couch theCouch, Bookshelf theBookshelf, TV theTV) {
        this.theCouch = theCouch;
        this.theBookshelf = theBookshelf;
        this.theTV = theTV;
    }

    public Couch getTheCouch() {
        return theCouch;
    }

    public Bookshelf getTheBookshelf() {
        return theBookshelf;
    }

    public TV getTheTV() {
        return theTV;
    }

    public void hide(String object){
        System.out.println("You hid " + object);
    }
}


/*
        // Create a single room of a house using composition.
        // Think about the things that should be included in the room.

        // Maybe physical parts of the house but furniture as well

        // Add at least one method to access an object via a getter and
        // then that objects public method as you saw in the previous video

        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        // like you saw in this video.
 */