package com.mikevogel;

public class Main {

    public static void main(String[] args) {

        //Objects hold their states in fields
        //Object expose their behavior in methods

        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());




    }
}
