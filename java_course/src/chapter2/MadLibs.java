package chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main(String arg[]){
        // 1. Ask for a season of the year
        System.out.println("Enter a season of the year: ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        // 2. Ask for a whole number
        System.out.println("Enter a whole number: ");
        int wholeNumber = scanner.nextInt();


        // 3. Ask for an adjective
        System.out.println("Enter an adjective: ");
        String adjective = scanner.next();
        scanner.close();

        // 4. Display result
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + wholeNumber + " cups of coffee.");
    }
}
