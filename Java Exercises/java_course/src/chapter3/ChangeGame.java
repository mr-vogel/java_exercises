package chapter3;
/*
* So, you're going to create a program that asks the user to enter the quantities for the following coins.

You'll ask them how many pennies would you like?
How many nickels would you like?
How many dimes?
And then, how many quarters?
What your program is going to do is count up the value of all of the change that they answered.

If it's exactly one dollar then they win the game.
If it's more than one dollar, then you need to tell them that it's more than one dollar and how much they went over.
If it's less than one dollar, tell them how much they went under.*/

import java.util.Scanner;

public class ChangeGame {
    public static void main(String args[]){

        //Declare what we know
        double pennyValue = .01;
        double nickelValue = .05;
        double dimeValue = .10;
        double quarterValue = .25;
        int pennyQuantity;
        int nickelQuantity;
        int dimeQuantity;
        int quarterQuantity;
        double pennyTotalAmount;
        double nickelTotalAmount;
        double dimeTotalAmount;
        double quarterTotalAmount;
        double finalTotal;
        double winningTotal = 1.00;

        //Prompt the user
        System.out.println("Welcome to 'Change for a Dollar'! " +
                "Your goal is to enter enough change to make exactly $1.00");

        System.out.println("How many pennies do you have? ");
        Scanner scanner = new Scanner(System.in);
        pennyQuantity = scanner.nextInt();

        System.out.println("How many nickels do you have? ");
        nickelQuantity = scanner.nextInt();

        System.out.println("How many dimes do you have? ");
        dimeQuantity = scanner.nextInt();

        System.out.println("How many quarters do you have? ");
        quarterQuantity = scanner.nextInt();
        scanner.close();

        //Calculate values
        pennyTotalAmount = pennyQuantity * pennyValue;
        nickelTotalAmount = nickelQuantity * nickelValue;
        dimeTotalAmount = dimeQuantity * dimeValue;
        quarterTotalAmount = quarterQuantity * quarterValue;
        finalTotal = pennyTotalAmount + nickelTotalAmount + dimeTotalAmount + quarterTotalAmount;


        //Make decision + Report findings
        if(finalTotal == winningTotal){
            System.out.println("You won the game!");
        }
        else if(finalTotal < winningTotal){
            double amountShort = winningTotal - finalTotal;
            System.out.println("Your total is less than $1.00, you were under by $" + String.format("%.2f", amountShort) + " cents.");
        }
        else{
            double amountOver = finalTotal - winningTotal;
            System.out.println("Your total is more than $1.00, you were over by $" + String.format("%.2f", amountOver) + " cents.");

        }
    }
}
