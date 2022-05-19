package school;

public class Teacher {
    public static void main(String[] args) {
        String subject = "school.Person.Teacher of Matematics";
        String firstName = "Ivan";
        String middleName = "Petrovich";
        String lastName = "Serebryakov";
        int age = 55;
        String line = "________________________________";

        String subject1 = "school.Person.Teacher russian language and literature";
        String firstName1 = "Mariya";
        String middleName1 = "Ivanovna";
        String lastName1 = "Smirnova";
        int age1 = 55;

        System.out.println(line);
        System.out.print(subject + " " + firstName + " " + middleName + " " + lastName + ",");
        System.out.println(age);
        System.out.println(line);

        System.out.println(line);
        System.out.print(subject1 + " " + firstName1 + " " + middleName1 + " " + lastName1 + ",");
        System.out.println(age1);
        System.out.println(line);
    }
}
