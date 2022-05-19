package lesson;

public class Lesson4 {
    /* Danyi tri chisla.Nayti MAX-no tochnuyu raznizy mezdu MIN chislom i srednim znacheniem.
    Esli raznicza > 3.51 to pokazat polzovatelyu soobschenie "Bolshoy razbros chisel" inache pokazat soobschenie
    "Malenkiy razbros chisel".
     */
    public static int returnMinOfThree(int a, int b, int c) {
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        if (min < c) {

            return min;
        } else {
            min = c;
            return min;
        }
    }

    public static double averageOfThree(int a, int b, int c) {

        return ((double) a + b + c) / 3;
    }

    public static double countDifference(int a, int b, int c) {

        int min = returnMinOfThree(a, b, c);
        double average = averageOfThree(a, b, c);
        double difference = min - average;
        if (difference < 0) {
            difference = (-1) * difference;
        }
        return difference;
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        int c = 10;
        if (countDifference(a, b, c) > 3.51) {
            System.out.println("Bolshoy rasbros chisel");
        } else {
            System.out.println("Malenkiy razbros chisel");
        }

    }

}
