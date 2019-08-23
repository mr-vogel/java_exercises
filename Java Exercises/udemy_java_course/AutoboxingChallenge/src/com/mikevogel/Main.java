package com.mikevogel;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Bank bank = new Bank("Chase");

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean quit = false;
        printActions();
        while(!quit){
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("\nQuitting application...");
                    quit=true;
                    break;
                case 1:
                    addBranch();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    addTransaction();
                    break;
                case 4:
                    printCustomers();
                    break;
                case 5:
                    printCustomersWithTransactions();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }


    }
    public static void printActions(){
        System.out.println("\nAvailable actions: \npress");
        System.out.println("\t 0 - to quit");
        System.out.println("\t 1 - to add a branch");
        System.out.println("\t 2 - to add a new customer to a branch");
        System.out.println("\t 3 - to add transaction for existing customer");
        System.out.println("\t 4 - to show customers for a branch");
        System.out.println("\t 5 - to show customers and their transactions for a branch");
        System.out.println("\t 6 - to print a list of available actions");
        System.out.println("Choose your action: ");
    }

    public static void printCustomers(){
        System.out.println("What branch? : ");
        String branchName = scanner.nextLine();
        Branch branch = bank.queryBranch(branchName);
        if((branch == null)) {
            System.out.println("Error, please try again.");
        }else{
            branch.printCustomers();
        }
    }

    public static void printCustomersWithTransactions(){
        System.out.println("What branch? : ");
        String branchName = scanner.nextLine();
        Branch branch = bank.queryBranch(branchName);
        if((branch == null)) {
            System.out.println("Error, please try again.");
        }else{
            branch.printCustomersWithTransactions();
        }
    }

    public static void addTransaction(){
        System.out.print("Enter customer name: ");
        String custName = scanner.nextLine();

        System.out.println("What branch does " + custName + " belong to: ");
        String branchName = scanner.nextLine();

        System.out.println("Enter transaction amount: ");
        double transaction = scanner.nextDouble();

        Branch branch = bank.queryBranch(branchName);
        Customer customer = branch.queryCustomers(custName);
        if((branch == null) || (customer == null) ) {
            System.out.println("Error, please try again.");
        }else{
            branch.addTransaction(customer, transaction);
        }
    }

    public static void addBranch(){
        System.out.print("Enter new branch name: ");
        String branchName = scanner.nextLine();
        if(bank.findBranch(branchName) < 0){
            Branch branch = Branch.createBranch(branchName);
            bank.addNewBranch(branch);
        } else {
            System.out.println("Branch already exists, " + branchName + " was not created/added");
        }
    }

    public static void addCustomer(){
        System.out.print("Enter customer name: ");
        String custName = scanner.nextLine();

        System.out.println("Enter branch to add customer to: ");
        String branchName = scanner.nextLine();

        System.out.println("Enter initial transaction amount: ");
        double intialTransaction = scanner.nextDouble();

        Branch branch = bank.queryBranch(branchName);
        if(branch != null) {
            Customer customer = new Customer(custName);
            bank.addNewCustomer(branch, customer);
            branch.addTransaction(customer, intialTransaction);
        }else{
        System.out.println("Could not find branch " + branchName + ", please try again.");
        }
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