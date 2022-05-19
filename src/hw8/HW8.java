package hw8;


import java.util.Arrays;

import static utils.Utils.*;


public class HW8 {
    //Task 7

    public static int[] returnArray(int a1, int a2, int a3, int a4, int a5) {
        int[] arr7 = {a1, a2, a3, a4, a5};


        return arr7;
    }

    //Task 8
    public static double[] returnArrayDoubleFive(double d1, double d2, double d3, double d4, double d5) {

        return new double[]{d1, d2, d3, d4, d5};
    }

    // Task 9
    public static String[] returnArrayStringOfFive(String s1, String s2, String s3, String s4, String s5) {
        String[] arr9 = {s1, s2, s3, s4, s5};
        return arr9;
    }

    // Task 10
    public static double[] createArrayByMultiple(int[] array, double a) {
        double[] newArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i] * a;
        }
        return newArray;
    }

    // Task 11
    // proverka na pustoy massiv
    public static boolean checkEmptyArray(int[] arr2) {
        if (arr2.length == 0) {
            return false;
        }
        return true;
    }

    // proverka na polozhitelnie chisla
    public static boolean checkPositiveNumber(int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 0) {
                return false;
            }
        }
        return true;
    }

    // proverka na chetnost
    public static int giveMeAmountOfEvenNumberIfNoNegative(int[] arr2) {
        if ((checkPositiveNumber(arr2)) && checkEmptyArray(arr2)) {
            int counterE = 0;
            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i] % 2 == 0) {
                    counterE++;
                }

            }
            return counterE;
        }
        return Integer.MIN_VALUE;
    }


    //Task 12


    public static int giveMeAmountOfOddNumberIfNoNegativeint(int[] arr2) {
        if ((checkPositiveNumber(arr2)) && checkEmptyArray(arr2)) {
            int counterO = 0;
            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i] % 2 == 1) {
                    counterO++;
                }
            }
            return counterO;
        }
        return Integer.MIN_VALUE;
    }

    public static int[] returnArrOddNumberOfPositiveNumber(int[] arr2) {
        int[] newArr = new int[giveMeAmountOfOddNumberIfNoNegativeint(arr2)];
        int j = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 != 0) {
                newArr[j] = arr2[i];
                j++;
            }
        }
        return newArr;

    }

    // Task 13
    public static boolean[] returnBoolenIfNumGreaterTen(int[] arr2) {
        boolean[] returnArrBoolen = new boolean[arr2.length];
        if (arr2 == null || arr2.length == 0) {
            return null;
        } else {
            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i] <= 10) {
                    returnArrBoolen[i] = true;
                } else {
                    returnArrBoolen[i] = false;
                }
            }
        }
        return returnArrBoolen;
    }

    // Task 14
    public static String returnString(String[] words) {
        String word = "";
        for (int i = 0; i < words.length; i++) {
            word = word + words[i];
        }
        return word;
    }

    // Task 15
    public static int returnSumNumberArr(int[] arr2) {
        int sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum = sum + arr2[i];
        }
        return sum;
    }


    public static int sumNumInTwoHalfArr(int[] arr2) {
        if (arr2.length > 0) {
            int lenght = arr2.length;
            int halfLength = lenght / 2;
            int sum = 0;
            for (int i = halfLength; i < arr2.length; i++) {
                sum = sum + arr2[i];
            }

            return sum;
        } else {

            return Integer.MIN_VALUE;
        }
    }

    // Task 16
    public static int[] returnMultipleTable(int number) {
        if (number > 0 && number < 10) {
            int[] result = new int[10];
            for (int i = 0; i < result.length; i++) {
                result[i] = number * i;
            }
            return result;
        }
        return new int[]{}; // vernem pustoy massiv

    }

    // Task 17
    public static int[] returnLargestArrOddOrEven(int[] arr2) {
        int counterE = 0;
        int counterO = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0) {
                counterE++;
            } else {
                counterO++;
            }
        }
        if (counterE > counterO) {
            int[] even = new int[counterE];
            int countEven = 0;
            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i] % 2 == 0) {
                    even[countEven] = arr2[i];
                    countEven++;
                }
            }
            return even;
        } else {
            int[] odd = new int[counterO];
            int countOdd = 0;
            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i] % 2 != 0) {
                    odd[countOdd] = arr2[i];
                    countOdd++;
                }
            }
            return odd;
        }
    }

    // Task 18
    public static int[] returnArrRandomNumOfHundred(int length) {
        int[] arrResult18 = new int[length];
        for (int i = 0; i < arrResult18.length; i++) {
            arrResult18[i] = (int) ((Math.random() * 100) + 0);
        }
        return arrResult18;
    }

    // Task 19
    public static int[] returnArrRandomPositiveDigNum(int lenght, int digit) {
        int[] arrResult19 = new int[lenght];
        for (int i = 0; i < arrResult19.length; i++) {
            if (digit >= 1 && digit <= 5) {
                if (digit == 1) {
                    arrResult19[i] = (int) ((Math.random() * 10) + 0);
                } else if (digit == 2) {
                    arrResult19[i] = (int) ((Math.random() * 90) + 10);
                } else if (digit == 3) {
                    arrResult19[i] = (int) ((Math.random() * 900) + 100);
                } else if (digit == 4) {
                    arrResult19[i] = (int) ((Math.random() * 9000) + 1000);
                } else {
                    arrResult19[i] = (int) ((Math.random() * 90000) + 10000);
                }

            } else {
                return new int[]{};
            }

        }
        return arrResult19;
    }

    // Task 20
    public static int[] returnArrDigitTwoNumPositive(int[] arr) {
        if ((checkPositiveNumber(arr)) && checkEmptyArray(arr)) {
            int counterDigT = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] / 10 == 2) {
                    counterDigT++;
                }
            }
            int[] result20 = new int[counterDigT];
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] / 10 == 2) {
                    result20[count] = arr[i];
                    count++;
                }
            }
            return result20;

        }
        return new int[]{};

    }

    // Task 21
    public static boolean checkingForTwoDit(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] / 10 >= 1 && arr[i] / 10 < 10) {
                counter++;
            }
            if (counter == arr.length) {
                return true;
            }
        }
        return false;
    }

    public static int[] returnDifferehceBetweenTensAndNnits(int[] arr) {
        if ((checkPositiveNumber(arr)) && checkEmptyArray(arr) && checkingForTwoDit(arr)) {
            int[] result21 = new int[arr.length];
            int counter = 0;

            for (int i = 0; i < arr.length; i++) {
                result21[counter] = (arr[i] / 10) - (arr[i] % 10);
                counter++;
            }
            return result21;
        }
        return new int[]{};
    }


    public static void main(String[] args) {
        task();
        verifyEqual(1, 1);
        verifyEqual(3.14, 3.14);
        verifyEqual("hello", "hello");
        task();
        task();
        task();
        line();
        task();// Task 5
        Integer yearOfBirth = 1983;
        Double myAge = 39.3;
        String hello = " Hello world";

        task();// Task 6

        boolean i6 = yearOfBirth.equals(HW8_1.yearOfBirth1);
        boolean d6 = myAge.equals(HW8_1.myAge1);
        boolean s6 = hello.equals(HW8_1.hello1);
        System.out.println("HW8 \t\t\t\t\t\t|" + "HW8_1   \t\t\t\t\t|" + "areEquals?");
        line();
        System.out.println("Double myAge = " + myAge + "\t\t\t|" + "Double myAge1 = " + HW8_1.myAge1 + "\t\t|"
                + d6);
        line();
        System.out.println("Integer yearOfBirth  = " + yearOfBirth + "|" + "Integer yearOfBirth1 = "
                + HW8_1.yearOfBirth1 + "|" + i6);
        line();
        System.out.println("String hello = " + hello + "\t|" + "String hello1 = " + HW8_1.hello1 + "|"
                + s6);
        line();
        task();// Task 7
        System.out.println(Arrays.toString(returnArray(1, 2, 2, 3, 2)));
        System.out.println(Arrays.toString(returnArray(0, 0, 0, 0, 0)));
        line();

        task();//Task 8
        System.out.println(Arrays.toString(returnArrayDoubleFive(8, 7, 6, 5, 4)));
        line();
        task();// Task 9
        System.out.println(Arrays.toString(returnArrayStringOfFive("a", "b", "c", "d", "e")));
        line();
        task();// Task 10
        System.out.println(Arrays.toString(createArrayByMultiple(returnArray(4, 4, 4, 4, 4), 2.5)));
        System.out.println(Arrays.toString(createArrayByMultiple(returnArray(3, 4, 5, 6, 7), 2.5)));
        line();
        task();// Task 11
        System.out.println(checkPositiveNumber(returnArray(1, 2, 3, 4, 5)));
        System.out.println(checkPositiveNumber(returnArray(1, 1, 1, 1, -1)));
        System.out.println(checkEmptyArray(returnArray(1, 1, 1, 1, 1)));
        int[] arr02 = new int[0];
        int[] arr02_1 = {20, 39, 29, 38};
        int[] arr02_2 = {0, 1, 15, 3, 4};
        System.out.println(checkEmptyArray(arr02));
        System.out.println(checkPositiveNumber(arr02_2));
        line();

        System.out.println(giveMeAmountOfEvenNumberIfNoNegative(arr02));
        System.out.println(giveMeAmountOfEvenNumberIfNoNegative(arr02_1));
        System.out.println(giveMeAmountOfEvenNumberIfNoNegative(arr02_2));


        // Task 12
        task();
        System.out.println(giveMeAmountOfOddNumberIfNoNegativeint(arr02));
        System.out.println(giveMeAmountOfOddNumberIfNoNegativeint(arr02_1));
        System.out.println(giveMeAmountOfOddNumberIfNoNegativeint(arr02_2));
        line();
        System.out.println(Arrays.toString(returnArrOddNumberOfPositiveNumber(arr02_1)));
        System.out.println(Arrays.toString(returnArrOddNumberOfPositiveNumber(arr02_2)));

        //Task 13
        task();
        System.out.println(Arrays.toString(returnBoolenIfNumGreaterTen(arr02_2)));
        line();

        // Task 14
        task();
        String[] test = {"hello", " world", "!", "-", "=", "+"};
        System.out.println(returnString(test));

        //Task 15
        task();
        System.out.println(returnSumNumberArr(arr02_2));
        line();
        System.out.println(Arrays.toString(arr02_2));
        System.out.println(sumNumInTwoHalfArr(arr02_2));
        System.out.println(sumNumInTwoHalfArr(arr02));
        System.out.println(sumNumInTwoHalfArr(arr02_1));

        // Task 16
        task();
        System.out.println(Arrays.toString(returnMultipleTable(3)));
        System.out.println(Arrays.toString(returnMultipleTable(2)));
        System.out.println(Arrays.toString(returnMultipleTable(-5)));

        // Task 17
        task();
        System.out.println(Arrays.toString(returnLargestArrOddOrEven(arr02_2)));
        System.out.println(Arrays.toString(returnLargestArrOddOrEven(arr02_1)));

        // Task 18
        task();
        System.out.println(Arrays.toString(returnArrRandomNumOfHundred(8)));
        System.out.println(Arrays.toString(returnArrRandomNumOfHundred(11)));
        System.out.println(Arrays.toString(returnArrRandomNumOfHundred(0)));

        // Task 19
        task();
        System.out.println(Arrays.toString(returnArrRandomPositiveDigNum(10, 1)));
        System.out.println(Arrays.toString(returnArrRandomPositiveDigNum(10, 2)));
        System.out.println(Arrays.toString(returnArrRandomPositiveDigNum(10, 3)));
        System.out.println(Arrays.toString(returnArrRandomPositiveDigNum(10, 4)));
        System.out.println(Arrays.toString(returnArrRandomPositiveDigNum(10, 5)));
        System.out.println(Arrays.toString(returnArrRandomPositiveDigNum(10, 6)));

        //Task 20
        task();
        System.out.println(Arrays.toString(returnArrDigitTwoNumPositive(returnArrRandomNumOfHundred(25))));
        System.out.println(Arrays.toString(returnArrDigitTwoNumPositive(arr02_1)));

        // Task 21
        task();
        System.out.println(checkingForTwoDit(arr02_1));
        int[] test21 = {92, -24, 25, 26, 27, 28, 29, 30};
        System.out.println(Arrays.toString(returnDifferehceBetweenTensAndNnits(test21)));


    }


}
