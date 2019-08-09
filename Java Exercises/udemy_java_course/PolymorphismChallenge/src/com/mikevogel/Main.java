package com.mikevogel;

class Car {

    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }

    public void startEngine(){
        System.out.println("You are in Car.startEngine()");
    }

    public void accelerate(){
        System.out.println("You are in Car.accelerate()");
    }

    public void brake(){
        System.out.println("You are in Car.brake()");
    }
}

class Mustang extends Car{

    public Mustang() {
        super(8, "Mustang");
    }

    @Override
    public void startEngine() {
        System.out.println("You are in Mustang.startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println("You are in Mustang.accelerate()");
    }

    @Override
    public void brake() {
        System.out.println("You are in Mustang.brake()");
    }
}

class Supra extends Car{

    public Supra() {
        super(10, "Supra");
    }

    @Override
    public void startEngine() {
        System.out.println("You are in Supra.startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println("You are in Supra.accelerate()");
    }

    @Override
    public void brake() {
        System.out.println("You are in Supra.brake()");
    }
}

class Tank extends Car{

    public Tank() {
        super(44, "Tank");
    }

    @Override
    public void startEngine() {
        System.out.println("You are in Tank.startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println("You are in Tank.accelerate()");
    }

    @Override
    public void brake() {
        System.out.println("You are in Tank.brake()");
    }
}

public class Main {

    public static void main(String[] args) {

        Car car = new Car(4,"mike's car");
        car.startEngine();
        car.accelerate();
        car.brake();
//        System.out.println(car.getCylinders());
//        System.out.println(car.getName());
//        System.out.println(car.getWheels());
//        System.out.println(car.isEngine());

        Mustang mustang = new Mustang();
        mustang.startEngine();
        mustang.accelerate();
        mustang.brake();

        Supra supra = new Supra();
        supra.startEngine();
        supra.accelerate();
        supra.brake();

        Tank tank = new Tank();
        tank.startEngine();
        tank.accelerate();
        tank.brake();
    }
}

/*
	    // We are going to go back to the car analogy.
        // Create a base class called Car
        // It should have a few fields that would be appropriate for a generic car class.
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true. Cylinders and names would be passed parameters.
        //
        // Create appropriate getters
        //
        // Create some methods like startEngine, accelerate, and brake
        //
        // show a message for each in the base class
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // put all classes in the one java file (this one).
 */
