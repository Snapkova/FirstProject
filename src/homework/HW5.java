package homework;


public class HW5 {


    //Task 1
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

    // Task 2
    public static String dayOfWeek(int d) {
        String day = " ";
        if (d > 0 && d <= 7) {
            if (d == 1) {
                day = "Monday";
            } else if (d == 2) {
                day = "Tuesday";
            } else if (d == 3) {
                day = "Wednesday";
            } else if (d == 4) {
                day = "Thursday";
            } else if (d == 5) {
                day = "Friday";
            } else if (d == 6) {
                day = "Saturday";
            } else {
                day = "Sunday";
            }
        } else {
            day = "incorrect value";

        }
        return day;

    }

    //Task 3
    public static int returnLargestOfThree(int x, int y, int z) {
        int largest;
        if (x > y) {
            largest = x;
        } else {
            largest = y;

        }
        if (largest > z) {

            return largest;
        } else {
            largest = z;

        }
        return largest;

    }

    // Task 4
    public static int returnSmallestOfThree(int a, int b, int c) {
        int smallest;
        if (a < b) {
            smallest = a;
        } else {
            smallest = b;
        }
        if (smallest < c) {
            return smallest;
        } else {
            smallest = c;
        }
        return smallest;
    }

    //Task 5
    public static double averageOfFive(double t1, double t2, double t3, double t4, double t5) {
        return (t1 + t2 + t3 + t4 + t5) / 5;

    }

    //Task 6
    public static String printRubKop(double price) {
        String resultstring = "";
        int rubles = (int) price;
        double cop = price * 100 - rubles * 100;
        int cop1 = (int) cop;
        if (cop1 > 10) {
            resultstring = rubles + " rub. " + cop1 + " kop.";
            //System.out.println(rubles + "rub." + cop1 + "kop.");
        } else {
            resultstring = rubles + " rub. " + "0" + cop1 + " kop.";
            //System.out.println(rubles + "rub." + "0" + cop1 + "kop.");
        }
        return resultstring;
    }

    //Task 7
    public static String printKiloGram(double weight) {
        String result7 = "";
        int kilo = (int) weight;
        double gram = weight * 1000 - kilo * 1000;
        int gram1 = (int) gram;
        //System.out.println(kilo + " kg." + gram1 + " gr.");
        if (gram == 0) {
            result7 = kilo + gram1 + " ea";
        } else {
            result7 = kilo + "kg" + gram1 + " gr.";
        }
        return result7;
    }

    //Task 8
    public static double printAmountPurchase(double price, double weight) {
        double chec = price * weight;
        return chec;

    }

    //Task 9
    public static void printCheck(String product, double price, double weight, String measure) {
        System.out.println(product);
        System.out.println("Price per 1 " + measure + "\t\t" + printRubKop(price));
        System.out.println("Amount item" + "\t\t\t" + printKiloGram(weight));
        System.out.println("_____________________________________________________");
        System.out.println("Amount purchase" + "\t\t" + printRubKop(printAmountPurchase(price, weight)));


    }

    //Task 10
    public static double salary(int hours, double costOfHour) {
        double rezultSalary = hours * costOfHour;


        return rezultSalary;
    }

    //Task 12
    public static String payrollSheet(String nameEmployee, double salary) {
        String resultPayrollSheet = "";
        resultPayrollSheet = nameEmployee + "  " + printRubKop(salary);


        return resultPayrollSheet;

    }

    public static String returntrue(int x) {
        String result12 = "";
        if (x < 0) {
            result12 = " x is negative";
        } else if (x > 0) {
            result12 = "x is positive";
        } else {
            result12 = "x is zero";
        }

        return result12;
    }

    //Task 13
    public static String myLuckyNumber(int xxxx) {
        String resultLuckyYear = "";
        if (xxxx > 1900 && xxxx < 2022) {
            int xxxx1 = xxxx / 1000;
            int xxxx2 = (xxxx - (xxxx1 * 1000)) / 100;
            int xxxx3 = (xxxx - xxxx1 * 1000 - xxxx2 * 100) / 10;
            int xxxx4 = xxxx % 10;
            int number = xxxx1 + xxxx2 + xxxx3 + xxxx4;
            if (number < 10) {
                return resultLuckyYear = " Lycky number - " + number;
            } else {
                number = number / 10 + number % 10;
                if (number < 10) {
                    resultLuckyYear = " Lycky number - " + number;
                } else {
                    number = number / 10 + number % 10;
                    resultLuckyYear = " Lycky number - " + number;
                }
            }
        } else {
            return "Incorrect value";
        }
        return resultLuckyYear;
    }

    //Task 14
    public static double averageOfThree(int a14, int b14, int c14) {
        double average14 = ((double) (a14 + b14 + c14)) / 3;
        return average14;
    }

    public static int mediana(int a14, int b14, int c14) {
        int medium = 0;
        int sum14 = a14 + b14 + c14;
        medium = sum14 - returnSmallestOfThree(a14, b14, c14) - returnLargestOfThree(a14, b14, c14);


        return medium;
    }

    public static String resultBetweenAverageAndMedian(int a14, int b14, int c14) {
        String result14 = "";
        if (((averageOfThree(a14, b14, c14)) - (mediana(a14, b14, c14))) > 2) {
            result14 = "Srednee znachenie" + averageOfThree(a14, b14, c14) + "otlichaetsya ot mediani"
                    + mediana(a14, b14, c14) + "na" + ((averageOfThree(a14, b14, c14)) - (mediana(a14, b14, c14)));
        } else {
            result14 = "Srednee znachenie = " + averageOfThree(a14, b14, c14) + " a mediana = "
                    + mediana(a14, b14, c14);
        }


        return result14;
    }

