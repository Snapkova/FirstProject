package homework;

import java.io.FilterOutputStream;

public class HW3 {

    public static void main(String[] args) {
        String line = "___________________-";

        System.out.println("Task 2");
        System.out.println(line);

        byte a;
        byte b;
        a = 10;
        b = 126;
        System.out.println(a);
        System.out.println(b);
        System.out.println(line);

        System.out.println("Task 3");
        // two solutions.
        //short s;
        //short t;
        //s = -30000;
        //t = 30000;
        //System.out.println(s);
        //System.out.println(t);
        //System.out.println(line);
        short s = Short.MIN_VALUE;
        short t = Short.MIN_VALUE + 60000;
        System.out.println(s);
        System.out.println(t);
        System.out.println(line);


        System.out.println("Task 4");
        int i;
        i = -2147483648;
        //i = 2147483647;
        System.out.println("___________________________________________");
        System.out.println("|          |                               |");
        System.out.println("|  int min |" + i + "                    |");
        System.out.println("___________________________________________");
        System.out.println("|          |                               |");
        i = 2147483647;
        System.out.println("|  int max |" + i + "                     |");
        System.out.println("___________________________________________");

        System.out.println("Task 5");
        long phoneNumber;
        phoneNumber = 18009998877L;
        System.out.println(phoneNumber);
        System.out.println(line);

        System.out.println("Task 6");
        float f;
        f = 100.101101F;
        double d;
        d = 1000.101101;
        System.out.println("________________________________________________________");
        System.out.println("|                       |                               |");
        System.out.println("|float f = 100.101101   |" + f + "                     |");
        System.out.println("________________________________________________________");
        System.out.println("|                       |                               |");
        System.out.println("|double d = 100.101101  |" + d + "                    |");
        System.out.println("_________________________________________________________");

        // Task 7
        Double dd;
        dd = 10.09999 + 20.099999;
        Float ff;
        ff = 10.09999F + 20.099999F;
        System.out.println("|                       |                               |");
        System.out.println("|Float ff               |" + ff + "                       |");
        System.out.println("________________________________________________________");
        System.out.println("|                       |                               |");
        System.out.println("|Double dd              |" + dd + "             |");
        System.out.println("_________________________________________________________");

        System.out.println("Task 8");
        double result;
        result = 10.0 / 3;
        System.out.println(result);
        System.out.println(line);

        System.out.println("Task 9");
        double sum, product, quotient, reminder;
        sum = f + d;
        product = f * d;
        quotient = f / d;
        reminder = f % d;
        System.out.println(sum + " ; " + product + " ; " + quotient + " ; " + reminder);
        System.out.println(line);

        System.out.println("Task 10");
        System.out.println("*     *  *******  *         *            **     ");
        System.out.println("*     *  *        *         *          *    *");
        System.out.println("*******  ******   *         *         *      *");
        System.out.println("*     *  *        *         *          *    *");
        System.out.println("*     *  *******  ********  *******      **");
        System.out.println(line);

        System.out.println("Task 11");
        byte t1 = 0;
        short t2 = 150;
        byte t3 = -120;
        float t4 = -505.505F;
        int t5 = 100100;
        long t6 = 100010001000L;
        double t7 = 2.66666666666666;
        double t8 = -1000000.001;
        short t9 = 1010;
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);
        System.out.println(t7);
        System.out.println(t8);
        System.out.println(t9);
        System.out.println(line);

        System.out.println("Task 12");
        System.out.println("____________________________________________________________________________________");
        System.out.println("| Type         | Size in bits | min                   |"
                + " max                        |");
        System.out.println("____________________________________________________________________________________");
        System.out.println("|  byte        |" + Byte.SIZE + "             |" + Byte.MIN_VALUE + "                   | "
                + Byte.MAX_VALUE + "                        |");
        System.out.println("____________________________________________________________________________________");
        System.out.println("| short        |" + Short.SIZE + "            |" + Short.MIN_VALUE + "                 | "
                + Short.MAX_VALUE + "                      |");
        System.out.println("____________________________________________________________________________________");
        System.out.println("| int          |" + Integer.SIZE + "            |" + Integer.MIN_VALUE + "            | "
                + Integer.MAX_VALUE + "                 |");
        System.out.println("____________________________________________________________________________________");
        System.out.println("| long         |" + Long.SIZE + "            |" + Long.MIN_VALUE + "   | "
                + Long.MAX_VALUE + "        |");
        System.out.println("____________________________________________________________________________________");
        System.out.println("| float        |" + Float.SIZE + "            |" + Float.MIN_VALUE + "                | "
                + Float.MAX_VALUE + "               |");
        System.out.println("____________________________________________________________________________________");
        System.out.println("| double       |" + Double.SIZE + "            |" + Double.MIN_VALUE + "               | "
                + Double.MAX_VALUE + "     |");
        System.out.println("____________________________________________________________________________________");

