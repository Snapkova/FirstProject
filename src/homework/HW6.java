package homework;

public class HW6 {


    //Task 10
    public static void example10(double start, double end, double step) {
        if (start < end && step > 0) {
            for (start = start; start < end; start += step) {
                System.out.println(start);
            }
        } else if (start > end && step < 0) {
            for (start = start; start > end; start += step) {
                System.out.println(start);
            }
        } else {
            System.out.println("invalid data");
        }
    }


    // Task 11
    public static void seq11(int l) {
        int end = 0;
        for (int i = 0; end < l; i += 2) {
            System.out.println(i);
            end++;
        }
    }

    // Task 12
    public static void seq12(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(Math.pow(2.0, i));
        }
    }

    // task 13
    public static String seq13() {

        String result = "";
        String result2 = "";
        String result3 = "";
        String result4 = "";
        for (int i = 0; i <= 9; i++) {
            result = result + i;
            result2 = result2 + i + i;
            result3 = result3 + i + i + i;
            result4 = result4 + i + i + i + i;

        }
        return result + result2 + result3 + result4;
    }

    // Task 16
    public static void seq16(int n, int m, int l) {

    }

    // Task 17
    public static void seq17(int n) {
        int l = n + 5;
        for (; n < l; n++) {
            System.out.println("[" + (n + 1) + "]" + "=" + (n + 2));
        }
    }

    // Task 18
    public static void seq18(int l, int n) {
        if (n < 1) {
            System.out.println("[" + (n) + "]" + "=" + n);
            for (; n < l; n++) {
                System.out.println("[" + (n + 1) + "]" + "=" + (2 * n));
            }
        } else {
            System.out.println("invalid data");
        }
    }

    //Task 19 - 1 sposob
    public static void seq19() {
        int des = 0;
        int ed = 0;
        for (int i = 10; i < 100; i++) {
            des = i / 10;
            ed = i % 10;
            if (des - ed <= 3 && ed - des <= 3) {
                System.out.print(i + " ");

            }

        }
    }

    // Task 19  - 2 sposob
    public static void seq191() {
        for (int i = 10; i < 100; i++) {
            if (Math.abs((i / 10 - i % 10)) <= 3) {
                System.out.print(i + " ");

            }
        }

    }

    // Task 20
    public static void print20(double x) {
        if (x >= 1.5) {
            System.out.println(2.5 * Math.pow(x, 3) + 6 * Math.pow(x, 2) - 30);
        } else if (x >= 0 && x <= 1.5) {
            System.out.println(x + 1);
        } else {
            System.out.println(x);
        }
    }


    public static void main(String[] args) {

        String line = "======================================";
        // Task 1
        for (int i = 1; i < 10; i++)
            System.out.println(i);
        System.out.println(line);


        //Task 2
        for (int i = 9; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println(line);

        HW4.task();// Task 3
        for (int i = 50; i <= 55; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(line);

        HW4.task(); //Task 4
        for (int i = 326; i > 300; i--) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
        HW4.task(); //Task 5
        for (double i = 12; i <= 13.0; i += 0.1) {
            System.out.println(String.format("%.1f", i));

        }
        HW4.task(); //Task 6
        for (int i = 215; i <= 237; i += 1) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
        HW4.task(); //Task 7
        for (int i = 8; i < 14; i += 1) {
            if (i % 7 == 0) {
                System.out.println(i);
            } else {
                System.out.println("no value");
            }
        }
        HW4.task();// Task 8
        for (short i = Short.MIN_VALUE; i < Short.MAX_VALUE; i += 1) {
            if (i % 15001 == 0) {
                System.out.println(i);
            }
            System.out.println(line);
        }
        HW4.task();// Task 9
        for (int i = -10; i <= 34; i += 1) {
            if (i == 0) {
                System.out.println("\u001B[32m" + "ZERO" + "\u001B[0m");
            } else if (i % 11 == 0 && !(i == 0)) {
                System.out.println("\u001B[34m" + i + "\u001B[0m");
            } else if (i % 12 == 0 && !(i == 0)) {
                System.out.println("\u001B[31m" + i + "\u001B[0m");
            } else {
                System.out.println(i);
            }
        }
        System.out.println(line);

        HW4.task(); // Task 10
        example10(10.0, 20.19, 2.15);
        System.out.println(line);
        example10(9, 3.0, -1.5);
        System.out.println(line);
        example10(9.15, 12, 0);
        System.out.println(line);

        HW4.task();// Task 11
        seq11(9);
        System.out.println(line);

        HW4.task();// Task 12
        seq12(5);
        System.out.println(line);

        HW4.task();// Task 14
        System.out.println(seq13());

        // second decision

        for (int i = 0; i <= 9; i++) {
            System.out.print("" + i);
        }
        for (int i = 0; i <= 9; i++) {
            System.out.print("" + i + i);
        }
        for (int i = 0; i <= 9; i++) {
            System.out.print("" + i + i + i);
        }
        for (int i = 0; i <= 9; i++) {
            System.out.print("" + i + i + i + i);
        }
        System.out.println(line);

        HW4.task(); // Task 14
        System.out.print(0 + ",");
        for (int i = 1; i < 6; i++) {
            System.out.print(i + "," + (i * -1) + ",");
        }
        System.out.println(line);

        HW4.task(); //Task 15
        for (int i = 0; i <= 25; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n" + line);

        HW4.task(); // Task 16

        HW4.task(); // task 17
        seq17(10);
        System.out.println(line);
        seq17(1);
        System.out.println(line);

        HW4.task(); // Task 18
        seq18(4, -3);
        System.out.println(line);

        HW4.task();// task 19
        seq19();
        System.out.println("\n");


        seq191();
        System.out.println("\n");

        HW4.task(); // Task 20
        print20(1);
        print20(3);
        print20(1.2);
        print20(-5);


    }
}
