package com.mikevogel;

public class Main {

    public static void main(String[] args) {
//        System.out.println(calculateInterest(10000.0, 2.0));

//        for(init; termination; increment){} //The format of a for loop
//        for(int i = 0; i < 5; i++){
//            System.out.println("Loop " + i + " hello!");
//        }

        // using the for statement, call the calculateInterest method with
        // the amount of 10000, with an interest rate of 2, 3, 4, 5, 6, 7 and 8
        // and print the results to the console window.
        for(int i = 2; i < 9; i++){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("******************************");

        // How would you modify the for loop above to do the same thing as
        // shown but to start from 8% and work back to 2$
        for(int i = 8; i >= 2; i--){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("******************************");


        int primeCount = 0;
        for(int i=10; i<50; i++){
            if(isPrime(i)){
                System.out.println(i + " is a prime number");
                primeCount++;
                if (primeCount == 3){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    // Create a for statement using any range of numbers
    // Determine if the number is a prime number using the isPrime method
    // if it is a prime number, print it out and incrememnt a count of the number of prime numbers found
    // if that count is 3 exit the loop
    // hint: use the break; statement to exit

    public static boolean isPrime(int n){

        if(n==1) {
            return false;
        }

        for(int i=2; i < n/2; i++){
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
}