        System.out.println("Task 13");
        Integer num1;
        Integer num2;
        num1 = 3;
        num2 = 3;
        String text13 = " , to rezultat sravneniya metodom .equal = ";

        System.out.println("Esli num1 = num2" + text13 + num1.equals(num2) + ".");
        num1 = 8;
        num2 = 4;
        System.out.println("Esli num1 ne ravno num2" + text13 + num1.equals(num2) + ".");
        System.out.println(line);

        System.out.println("Task 14");
        int number1;
        int number2;
        number1 = 10;
        number2 = 10;
        String text141 = "Esli number1";
        String text142 = " number2, to resultat sravneniya metodom compare = ";
        System.out.println(text141 + " = " + text142 + (Integer.compare(number1, number2)));
        number1 = 5;
        System.out.println(text141 + " < " + text142 + (Integer.compare(number1, number2)));
        number2 = 4;
        System.out.println(text141 + " > " + text142 + (Integer.compare(number1, number2)));
        System.out.println(line);

        System.out.println("Task 15");
        Float num3 = 234.9999F;
        System.out.println("num3 = " + num3.intValue());
        System.out.println(line);

        System.out.println("Task 16");
        double dob1 = 20.445;
        double dob2 = 10.545;
        System.out.println(" dob1 + dob2 = " + Double.sum(dob1, dob2));
        System.out.println(line);

        System.out.println("Task 17");
        Float fl1 = 12.34F;
        Float fl2 = 34.12F;
        System.out.println("fl1 + fl2 = " + Integer.sum(fl1.intValue(), fl2.intValue()));
        System.out.println(line);

        System.out.println("Task 18");
        Short short1 = 12000;
        Short short2 = 12300;
        System.out.println("12000 - 12300 = " + Short.compare(short1, short2));
        // or
        System.out.println(short1.compareTo(short2));
        short1 = 12500;
        System.out.println("12500 - 12300 = " + Short.compare(short1, short2));
        //or
        System.out.println("12500 - 12300 = " + short1.compareTo(short2));
        System.out.println(line);
        System.out.println("Task 19");
        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;
        System.out.println("doub1 - doub2 = " + (doub1 - doub2));
        System.out.println("str1 - str2 = " + (Double.valueOf(str1) - Double.valueOf(str2)));
        // or
        System.out.println(Double.parseDouble(str1) - Double.parseDouble(str2));
        System.out.println(line);

        System.out.println("Task 20");
        Double tCat;
        tCat = 40.55;//max
        Double average;
        average = tCat / 2;
        tCat = 35.15; //min
        average = average + tCat / 2;
        System.out.println(Math.round(average));
        System.out.println(line);

        System.out.println("Task 21");
        Number n = Double.MAX_VALUE;
        n = 10;
        n = 10.999999999;

        System.out.println("Variable may have the following vallues: \n"
                + "n = " + Double.MAX_VALUE + "; \n"
                + "n = " + n.intValue() + "; \n"
                + "n = " + n + "; \n"
                + "This is possible because class Number is the superclass or platform classes representing numeric ");
        System.out.println(line);

        System.out.println("Task 22");
        Integer numberinteger = 100;
        System.out.println(numberinteger + 1);
        System.out.println(numberinteger.toString() + 1);
        // chto i trebovalos dokazat
        System.out.println(line);

        System.out.println("Task 23");
        double gradC = 36.6;
        double gradF = gradC * 1.8 + 32;
        System.out.println(" 36.6 po celsiyu = " + gradF + " gradusov po faringeytu");
        double kg = 50;
        double lbs = kg * 2.205;
        double lb1 = 50;
        double kg1 = lb1 * 0.454;
        System.out.println("50 kilogramm = " + lbs + "lbs, 50 lb = " + kg1 + "kg.");
        System.out.println(line);


    }
}
