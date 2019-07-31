package com.mikevogel;

public class Main {

    public static void main(String[] args) {
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field)
        // 2. To all the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawl to complete if there are insufficient funds

//        BankAccount bankAccount = new BankAccount();
//
//        System.out.println(bankAccount.getAccountNumber());
//        System.out.println(bankAccount.getBalance());
//
//        bankAccount.withdrawFunds(100);
//
//        bankAccount.depositFunds(50);
//        bankAccount.withdrawFunds(100);
//
//        bankAccount.depositFunds(51);
//        bankAccount.withdrawFunds(100);
//
//        BankAccount mikesAccount = new BankAccount("Mike", "Mike@email.com", "12345");
//        System.out.println(mikesAccount.getAccountNumber() + " name " + mikesAccount.getCustomerName());

//        bankAccount.setAccountNumber("123245667");
//        System.out.println("Accnt # = " + bankAccount.getAccountNumber());
//        bankAccount.setCustomerName("Mike Vogel");
//        System.out.println("Customer name = " + bankAccount.getCustomerName());
//        bankAccount.setBalance(500.00);
//        System.out.println("Current balance = " + bankAccount.getBalance());
//        bankAccount.setEmail("vogel1mr@gmail.com");
//        System.out.println("Email: " + bankAccount.getEmail());
//        bankAccount.depositFunds(500);
//        bankAccount.withdrawFunds(2000);
//        bankAccount.withdrawFunds(500);

        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields
        // create getters only for this using code generation of intellij as setters won't be needed

//        VipCustomer vipCustomer = new VipCustomer();
//        VipCustomer vipCustomer = new VipCustomer("Marv", "Marv@example.com");
        VipCustomer vipCustomer = new VipCustomer("Marvin", "Marvin@example.com", 3000);
        System.out.println("Name = " + vipCustomer.getName());
        System.out.println("Email = " + vipCustomer.getEmailAddress());
        System.out.println("Credit Limit = " + vipCustomer.getCreditLimit());





    }
}
