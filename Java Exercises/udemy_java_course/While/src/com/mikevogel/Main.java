package com.mikevogel;

public class Main {

    public static void main(String[] args) {
//        int count = 1;
//        while(count != 6){
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count = 1;
//        while (true){
//            if (count == 6){
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }

//        do {
//            System.out.println("Count value was " + count);
//            count++;
//        } while (count !=6);

        // Create a method called isEvenNumber that takes a parameter of type int
        // Its purpose is to determine if the argument passed to the method is
        // an even number or not.
        // return true if an even number, otherwise return false;
        int evenCounter = 0;
        int number = 4;
        int finishNumber = 20;

        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            evenCounter++;
            System.out.println("Even number " + number);
            if(evenCounter == 5){
                break;
            }
        }
        System.out.println("Found " + evenCounter + " even numbers");
        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

    }

    public static boolean isEvenNumber(int number){
        if (number % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}
