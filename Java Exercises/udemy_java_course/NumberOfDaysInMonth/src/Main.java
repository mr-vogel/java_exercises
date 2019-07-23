public class Main {

    public static void main(String[] args) {

//        System.out.println(NumberOfDaysInMonth.isLeapYear(-1600));
//        System.out.println(NumberOfDaysInMonth.isLeapYear(1600));
//        System.out.println(NumberOfDaysInMonth.isLeapYear(2017));
//        System.out.println(NumberOfDaysInMonth.isLeapYear(2000));
//
//        System.out.println(NumberOfDaysInMonth.getDaysInMonth(0, 0));
//        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, 0));
//        System.out.println(NumberOfDaysInMonth.getDaysInMonth(0, 10000));
//        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, 1));
//        System.out.println(NumberOfDaysInMonth.getDaysInMonth(12, 9999));

        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2018));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, -2020));




    }
}


/*
Examples of input/output:

* isLeapYear(-1600); →  should return false since the parameter is not in the range (1-9999)

* isLeapYear(1600); → should return true since 1600 is a leap year

* isLeapYear(2017); → should return false since 2017 is not a leap year

* isLeapYear(2000); → should return true because 2000 is a leap year

​NOTE:  The solution to the Leap Year coding exercise earlier in the course created the isLeapYear method. You can use that solution if you wish.


* getDaysInMonth(1, 2020); → should return 31 since January has 31 days.
* getDaysInMonth(2, 2020); → should return 29 since February has 29 days in a leap year and 2020 is a leap year.
* getDaysInMonth(2, 2018); → should return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year.
* getDaysInMonth(-1, 2020); → should return -1 since the parameter month is invalid.
* getDaysInMonth(1, -2020); → should return -1 since the parameter year is outside the range of 1 to 9999.
 */