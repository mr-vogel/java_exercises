public class Main {
    public static void main(String[] args) {
        System.out.println(TeenNumberChecker.hasTeen(9,99,19));
        System.out.println(TeenNumberChecker.hasTeen(23,15,42));
        System.out.println(TeenNumberChecker.hasTeen(22,23,34));
        System.out.println(TeenNumberChecker.isTeen(9));
        System.out.println(TeenNumberChecker.isTeen(13));

    }
}

/*
 * hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19

 * hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19

 * hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19
 *
    isTeen(9);  should return false since 9 is in not range 13 - 19
    isTeen(13);  should return true since 13 is in range 13 - 19
 */