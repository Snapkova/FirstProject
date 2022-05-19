package homework;


import java.util.Arrays;
import java.util.Locale;

import static utils.Utils.*;
;

public class HW10 {


    // Task 1
    public static String returnIsNotEmpty(String task1) {

        if (task1.isEmpty()!= true) {
            String task11 = task1.trim();
            if (task1.length() > task11.length()) {

                return "Extra gaps deleted";
            } else {

                return "No gaps";
            }
        } else {

            return "String empty";
        }
    }

    // Task 2
    public static String removeAlla(String task2) {
        if (task2.length() > 0) {
            task2 = task2.replace("a", "");

            return task2;
        } else {
            return "String empty";
        }
    }

    // Task 3
    public static String removeAllZeros(String number) {
        if (number != null) {
            number = number.trim();
            number = number.replace(" ", "");
            number = number.replace("0", "");

            return number;
        } else {
            return "String is empty";
        }

    }

    //Task 4
    public static String removeAllSpaces(String task4) {
        if (task4 != null) {
            if (task4.length() > 0) {
                task4 = task4.replace(" ", "");

                return task4;
            } else {

                return " ";
            }
        } else {

            return " ";
        }
    }

    //Task 5
    public static int howManyLettersA(String task5) {
        task5 = task5.toLowerCase();
        int counter = 0;
        for (int i = 0; i < task5.length(); i++) {
            if (task5.charAt(i) == 'a') {
                counter++;
            }
        }
        return counter;
    }



    // Task 6
    public static boolean thereIsJava(String text6) {
        if (text6.toLowerCase().contains("java")) {
            return true;
        } else {
            return false;
        }

    }

    // Task 7
    public static String addQuotes(String task7) {
        if (task7.length() > 0) {
            task7 = "\"".concat(task7).concat(".\"");

            return task7;
        } else {

            return "String is empty";
        }
    }

    // Task 8
    public static String spellCheckCities(String task8) {
        if (task8.length() > 0) {
            task8 = task8.trim();
            task8 = task8.substring(0, 1).toUpperCase()
                    + task8.substring(1, task8.length());

            return task8;
        } else {

            return " String is empty";
        }
    }

    // Task 9
    public static String betweenIndex(String text9, String parameter) {
        if (text9.length() > 0) {
            text9 = text9.substring(text9.indexOf(parameter), (text9.lastIndexOf(parameter) + 1));

            return text9;
        }

        return "String is empty";
    }

    // Task 10
    public static boolean ifFirstAndLastLetterSame(String word10) {
        if ( word10 != null && word10.length() > 0) {
            word10 = word10.trim().toLowerCase();
            if (word10.substring(0, 1).equals(word10.substring(word10.length() - 1))) {

                return true;
            } else {

                return false;
            }

        } else {

            return false;
        }

    }

    // Task 11
    public static String[] returnMassiveSentence(String sentence11) {
        if (sentence11 != null && sentence11.length() > 0) {
            String[] words = sentence11.split(" ");
            return words;
        } else {
            return new String[]{};
        }
    }

    // Task 12
    public static String[] returnFIO(String sentence12) {
        if (sentence12 !=null && sentence12.length() > 0) {
            String[] fIO = sentence12.split(" ", 3);
            fIO[0] = "Name:" + fIO[0];
            fIO[1] = "Patronymic:" + fIO[1];
            fIO[2] = "LastName:" + fIO[2];
            return fIO;
        } else {
            return new String[]{};
        }
    }

    //Task 13
    public static int returnSumLetters(String word13) {
        if (word13.length() > 0) {
            int sum = 0;
            for (int i = 0; i < word13.length(); i++) {
                if ((word13.charAt(i) >= 65 && word13.charAt(i) <= 90)
                        || (word13.charAt(i) >= 97 && word13.charAt(i) <= 122)) {
                    sum = sum + word13.charAt(i);

                } else return 0;
            }
            return sum;

        } else {
            return Integer.MIN_VALUE;
        }

    }