    // Task 15
    public static String metodBestReturn(double a15) {
        String resuit15 = "";
        a15 = Math.floor(a15);
        resuit15 = printRubKop(a15);

        return resuit15;
    }

    // Task 16
    public static int example16(int a, int b, int c) {
        int finish1 = 0;
        int result161 = a * b;
        result161 = result161 + c;
        double exponentAB = Math.pow(a, b);
        double finishup = result161 * exponentAB;
        finishup = Math.sqrt(finishup);
        double finish = Math.ceil(finishup / 3.14);
        finish1 = (int) finish;

        return finish1;
    }

    // Task 18
    public static double getPow(int pow) {
        if (pow >= 0 && pow <= 10) {

            return Math.pow(Math.random(), pow);
        } else {
            System.out.println("Error");

            return Double.MIN_VALUE;
        }
    }

    //Task 19
    public static double getRandomNumber() {
        int num1 = (int) (Math.random() * 99) + 1;

        return num1;
    }

    //Task 20
    public static boolean isLeapYear(int year) {
        boolean isLeapYear = year % 4 == 0 && year % 100 > 0;
        return isLeapYear;
    }


    public static void main(String[] args) {


        // task 1
        verifyEqual(1, 1);
        verifyEqual(3.14, 3.14);
        verifyEqual("q", "q");
        verifyEqual("a", "f");


        // Task 2

        System.out.println(dayOfWeek(1));
        System.out.println(dayOfWeek(2));
        System.out.println(dayOfWeek(3));
        System.out.println(dayOfWeek(4));
        System.out.println(dayOfWeek(5));
        System.out.println(dayOfWeek(6));
        System.out.println(dayOfWeek(7));
        System.out.println(dayOfWeek(9));
        System.out.println(dayOfWeek(10));

        //verifyEqual(dayOfWeek(1,"Monday"));


        HW4.task();//3
        int x;
        int y;
        int z;

        System.out.println(returnLargestOfThree(12, 33, 120));
        verifyEqual(returnSmallestOfThree(1, 2, 3), 1);
        verifyEqual(returnSmallestOfThree(1, -2, 10), -2);


        HW4.task(); //Task 4
        int a;
        int b;
        int c;
        System.out.println(returnSmallestOfThree(12, 33, 129));
        System.out.println(returnSmallestOfThree(3, -120, 4));

        HW4.task();//5
        double t1;
        double t2;
        double t3;
        double t4;
        double t5;
        System.out.println(averageOfFive(36.6, 36.7, 37.0, 37.6, 37.7));
        System.out.println(averageOfFive(36.6, 37, 38, 39, 40));

        HW4.task();// Task 6

        System.out.println(printRubKop(12.34));
        System.out.println(printRubKop(10.02));


        HW4.task();//Task7
        System.out.println(printKiloGram(10.75));
        System.out.println(printKiloGram(11.001));

        HW4.task();//Task 8
        System.out.println(printAmountPurchase(2.5, 2.5));
        System.out.println(printAmountPurchase(3.3, 3.3));

        HW4.task();// Task 9
        printCheck("Apples", 3.00, 2.5, "kg.");
        printCheck("Lolipop", 1.0, 1.0, "ea");

        HW4.task();// task 10
        System.out.println(salary(166, 37.15) + " salary in month");

        HW4.task();//Task 11
        System.out.println(payrollSheet("Smirnova Mariya Ivanovna  ", 70000.00));
        // 11.2
        System.out.println("Mart 2022");
        System.out.println(payrollSheet("Smirnova Mariya Ivanovna  ", 70000.00));
        System.out.println(payrollSheet("Serebryakov Ivan Petrovich", 128059.00));

        HW4.task();// Task 12
        System.out.println(returntrue(0));
        System.out.println(returntrue(-123456));
        System.out.println(returntrue(5678));

        // Task 13
        HW4.task();
        System.out.println(myLuckyNumber(1983));
        System.out.println(myLuckyNumber(1984));
        System.out.println(myLuckyNumber(2012));
        System.out.println(myLuckyNumber(2014));

        //Task 14
        HW4.task();
        int a14 = 3;
        int b14 = -5;
        int c14 = 10;
        System.out.println(averageOfThree(3, -5, 10));
        System.out.println(averageOfThree(-1, 0, 1));
        System.out.println(mediana(-1, 0, 1));
        System.out.println(mediana(-10, -50, 9));
        System.out.println(resultBetweenAverageAndMedian(5, 10, 15));
        System.out.println(resultBetweenAverageAndMedian(-100, 1, 12));
        System.out.println(resultBetweenAverageAndMedian(2, 5, 6));

        HW4.task(); // Task 15
        System.out.println(metodBestReturn(10.75));
        System.out.println(metodBestReturn(13.05));

        HW4.task();//16
        a = 3;
        b = 4;
        c = 20;
        System.out.println(example16(3, 4, 20));

        HW4.task();//Task 18
        System.out.println(getPow(2));
        System.out.println(getPow(0));
        System.out.println(getPow(10));
        System.out.println(getPow(11));

        HW4.task();// Task 18


        HW4.task(); // Task 19
        System.out.println(getRandomNumber());
        System.out.println(getRandomNumber());

        HW4.task();//Task 20
        System.out.println(isLeapYear(2022));
        System.out.println(isLeapYear(2016));
        System.out.println(isLeapYear(2000));


    }


}


