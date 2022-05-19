package lesson;

import java.sql.SQLOutput;

public class Lessons {
    public static void main(String[] args) {
        String line = "__________________________________________";
        int a = +5;
        int b = 13;
        int c = 113;
        int d = -5;
        int sumAB = a + b;
        int subBA = b - a;
        int multAB = a * b;
        int devBA = b / a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("a =   " + a);
        System.out.println("b =  " + b);
        System.out.println("c = " + c);
        System.out.println("sums of variables = " + sumAB);
        System.out.println("sums of variables = " + (a + b));


        System.out.println(a + b + c);
        System.out.println("" + a + b + c);
        System.out.println("" + a + " " + b + " " + c);

        System.out.print(a);
        System.out.print(b);
        System.out.println(c);

        System.out.println(subBA);
        System.out.println(b - a);

        System.out.println(d);
        System.out.println(a + d);
        System.out.println(a - d);
        System.out.println(line);
        System.out.println("On skasal \"Poehali!\" i mahnul rukoy.");
        System.out.println(line);

        System.out.println("yeasterday sunday");
        System.out.println("yeasterday \n sunday");

        System.out.println("yeasterdaymonday");
        System.out.println("yeasterday\tmonday");

        System.out.println(line);
        System.out.println(multAB);
        System.out.println(a * b);

        // delenie
        System.out.println(devBA);
        System.out.println(b / a);

        // ostatochnoe delenie.ostatok ot delenija.
        System.out.println(line);
        System.out.println(a % b);
        System.out.println(b % a);
        System.out.println(line);
        // pokazite chto 25 kratno 5
        System.out.println(25 % 5);

        // 100 ne kratno 3
        System.out.println(100 % 3);

        System.out.println(line);
        // unarnyie operatopyi ++ i --
        System.out.println(line);
        a++;
        System.out.println(a);
        System.out.println(a + 1);
        // a++ to ze chto (a + 1)

        b--;
        System.out.println(b);
        System.out.println(b - 1);

    }


}
