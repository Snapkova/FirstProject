package homework;

public class HW4 {
    public static int number = 3;

    public static void task() {
        System.out.println("*".repeat(25) + "Task" + number + "*".repeat(25));
        number++;
    }

    // task 14
    public static int defResult;
    public static int defBack;

    public static void Math(int firstNum, int secondNum) {
        defResult = firstNum / secondNum;
        defBack = firstNum % secondNum;
        System.out.println("Division result " + firstNum + " on " + secondNum + " = " + defResult
                + ", remainder of the division =" + defBack);
    }

    //15
    public static int appleForEachSdudent;
    public static int appleForTheacer;

    public static void text(int apple, int student) {
        appleForEachSdudent = apple / student;
        appleForTheacer = apple % student;
        System.out.println("If " + apple + " apples divide by " + student + " students,then each student will receive "
                + appleForEachSdudent + " apples, then " + appleForTheacer + " the teacher will get.");
    }
    //16

    public static String writeApple(int apple) {
        int appleLastNumber = apple % 10;
        int appleLastnumberOfHundret = apple % 100;
        String apples = " ";
        if (appleLastnumberOfHundret >= 5 && appleLastnumberOfHundret <= 20) {
            apples = " yablok";
        } else if (appleLastNumber == 1) {
            apples = " yabloko";
        } else if (appleLastNumber >= 2 && appleLastNumber <= 4) {
            apples = "yablaka";
        } else {
            apples = "yablok";
        }
        return apples;

    }

    public static String writeStudent(int student) {
        int studentLastNumber = student % 10;
        int studentLastNameOfHundret = student % 100;
        String student13 = " ";
        if (studentLastNameOfHundret >= 5 && studentLastNameOfHundret <= 20) {
            student13 = "uchenikov";
        } else if (studentLastNumber == 1) {
            student13 = "uchenik";
        } else if (studentLastNumber >= 2 && studentLastNumber <= 4) {
            student13 = "uchenika";
        } else {
            student13 = "uchenikov";
        }
        return student13;
    }

    public static void result13(int numOfApples, int numOfStudents) {
        System.out.println("If " + numOfApples + " " + writeApple(numOfApples) + " divide by " + numOfStudents
                + " " + writeStudent(numOfStudents) + " then each student receive " + (numOfApples / numOfStudents)
                + writeApple(numOfApples / numOfStudents) + ", and " + (numOfApples % numOfStudents)
                + " " + writeApple(numOfApples % numOfStudents) + " the teacher will get.");
    }

    //task 17
    public static void rezult17(double tempC) {
        double tempF = tempC * 1.8 + 32;
        System.out.println(tempF);
    }

    //18
    public static double getPow(int i) {
        double a18 = 2;
        a18 = Math.pow(i, a18);

        return a18;
    }


