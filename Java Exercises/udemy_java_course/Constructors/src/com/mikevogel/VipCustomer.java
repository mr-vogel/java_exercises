package com.mikevogel;

public class VipCustomer {

    // Create a new class VipCustomer
    // it should have 3 fields name, credit limit, and email address
    // create 3 constructors
    // 1st constructor empty should call the constructor with 3 parameters with default values
    // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
    // 3rd constructor should save all fields
    // create getters only for this using code generation of intellij as setters won't be needed

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("Default name", "Default@email.com", 50000);
    }

    public VipCustomer(String name, String emailAddress){
        this(name, emailAddress, 1500);
    }

    public VipCustomer(String name, String emailAddress, double creditLimit){
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }



    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
