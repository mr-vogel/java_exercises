package com.mikevogel;

public class Main {

    public static void main(String[] args) {
        // width of 16 (2 bytes)
        char myChar = '\u00A9'; // can also take unicode characters such as \u00A9
        System.out.println("Unicode output was: " + myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        char myCharChallenge = '\u00AE'; // can also take unicode characters such as \u00A9
        System.out.println("Unicode output was: " + myCharChallenge);
    }
}