    public static void main(String[] args) {


        task();
        System.out.println("1)" + ((2 == 2) && (7 == 7)));
        System.out.println("2)" + (!(15 < 3)));
        String a1 = "Pine";
        String a2 = "Oak";
        String a3 = "Cherry";
        String a4 = "Maple";
        System.out.println("3)" + (((a1 == a2) || (a3 == a4))));
        System.out.println("4)" + ((!(a1 == a2))));
        System.out.println("5)" + (((!(15 < 3)) && (10 > 20))));
        String phrase1 = " eyes are given to see";
        String constant = " eyes are given to see";
        String phrase2 = "under the third floor is the second floor";
        String constant2 = "under the third floor is the second floor";
        System.out.println("6)" + ((constant.equals(phrase1)) && (constant2.equals(phrase2))));
        System.out.println("7)" + ((6 / 2 == 3) || (7 * 5 == 20)));

        task();
        String phrase41 = "working clock shows the time";
        String constant41 = "working clock shows the time";
        int deva41 = 300 / 5;
        System.out.println("1)" + ((60 == 70) || (constant41.equals(phrase41))));
        System.out.println("2)" + ((!(28 > 7)) && (deva41 == 60)));
        System.out.println((!(28 > 7) && !(deva41 == 60)));
        //String phrase43 = "TV - electrical device";
        //constant4 = "TV - electrical device";
        if (!(300 < 100)) {
            System.out.println("4) thirst can be quanched with water");
        }
        if (75 < 81) {
            System.out.println("88 = 88");
        }
        task();
        int ageA = 40;
        int ageN = 35;
        int ageS = 25;
        if (ageA > ageS && ageN > ageS) {
            System.out.println("Andrey starshe Svetyi. Natasha starshe Svetyi.");
        }
        //Na polke stoyat uchebniki, a na stole lezat spravochniki.
        String place = "shelf";
        String item;
        if (place == "shelf") {
            item = "textbook";
            System.out.println(item);
        }
        if (place == "desk") {
            item = "reference book";
            System.out.println(item);
        }
        int children = 100;
        int girls = 65;
        int boys = children - girls;
        if (children / 2 < girls) {
            System.out.println("Most of the children are girls. The rest of " + boys + " the boys.");
        }
        task();
        int minLimit = 16;
        int age = 13;
        String phrase61 = "Get a driver's lisence ";
        String phrase62 = "can't get a driver's lisence";
        if (minLimit < age) {
            System.out.println(phrase61);
        } else {
            System.out.println(phrase62);
        }
        task();
        String action1 = "Rides on the book";
        String action2 = "read book";
        String action3 = "Looking out the window";
        //!(action1 && (action2 || action3));

        task();
        String you = "with friend";
        if (you.equals("with friend")) {
            System.out.println("if with friends - good");
        } else {
            System.out.println("when the opposite is bed");
        }
        task();
        age = 11;
        if (age > 0) {
            if (age > 18) {
                System.out.println("Adult");
            } else {
                System.out.println("Child");
            }
        }
        //9.2
        String land = "dry";
        if (land == "dry") {
            System.out.println("No rain");
        } else if (land == "wet") {
            System.out.println("it's raining");
        } else {
            System.out.println("snowing");
        }
        //9.3
        String sky = "clouds";
        if (sky == "clouds") {
            System.out.println("raining");
        } else {
            System.out.println("blind raining");
        }
        //9.4
        String today = "saturday";
        if (today == "saturday") {
            System.out.println("If today " + today + " then tomorrow sunday");
        } else if (today == "friday") {
            System.out.println("if today friday so yesterday was thursday ");
        } else {
            System.out.println("otherwise yesterday it was not thursday and tomorrow not sunday");

        }
        //9.5
        action1 = "whistled";
        if (action1 == "whistled") {
            System.out.println("eternity has passed");
        } else {
            System.out.println("wait further");
        }
        //9.6
        int youAge = 21;
        String finishedSchool = "finished school";
        if ((youAge > 18) || (finishedSchool.equals("finished school"))) {
            System.out.println("you may not live with your parents");
        } else {
            System.out.println("stay live with parents");
        }
        task();
        int a10 = 21;
        if (a10 % 2 == 0) {
            a10 = a10 * 2;
        } else {
            a10 = a10 * a10;
        }
        System.out.println(a10);

        task();
        age = 20;
        if (age >= 18) {
            System.out.println("you can vote");
        } else {
            System.out.println("you can't vote");
        }
        if (age >= 16) {
            System.out.println("can you drive a car");
        } else {
            System.out.println("can't drive");
        }
        if (age >= 5 && age <= 18) {
            System.out.println("you go to school");
        } else {
            System.out.println(" you can not go to school");

        }
        task();
        int mark = 5;
        if (mark > 5 || mark < 2) {
            System.out.println("falls");
        } else if (mark == 5) {
            System.out.println("issue a certificate of merit and transfer to the next class");
        } else if (mark == 4) {
            System.out.println("Transfer to the next class");
        } else if (mark == 3) {
            System.out.println("give a task for the summer and transfer to the next class");
        } else if (mark == 2) {
            System.out.println("call parents and leave in the current class for the second year");
        }
        task();
        // task 12
        int a = 1;
        int b = 0;
        int sum;
        int sub;
        int mult;
        if (a % 3 == 0 && b % 3 == 0) {
            sum = a + b;
            System.out.println(sum);
        } else if (a % 5 == 0 && b % 5 == 0) {
            sub = a - b;
            System.out.println(sub);
        } else if ((a % 2 == 0 && b % 2 == 0) && a >= 0 && b >= 0) {
            mult = a * b;
            System.out.println(mult);
        } else if (a % 2 == 0 && b % 2 == 0 && (a < 0) || (b < 0)) {
            mult = (-1) * (a * b);
            System.out.println(mult);
        } else {
            System.out.println("Impossible to take action");
        }
        // Task 13

        int a131 = 1;
        int a132 = 0;
        int sum13 = a131 + a132;
        int sub13 = a131 - a132;
        int mult13 = a131 * a132;
        if (a131 % 3 == 0 && a132 % 3 == 0) {
            System.out.println(sum13);
        } else if (a131 % 5 == 0 && a132 % 5 == 0) {
            System.out.println(sub13);
        } else if ((a131 % 2 == 0 && a132 % 2 == 0) && a >= 0 && b >= 0) {
            System.out.println(mult13);
        } else if ((a131 % 2 == 0 && a132 % 2 == 0) && (a < 0) || (b < 0)) {
            mult13 = (-1) * mult13;
            System.out.println(mult13);
        } else {
            System.out.println("Impossible to take action");
        }

        //task 14
        task();
        int k;
        int l;
        int m;
        k = 5;
        l = 30;
        m = 100;


        Math(k, l);
        Math(k, m);
        Math(l, m);
        Math(m, k);

        task();
        text(40, 6);
        text(100, 21);

        //task 16
        task();

        result13(42, 42);
        result13(55, 5);
        result13(1, 2);

        // Task 17
        task();
        rezult17(21);
        rezult17(26);

        //Task 17
        task();
        String line = "_____________________________";
        System.out.println(line);
        System.out.println("|  i ^ 2           |" + getPow(2) + "      |");
        System.out.println(line);

        //task 21
        task();
        short s = -3276;
        if (s < 0) {
            s = (short) ((-1) * s);
        }
        if (s < 10) {
            System.out.println("it's one-digital number");
        } else if (s < 100) {
            System.out.println("it's two-digital number ");
        } else if (s < 1000) {
            System.out.println(" it's three-digital number");
        } else if (s < 10000) {
            System.out.println("it's four-digital number");
        } else if (s < 100000) {
            System.out.println("it's five-digital number");
        }


    }


}
