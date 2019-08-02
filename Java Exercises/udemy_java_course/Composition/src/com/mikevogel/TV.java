package com.mikevogel;

public class TV {

    private Remote remote;
    private String manufacturer;
    private String model;
    private String size;

    public TV(Remote remote, String manufacturer, String model, String size) {
        this.remote = remote;
        this.manufacturer = manufacturer;
        this.model = model;
        this.size = size;
    }

    public void turnOn(boolean withRemote){
        if(withRemote){
            System.out.println("You turned on the TV with the remote");
        }else{
            System.out.println("You turned on the TV manually");
        }
    }

    public void turnOff(boolean withRemote){
        if(withRemote){
            System.out.println("You turned off the TV with the remote");
        }else{
            System.out.println("You turned off the TV manually");
        }
    }


    public Remote getRemote() {
        return remote;
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
}
