package com.mikevogel;

public class Main {

    public static void main(String[] args) {
//        Dimensions dimensions = new Dimensions(20, 20, 5);
//        Case theCase = new Case("220B", "Dell", "240", dimensions);
//
//        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
//
//        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
//
//        PC thePC = new PC(theCase, theMonitor, theMotherboard);
//
//        thePC.powerUp();
        Couch theCouch = new Couch("Ashley", "LazyMan", "Large", 4, 6);
        Bookshelf theBookshelf = new Bookshelf("Target", "Back2Skool", "Large", 7);
        Remote theRemote = new Remote("Samsumg", "FD4543", "Small", 25, false );
        TV theTV = new TV(theRemote, "Samsung", "GG2000", "50 INCH");

        Room livingRoom = new Room(theCouch, theBookshelf, theTV);
        livingRoom.hide("the remote");
        livingRoom.getTheTV().turnOn(false);
        livingRoom.getTheTV().turnOff(true);

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