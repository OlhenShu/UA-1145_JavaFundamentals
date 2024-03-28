package Example;

import java.util.Scanner;
import static Example.Student.printStatistics;

public class Main {
    static public final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        printStatistics();

        Student student1 = new Student();
        Student.promptParameters(student1);
        printStatistics();

        Student student2 = new Student();
        Student.promptParameters(student2);
        printStatistics();

        Student student3 = new Student();
        Student.promptParameters(student3);
        printStatistics();


    }



}
