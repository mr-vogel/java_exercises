package com.mikevogel;

public class Couch {

    private String manufacturer;
    private String model;
    private String size;
    private int numOfPillows;
    private int numOfCushions;

    public Couch(String manufacturer, String model, String size, int numOfPillows, int numOfCushions) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.size = size;
        this.numOfPillows = numOfPillows;
        this.numOfCushions = numOfCushions;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public int getNumOfPillows() {
        return numOfPillows;
    }

    public int getNumOfCushions() {
        return numOfCushions;
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