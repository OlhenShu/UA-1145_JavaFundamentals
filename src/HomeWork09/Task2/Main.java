package HomeWork09.Task2;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;

import static HomeWork09.Task2.Student.printStudents;
import static java.lang.System.in;

public class Main {
    public static void removeLowPerformingStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            double avgGrade = student.calcAverageGrade();
            if (avgGrade < 3.0) {
                iterator.remove();
            } else {
                student.promoteToNextCourse();
            }
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Eva", 1, 1, List.of(2.3, 2.8, 3.0)));
        students.add(new Student("Frank", 1, 2, List.of(2.8, 3.1, 2.7)));
        students.add(new Student("Grace", 2, 1, List.of(3.6, 4.0, 3.7)));
        students.add(new Student("Hannah", 2, 2, List.of(4.4, 3.8, 4.2)));

        Scanner scanner = new Scanner(in);
        System.out.println("Enter the number of course: ");
        int course = scanner.nextInt();

        System.out.println("Before removing underperformed students:");
        printStudents(students, course);
        System.out.println();

        removeLowPerformingStudents(students);

        System.out.println("After removing Low Performing Students and promoting students: ");
        printStudents(students, course);


    }
}
