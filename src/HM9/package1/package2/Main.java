package HM9.package1.package2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void PrintStudent(List<Student> students, int course) {
        System.out.println("Student in course: " + course);
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void StudentsCanGraduate(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.calculateAverage() < 3f) {
                iterator.remove();
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        students.add(new Student("Oleg", 4, 22, List.of(4, 3, 2)));
        students.add(new Student("Alex", 3, 21, List.of(4, 5, 4)));
        students.add(new Student("Bel", 2, 21, List.of(3, 5, 7, 8)));
        System.out.println("Input curs: ");
        int course = sr.nextInt();
        System.out.println("Information before deduction: ");
        PrintStudent(students, course);
        StudentsCanGraduate(students);
        System.out.println("Students , who can graduate:");
        PrintStudent(students, course);
    }

}
