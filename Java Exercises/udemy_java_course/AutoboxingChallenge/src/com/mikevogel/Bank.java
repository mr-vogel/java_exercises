package com.mikevogel;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;


    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public int addNewCustomer(Branch branch, Customer customer){
        if (findBranch(branch.getBranchName()) < 0) {
            System.out.println("Branch " + branch.getBranchName() + " , does not exist." +
                    "Customer not created / added to branch.");
            return -1;
        } else if(branch.addCustomer(customer) < 0) {
            return -1;
        }

        return 0;

        }


    public int addNewBranch(Branch newBranch){

        if (findBranch(newBranch.getBranchName()) >= 0) {
            System.out.println("Branch already exists, branch not created/added.");
            return -1;
        }
            branches.add(newBranch);
            return 0;
    }

    public int findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch branch = this.branches.get(i);
            if (branch.getBranchName().equals(branchName)) {
                return i;
            }
        }
        return -1;
    }

    public Branch queryBranch(String name){
        int position = findBranch(name);
        if(position >= 0){
            return this.branches.get(position);
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