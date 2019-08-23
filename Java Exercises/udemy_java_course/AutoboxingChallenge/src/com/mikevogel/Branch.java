package com.mikevogel;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> branchCustomers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.branchCustomers = new ArrayList<Customer>();
    }

    public static Branch createBranch(String name) {
        return new Branch(name);
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getBranchCustomers() {
        return branchCustomers;
    }

    public int addCustomer(Customer customer) {
        if (findCustomer(customer.getName()) >= 0) {
            System.out.println("Customer already exists, customer not added");
            return -1;
        }
        branchCustomers.add(customer);
        return 0;
    }

    public int findCustomer(String customerName) {
        for (int i = 0; i < this.branchCustomers.size(); i++) {
            Customer customer = this.branchCustomers.get(i);
            if (customer.getName().equals(customerName)) {
                return i;
            }
        }
        return -1;
    }

    public int findCustomer(Customer customer) {
        return this.branchCustomers.indexOf(customer);
    }

    public int addTransaction(Customer customer, double amount) {
        if (findCustomer(customer.getName()) >= 0) {
            customer.addTransaction(amount);
            return 0;
        }

        System.out.println("Customer does not exist");
        return -1;

    }

    public void printCustomers() {
        System.out.println("Customers: ");
        for (int i = 0; i < this.branchCustomers.size(); i++) {
            System.out.println((i + 1) + ". " + this.branchCustomers.get(i).getName());
        }
    }

    public void printCustomersWithTransactions() {
        System.out.println("Customers: ");
        for (int i = 0; i < this.branchCustomers.size(); i++) {
            System.out.print((i + 1) + ". " + this.branchCustomers.get(i).getName());
            System.out.println("   Transactions: " + this.branchCustomers.get(i).getTransactions());
        }
    }



    public Customer queryCustomers(String name){
        int position = findCustomer(name);
        if(position >= 0){
            return this.branchCustomers.get(position);
        }
        return null;
    }


}

// You job is to create a simple banking application.
// There should be a Bank class
// It should have an arraylist of Branches
// Each Branch should have an arraylist of Customers
// The Customer class should have an arraylist of Doubles (transactions)

// Customer:
// Name, and the ArrayList of doubles.

// Branch:
// Each Branch should have an arraylist of Customers
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch


// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions
