package edu09.collections_part2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void printStudents(List<Student> students, int course) {
        System.out.println("Students in course " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void removeUnderperformingStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.calculateGPA() < 3.0) {
                iterator.remove();
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public static void main(String[] args) {
        // Creating a collection of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 1, 1, List.of(3.5, 4.0, 3.8)));
        students.add(new Student("Bob", 1, 2, List.of(2.5, 3.0, 2.8)));
        students.add(new Student("Charlie", 2, 1, List.of(3.7, 3.9, 3.8)));
        students.add(new Student("David", 2, 2, List.of(2.9, 3.2, 3.1)));

        Scanner in = new Scanner(System.in);
        System.out.print("Input course: ");
        int course = in.nextInt();
        System.out.println("Before removing underperforming students:");
        printStudents(students, course);

        removeUnderperformingStudents(students);

        System.out.println("\nAfter removing underperforming students and promoting:");
        printStudents(students, course);

        in.close();
    }
}