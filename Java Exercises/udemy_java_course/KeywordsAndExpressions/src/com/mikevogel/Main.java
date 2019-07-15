package com.mikevogel;

public class Main {

    public static void main(String[] args) {
        // a mile is equal to 1.609344 kilometers
        double kilometers = 100 * 1.609344; //  kilometers = 100 * 1.609344 is an expression

        int highScore = 50;
        if(highScore == 50){//what is in the parentheses here is an expression
            System.out.println("This is an expression");
        }

        // In the code below, what is considered an expression
        int score = 100; //score = 100
        if(score > 99){ //score > 99
            System.out.println("You got the high score"); //"You got the high score"
            score = 0; //score = 0
        }

    }
}
