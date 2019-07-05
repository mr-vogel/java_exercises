package chapter5;

/*
* PHONE BILL CALCULATOR
*
* Calculate the final total of someone's cell phone bill.
* Allow the operator to input the plan fee and the number of overage minutes.
* Charge the user .25 for every minute they were over their plan, and 15% tax on their subtotal.
* Create separate methods to calculate the tax, overage fees, and final total.
* Print the itemized bill.
* */


import java.util.Scanner;

public class PhoneBillCalculator {

    public static void main(String args[]) {

        //Prompt the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your plan fee:");
        double planFee = scanner.nextDouble();

        System.out.println("Enter the number of overage minutes:");
        double minutesOver = scanner.nextDouble();

        scanner.close();

        double overageCost = calculateOverage(minutesOver);

        double taxTotal = calulateTax(overageCost, planFee);

        double finalTotal = calculateFinal(taxTotal, overageCost, planFee);

        System.out.println("Phone Bill Statement");

        //Plan
        System.out.println("Plan: $" + String.format("%.2f", planFee));

        //Overage
        System.out.println("Overage: $" + String.format("%.2f", overageCost));

        //Tax
        System.out.println("Tax: $" + String.format("%.2f", taxTotal));

        //Total
        System.out.println("Total: $" + String.format("%.2f", finalTotal));


    }

    //Method to calculate the tax
        public static double calulateTax(double overageCost, double planFee) {
            double taxRate = .15;
            double taxTotal = (overageCost + planFee) * taxRate;
            return taxTotal;
        }

        //Method to calculate overage fees
        public static double calculateOverage(double minutesOver) {

            double overageCost = minutesOver * 0.25;
            return overageCost;
        }

        //Method to calculate final total
        public static double calculateFinal(double taxTotal, double overageCost, double planFee) {
            double finalTotal = taxTotal + overageCost + planFee;
            return finalTotal;
    }
}
