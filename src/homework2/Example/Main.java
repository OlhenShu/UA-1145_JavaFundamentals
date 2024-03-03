package Example;

import java.util.Scanner;

import static Example.Student.printStudentStats;

public class Main {
    static public final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        printStudentStats();

        Student student1 = new Student();
        Student.promParameters(student1);
        printStudentStats();

        Student student2 = new Student();
        Student.promParameters(student2);
        printStudentStats();

        Student student3 = new Student();
        Student.promParameters(student3);
        printStudentStats();

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

    }

}