public class Main {

    public static void main(String[] args) {
        System.out.println(AreaCalculator.area(5d));
        System.out.println(AreaCalculator.area(5, 4));
    }

}


/*
Examples of input/output:

* area(5.0); should return 78.53975

* area(-1);  should return -1 since the parameter is negative

* area(5.0, 4.0); should return 20.0 (5 * 4 = 20)

* area(-1.0, 4.0);  should return -1 since first the parameter is negative
 */