package homeworks.homework2.Example;

import java.util.Scanner;

public class Main {
    static public final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Student.printStudentStats();

        Student student1 = new Student();
        Student.promParameters(student1);
        Student.printStudentStats();

        Student student2 = new Student();
        Student.promParameters(student2);
        Student.printStudentStats();

        Student student3 = new Student();
        Student.promParameters(student3);
        Student.printStudentStats();

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

    }

}