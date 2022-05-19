package utils;

public class Utils {
    public static void verifyEqual(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

    }

    public static void verifyEqual(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    public static void verifyEqual(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    public static int number = 1;

    public static void task() {
        System.out.println("*".repeat(25) + "Task" + number + "*".repeat(25));
        number++;
    }

    public static void line() {
        System.out.println("_______________________________________________________");
    }


}
