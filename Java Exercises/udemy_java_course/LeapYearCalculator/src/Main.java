public class Main {
    public static void main(String[] args) {

        System.out.println(LeapYearCalculator.isLeapYear(-1600));
        System.out.println(LeapYearCalculator.isLeapYear(1600));
        System.out.println(LeapYearCalculator.isLeapYear(2017));
        System.out.println(LeapYearCalculator.isLeapYear(2000));


    }
}


/*
 * isLeapYear(-1600); → should return false since the parameter is not in range (1-9999)

 * isLeapYear(1600); → should return true since 1600 is a leap year

 * isLeapYear(2017); → should return false since 2017 is not a leap year

 * isLeapYear(2000);  → should return true because 2000 is a leap year
 */