    //Task 14
    public static boolean method14(String twoLetters) {
        if (twoLetters.length() == 2) {
            twoLetters = twoLetters.trim().toLowerCase();
            if (twoLetters.charAt(0) < twoLetters.charAt(1)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    //task 14 2-y sposob
    public static boolean result14(String letter1, String letter2) {
        if (letter1.length() == 1 && letter2.length() == 1) {
            letter1 = letter1.trim().toLowerCase();
            letter2 = letter2.trim().toLowerCase();
            if (letter1.charAt(0) >= 97 && letter1.charAt(0) < 122
                    && letter2.charAt(0) >= 97 && letter2.charAt(0) < 122) {
                if (letter1.charAt(0) < letter2.charAt(0)) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;

        }
        return false;
    }




    public static void main(String[] args) {
        // Task 1
        task();
        System.out.println(returnIsNotEmpty("  QA4Everyone"));
        System.out.println(returnIsNotEmpty("QA4Everyone"));
        System.out.println(returnIsNotEmpty(""));

        //Task 2
        task();
        System.out.println(removeAlla("  QA4Everyone"));
        System.out.println(removeAlla("panda"));

        // Task 3
        task();
        String tests1 = " 3 5 0 4 2 0 9 7 0 6 0 4 0   0 0 0 ";
        String tests = "0000000111";
        System.out.println(removeAllZeros(" 3 5 0 4 2 0 9 7 0 6 0 4 0   0 0 0 "));
        System.out.println(removeAllZeros(tests));
        System.out.println(removeAllZeros("00000000000000"));
        line();

        // Task 4
        task();
        System.out.println(removeAllSpaces("  QA  4 Everyone"));
        System.out.println(removeAllSpaces("pa nda "));
        line();

        // Task 5
        task();
        System.out.println(howManyLettersA("Abracadabra"));
        System.out.println(howManyLettersA("Homenum Revelio"));

        // Task 6
        task();
        String test = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are "
                + "the current long-term support (LTS) versions.  "
                + "Oracle released the last zero-cost public update for the "
                + "legacy version Java 8 LTS in January 2019 for commercial use,"
                + "although it will otherwise still support"
                + "Java 8 with public updates for personal use indefinitely. "
                + "Other vendors have begun to offer zero-cost builds"
                + "of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        System.out.println(thereIsJava(test));
        test = "As a decrepit father takes delight\n" +
                "To see his active child do deeds of youth,\n" +
                "So I, made lame by fortune’s dearest spite,\n" +
                "Take all my comfort of thy worth and truth.\n" +
                "For whether beauty, birth, or wealth, or wit,\n" +
                "Or any of these all, or all, or more,\n" +
                "Entitled in thy parts do crownèd sit,\n" +
                "I make my love engrafted to this store.\n" +
                "So then I am not lame, poor, nor despised,\n" +
                "Whilst that this shadow doth such substance give\n" +
                "That I in thy abundance am sufficed,\n" +
                "And by a part of all thy glory live.\n" +
                "Look what is best, that best I wish in thee.\n" +
                "This wish I have; then ten times happy me.";
        System.out.println(thereIsJava(test));
        System.out.println("\"Hello\" ");

        // Task 7
        task();
        System.out.println(addQuotes("One"));
        System.out.println(addQuotes("TWO"));

        // Task 8
        task();
        System.out.println(spellCheckCities("tashkent"));
        System.out.println(spellCheckCities("chicago"));

        // Task 9
        task();
        System.out.println(betweenIndex("Abracadabra", "b"));
        System.out.println(betweenIndex("Whippersnapper", "p"));

        // Task 10
        task();
        System.out.println(ifFirstAndLastLetterSame("Abracadabra"));
        System.out.println(ifFirstAndLastLetterSame("Whippersnapper"));
        System.out.println(ifFirstAndLastLetterSame("a"));

        // Task 11
        task();
        System.out.println(Arrays.toString(returnMassiveSentence("QA for everyone")));
        System.out.println(Arrays.toString(returnMassiveSentence("Aleaksandr Sergeevich Pushkin")));

        // Task 12
        task();
        System.out.println(Arrays.toString(returnFIO("Aleaksandr Sergeevich Pushkin ")));

        // Task 13
        task();
        System.out.println(returnSumLetters("abc"));
        System.out.println(returnSumLetters("ABC"));
        System.out.println(returnSumLetters("123"));

        //Task 14
        task();
        System.out.println(method14("am"));
        System.out.println(method14("ml"));
        line();
        System.out.println(result14("a", "m"));
        System.out.println(result14("m", "l"));



    }


}
