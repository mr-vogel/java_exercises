package com.mikevogel;

public class Main {

    public static void main(String[] args) {
//        int newScore = calculateScore("mike", 500);
//        System.out.println("New score is " + newScore);
//        calculateScore(75);
//        calculateScore();
        System.out.println(calcFeetAndInchesToCentimeters(7,1));
        System.out.println(calcFeetAndInchesToCentimeters(-10));

    }

//    public static int calculateScore(String name, int score){
//        System.out.println("Player " + name + " scored " + score + " points");
//        return score*1000;
//    }
//
//    public static int calculateScore(int score){
//        System.out.println("Unnamed Player scored " + score + " points");
//        return score*1000;
//    }
//
//    public static int calculateScore(){
//        System.out.println("No player name, no player score");
//        return 0;
//    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet < 0)||((inches < 0) || (inches > 12))){
            return -1;
        }
        return ((feet*12)+inches)*2.54;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;
        }

        double feet = (int) inches / 12;
        double remainder = (int) inches%12;
        System.out.println(feet + " feet " + remainder + " inches");
        return calcFeetAndInchesToCentimeters(feet,remainder);
    }

    }

// Signature = methods name and parameters

// Challenge
// Create a method called calcFeetAndInchesToCentimeters
// It needs to have two parameters
// feet is the first parameter, inches is the 2nd parameter
//
// You should validate that the first parameter feet is >= 0
// You should validate that the 2nd parameter inches is >= 0  and <=12
// return -1 from the method if either of the above is not true
//
// If the parameters are valid, then calculate how many centimeters
// comprise the feet and inches passed to this method and return
// that value.
//
// Create a 2nd method of the same name but with only one parameter
// inches is the parameter
// validate that it is >= 0
// return -1 if it is not true
// But if it is valid, then calculate how many feet are in the inches
// and then here is the tricky part
// call the other overloaded method passing the correct feet and inches
// calculated so that it can calculate correctly
//
// Hints: use double for your number datatypes
// 1 inch = 2.54 cm and one foot = 12 inches
// calling another overloaded method just requires you to use the
// right number of parameters
