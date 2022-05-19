package homework;

public class HW2 {
    public static void main(String[] args) {
        int k = 5;
        int l = 10;
        int m = 15;
        String line = "____________";
        int sumKL = k + l;
        int mulKM = k * m;
        int subLM = l - m;
        int apple;
        int student;
        apple = 40;
        student = 6;
        int devAppleStudent = apple / student;


        System.out.println("Task 12");
        System.out.println("  " + k);
        System.out.println(" " + l);
        System.out.println(m);
        System.out.println(line);

        System.out.println("Task 13");
        /**
         * kommentariy
         */
        System.out.println(k + ", " + l + ", " + m);
        System.out.println(line);

        System.out.println("Task 14");
        System.out.println(8 + ", " + 13 + ", " + 113);
        System.out.println(line);

        System.out.println("Task 15");
        System.out.println("int k = " + 5 + ";");
        System.out.println("int l = " + 30 + ";");
        System.out.println("int m = " + 100 + ";");
        System.out.println(line);

        System.out.println("Task 16");
        System.out.println(" Sum of k  and  l = " + sumKL);
        System.out.println(" k * m = " + mulKM);
        System.out.println("Difference of variables l and m  = " + subLM);
        System.out.println(line);

        System.out.println("Task 17");
        System.out.println("Division result k na l = " + (k / l) + ", and the remainder of the division = " + (k % l));
        System.out.println("Division result k na m = " + (k / m) + ", and the remainder of the division = " + (k % m));
        System.out.println("Division result l na m = " + (l / m) + ", and the remainder of the division = " + (l % m));
        System.out.println("Division result m na k = " + (m / k) + ", and the remainder of the division = " + (m % k));
        System.out.println(line);

        System.out.println("Task 18");
        System.out.println(" If " + apple + " apples  divided by " + student + " the number of students, "
                + "then each student will receive " + devAppleStudent + " apple(s), and " + (apple % student)
                + " apple(s) will remain for the theacher.");

        int apple1 = 100;
        int student1 = 21;
        System.out.println(" If " + apple1 + " apples  divided by " + student1 + " the number of students, "
                + "then each student will receive " + (apple1 / student1) + " apple(s), and " + (apple1 % student1)
                + " apple(s) will remain for the theacher.");
        System.out.println(line);

        System.out.println("Task 19");
        int sumLKM = l + k + m;
        m++;
        int sumKLM = k + l + m;

        System.out.println(sumKLM);
        sumKLM--;
        int x1 = sumKLM + sumKLM--;
        System.out.println(x1);
        System.out.println("Task 19.2");
        int m1 = m;
        int y1 = m1 - sumLKM;

        System.out.println(y1);
        System.out.println("Task 20");
        // int a = 48;
        //int b = 47;
        // int c = 49;
        //int d = 8;
        // int divAD = a % d;

        // System.out.println(" if 48 : 8  i ostatok ot deleniya  " + divAD + "; ===> 48 kratno 8");
        //System.out.println(" if 48 : 2 i ostatok ot deleniya " + (a % 2 ) + "; " + a + "  ==> chetnoe");
        //System.out.println(" if 8 : 2 i ostatok ot deleniya " + (d % 2 ) + "; " + d + "  ==> chetnoe");
        // System.out.println(" if 47 : 2 i ostatok ot deleniya " + (b % 2 ) + "; " + b  + "  ==> nechetnoe");
        // System.out.println(" if 49 : 2 i ostatok ot deleniya " + (c % 2 ) + "; " + c  + "  ==> nechetnoe");
        // System.out.println(line);


        System.out.println("Task 21,22,23");
        int x = 2;
        int y = 3;
        int a = k;
        int b = l;
        int c = m;
        int d = y - x;
        int result21 = ((x + 3) * (x + 3));
        int result22 = (((3 + 4 * x) / 5) - ((10 * (y - 5) * (a + b + c)) / x) + (9 * (4 / x + (9 + x) / y)));
        // int result23 = ((((5*x + 7*y) / (8*x + 10*y))  /((3*x-y) / (x +y))) / (a + b + c / d +(a +b) /(c +d) +a*b));

        System.out.println(" _____________________________________________________");
        System.out.println("|                  |                                  | ");
        System.out.println("|    task          |        result                    |");
        System.out.println(" _____________________________________________________ ");
        System.out.println("|                  |                                  | ");
        System.out.println("|   21             |       " + result21 + "                         | ");
        System.out.println(" _____________________________________________________ ");
        System.out.println("|                  |                                  | ");
        System.out.println("|   22             |       " + result22 + "                        | ");
        System.out.println(" _____________________________________________________ ");
        System.out.println("|                  |                                  | ");
        //System.out.println("|   23             |       " + result23 + "                        | ");
        System.out.println(" _____________________________________________________ ");


    }

}
