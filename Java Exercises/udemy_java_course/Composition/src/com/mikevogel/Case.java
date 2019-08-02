package com.mikevogel;

public class Case {

    private String model;
    private String manufaturer;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model, String manufaturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufaturer = manufaturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufaturer() {
        return manufaturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
