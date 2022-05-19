package homework;

import javax.swing.*;
import java.util.Arrays;

public class HW7 {

    public static int number = 1;


    public static void task() {
        System.out.println("*".repeat(25) + "Task" + number + "*".repeat(25));
        number++;
    }

    // task 18
    public static double returnAverage(int[] arr18) {
        double average18 = 0;
        for (int i = 0; i < arr18.length; i++) {
            average18 += arr18[i];
        }
        return average18 / arr18.length;
    }

    // Task 21
    public static int[] getMinMaxAverage(int[] arr21) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr21.length; i++) {
            if (min > arr21[i]) {
                min = arr21[i];
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr21.length; i++) {
            if (max < arr21[i]) {
                max = arr21[i];
            }
        }
        int average21 = 0;
        int average = 0;
        for (int i = 0; i < arr21.length; i++) {
            average21 += arr21[i];
            average = average21 / arr21.length;
        }
        int[] result = new int[3];
        result[0] = min;
        result[1] = max;
        result[2] = average;
        return result;


    }


    public static void main(String[] args) {
        String line = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";

        task(); //Task 1

        String[] catsNames = new String[8];
        catsNames[0] = "Murka";
        catsNames[1] = "Murzik";
        catsNames[2] = "Tishka";
        catsNames[3] = "Belyash";
        catsNames[4] = "Marsel";
        catsNames[5] = "Hvostik";
        catsNames[6] = "Pyatnishko";
        catsNames[7] = "Sonya";
        for (int i = 0; i < 8; i++) {
            System.out.println(catsNames[i]);
        }
        System.out.println(line);

        task();// Task 2
        catsNames[4] = "Rizik";
        catsNames[1] = "Chernish";
        for (int i = 0; i < 8; i++) {
            System.out.println(catsNames[i]);
        }
        System.out.println(line);

        task();// Task 3
        String[] catsColors = new String[8];
        catsColors[0] = "Seriy";
        catsColors[1] = "Cherniy";
        catsColors[2] = "Beliy";
        catsColors[3] = "Beliy";
        catsColors[4] = "Riziy";
        catsColors[5] = "Riziy";
        catsColors[6] = "Pyatnistiy";
        catsColors[7] = "Pyatnistiy";
        for (int i = 0; i < 8; i++) {
            System.out.println(catsColors[i]);
        }
        System.out.println(line);


        task();// Task 4
        int[] catsAges = new int[8];
        catsAges[0] = 1;
        catsAges[1] = 2;
        catsAges[2] = 3;
        catsAges[3] = 4;
        catsAges[4] = 5;
        catsAges[5] = 6;
        catsAges[6] = 7;
        catsAges[7] = 8;
        for (int i = 0; i < 8; i++) {
            System.out.println(catsAges[i]);
        }
        System.out.println(line);

        task();// Task 5
        boolean[] isCatRed = new boolean[8];
        isCatRed[0] = false;
        isCatRed[1] = false;
        isCatRed[2] = false;
        isCatRed[3] = false;
        isCatRed[4] = true;
        isCatRed[5] = true;
        isCatRed[6] = false;
        isCatRed[7] = false;

        task();// Task 6
        // -1imya kota v korobke 6
        System.out.println(catsNames[5]);
        System.out.println(line);
        // -2imena kotov iz korobok s chetnimi indexami
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0 && !(i == 0)) {
                System.out.println(catsNames[i]);
            }
        }
        System.out.println(line);
        //-3imena kotov s indexami kratnimi 4
        for (int i = 0; i < 8; i++) {
            if (i % 4 == 0 && !(i == 0)) {
                System.out.println(catsNames[i]);
            }
        }
        System.out.println(line);
        //-4
        for (int i = 0; i < 8; i++) {
            if (!(i == 0) && i % 2 == 1) {
                System.out.println(catsColors[i]);
            }
        }
        System.out.println(line);
        //-5 cvet kotov iz korobok s indexami kratnimi 3
        for (int i = 0; i < 8; i++) {
            if (!(i == 0) && i % 3 == 0) {
                System.out.println(catsColors[i]);
            }
        }
        System.out.println(line);

        task();// Task 7
        for (int i = 0; i < 8; i++) {
            if (catsColors[i] == "Seriy") {
                System.out.println("Nakormi kota  -" + catsNames[i]);
            }
        }
        System.out.println(line);

        task();// Task 8
        for (int i = 0; i < 8; i++) {
            if (catsAges[i] < 2) {
                System.out.println("Otnesi kota na privivku   - " + catsNames[i]);
            }
        }
        System.out.println(line);
        task();// Task 9
        for (int i = 0; i < 8; i++) {
            if (i == 7) {
                System.out.println(catsNames[i] + "  " + catsAges[i] + "  let" + " cvet -" + catsColors[i]);
            }
        }
        System.out.println(line);
        // Task 9 ideal desition
        for (int i = 0; i < catsNames.length; i++) {
            if ((catsNames.length == catsColors.length) && (catsNames.length == catsAges.length)) {
                if (i == (catsNames.length - 1)) {
                    System.out.println(catsNames[i] + "  " + catsAges[i] + "  let" + " cvet -" + catsColors[i]);
                }
            }
        }
        System.out.println(line);

        task();// Task 10
        if (catsAges.length == catsColors.length) {
            for (int i = 0; i < 8; i++) {
                if (catsAges[i] > 2) {
                    System.out.println(catsNames[i]);
                }
            }
        }
        System.out.println(line);

        task();// Task 11
        if (catsNames.length == isCatRed.length && catsNames.length != 0) {
            for (int i = 0; i < 8; i++) {
                if (catsNames[i].equals("Rizik") && isCatRed[i] == true) {
                    System.out.println("Nakormi kota!");
                }
            }
        }
        task(); // Task 12
        double averageCatAges = (double) (catsAges[0] + catsAges[1] + catsAges[2] + catsAges[3] + catsAges[4]
                + catsAges[5] + catsAges[6] + catsAges[7]) / 8;
        System.out.println(averageCatAges);
        System.out.println(line);

        // task 12 second desicion
        double sum = 0;
        for (int i = 0; i < catsAges.length; i++) {
            sum = sum + catsAges[i];
        }
        System.out.printf("%.1f%n", sum / catsAges.length);


        task();// Task 13
        int min1 = Math.min(Math.min(Math.min(catsAges[0], catsAges[1]), catsAges[2]), catsAges[3]);
        int min2 = Math.min(Math.min(Math.min(catsAges[4], catsAges[5]), catsAges[6]), catsAges[7]);
        int min = Math.min(min1, min2);
        System.out.println(min);

        // task 13 second desicion
        int min13 = catsAges[0];
        for (int i = 0; i < catsAges.length; i++) {
            if (min13 > catsAges[i]) {
                min13 = catsAges[i];
            }
        }
        System.out.println(" smallest cat age " + min13);


        task();//Task 14

        int max1 = Math.max(Math.max(Math.max(catsAges[0], catsAges[1]), catsAges[2]), catsAges[3]);
        int max2 = Math.max(Math.max(Math.max(catsAges[4], catsAges[5]), catsAges[6]), catsAges[7]);
        int max = Math.max(max1, max2);
        System.out.println(max);

        // task 14 second desicion
        int max14 = catsAges[0];
        for (int i = 0; i < catsAges.length; i++) {
            if (max14 < catsAges[i]) {
                max14 = catsAges[i];
            }
        }
        System.out.println(" Largest cat age " + max14);


        task(); //Task 15
        for (int i = 0; i < 8; i++) {
            if (catsColors[i] == "Seriy") {
                System.out.println(catsNames[i] + " - " + catsColors[i]);
            }
        }
        //task 15 second desicion
        int greyCat = 0;
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Seriy")) {
                greyCat++;
            }
        }
        System.out.println(greyCat);


        task(); // Task 16
        if (catsNames.length == catsAges.length) {
            for (int i = 0; i < 8; i++) {
                if (i % 2 == 0 && !(i == 0) && catsAges[i] <= 3) {
                    System.out.println(catsNames[i]);
                }
            }
        }
        task();// Task 17
        int index = 0;
        for (int j = 0; j <= 10; j += 2) {
            index++;
        }
        int[] arr17 = new int[index];
        int number = 0;
        for (int i = 0; i < arr17.length; i++) {
            arr17[i] = number;
            number += 2;
        }
        System.out.println(Arrays.toString(arr17));
        System.out.println(line);

        task();// Task 18

        System.out.println(Arrays.toString(catsAges));
        System.out.println(returnAverage(catsAges));
        HW5.verifyEqual(4.5, returnAverage(catsAges));
        System.out.println(line);

        task(); // Task 19
        int index19 = 0;
        for (int i = -999; i <= -900; i += 2) {
            index19++;
        }
        int[] arr19 = new int[index19];
        int number19 = -999;
        for (int j = 0; j < arr19.length; j++) {

            arr19[j] = number19;
            number19 += 2;
        }
        System.out.println(Arrays.toString(arr19));
        System.out.println(line);

        task();// Task 20
        int[] arr20 = new int[10];
        for (int i = 0; i < 10; i++) {
            arr20[i] = ((int) (Math.random() * 10));
            System.out.println(arr20[i]);
        }
        //arr20[i] = ((int) (Math.random() * Integer.MAX_VALUE));
        System.out.println(line);

        task();// Task 21
        System.out.println(Arrays.toString(getMinMaxAverage(catsAges)));
        System.out.println(line);

        task();// Task 22
        int lengthEven = 0;
        int lengthOdd = 0;

        for (int i = 0; i < arr20.length; i++) {
            if (arr20[i] % 2 == 0) {
                lengthEven++;
            } else {
                lengthOdd++;
            }
        }
        int[] even = new int[lengthEven];
        int[] odd = new int[lengthOdd];

        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < arr20.length; i++) {
            if (arr20[i] % 2 == 0 && countEven < even.length) {
                even[countEven] = arr20[i];
                countEven++;
            } else if (countOdd < odd.length) {
                odd[countOdd] = arr20[i];
                countOdd++;
            }
        }
        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));


    }


}
