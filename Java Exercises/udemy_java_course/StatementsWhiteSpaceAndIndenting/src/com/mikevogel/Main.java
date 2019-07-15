package com.mikevogel;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50; //this entire line is a statement, including the data type and the semicolon
        if(myVariable ==50){
            System.out.println("Printed");
        }

        myVariable++; //also a complete statement
        myVariable--; //also a complete statement
        System.out.println("This is a test"); //this is a statement using methods

        System.out.println("This is " +
                " another " +
                " still more."); //this is also a valid statement, they can span multiple lines

        int anotherVariable = 50; myVariable--; System.out.println("this is another one");//this is also valid, but not recommended


    }
}
