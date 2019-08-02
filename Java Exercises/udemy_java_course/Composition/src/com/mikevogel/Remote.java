package com.mikevogel;

public class Remote {

    private String manufacturer;
    private String model;
    private String size;
    private int numOfButtons;
    private boolean isUniversal;

    public Remote(String manufacturer, String model, String size, int numOfButtons, boolean isUniversal) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.size = size;
        this.numOfButtons = numOfButtons;
        this.isUniversal = isUniversal;
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

    public int getNumOfButtons() {
        return numOfButtons;
    }

    public boolean isUniversal() {
        return isUniversal;
    }
}
