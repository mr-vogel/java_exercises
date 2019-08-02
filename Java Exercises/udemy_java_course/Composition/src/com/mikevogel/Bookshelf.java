package com.mikevogel;

public class Bookshelf {

    private String manufacturer;
    private String model;
    private String size;
    private int numOfShelfs;

    public Bookshelf(String manufacturer, String model, String size, int numOfShelfs) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.size = size;
        this.numOfShelfs = numOfShelfs;
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

    public int getNumOfShelfs() {
        return numOfShelfs;
    }
}
