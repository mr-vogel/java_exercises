package com.mikevogel;

public class Main {

    public static void main(String[] args) {

        // These are the four Java value types that are for whole numbers

//        // int has a width of 32
//        int myMinValue = -2_147_483_648;
//        int myMaxValue = 2_147_483_647;
//        int myTotal = (myMinValue/2);
//        System.out.println("myTotal = " + myTotal);
//
//        // byte has a width of 8
//        byte myByteMin = -128;
//        byte myByteMax = 127;
//        byte myNewByteValue = (byte) (myByteMin/2); //this is an example of casting
//        System.out.println("myNewByteValue = " + myNewByteValue);
//
//        // short has a width of 16
//        short myShortMin = -32768;
//        short myShortMax = 32767;
//        short myNewShortValue = (short) (myShortMax / 2);
//
//        // long has a width of 64
//        long myLongMin = -9_223_372_036_854_775_808L;
//        long myLongMax = 9_223_372_036_854_775_807L;


        //Challenge
        //1. Create a byte variable and set it to any valid byte number.
        //2. Create a short variable and set it to any valid short number.
        //3. Create an int variable and set it to any valid int number.
        //4. Create a variable of type long, and make it equal to
        //      5000 + 10 times the sum of the byte, plus the short plus the int

        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;

        long myLong = 50000L + (10L * (myByte + myShort + myInt));
        short shortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));

        System.out.println("longTotal = " + myLong);
        System.out.println("shortTotal = " + shortTotal);

    }
}
