package edu10.task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Vitalii", 4),
                new Student("Anna", 2),
                new Student("Anton", 3),
                new Student("Alisa", 4),
                new Student("Rulon", 3));

        // Collections.sort(students, Comparator.comparing(Student::getName));
        //can be this
        students.sort(Comparator.comparing(Student::getName));

        System.out.println("Sorted by name:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + " Course: " + student.getCourse());
        }

        // Sort the list of students by course
        students.sort(Comparator.comparingInt(Student::getCourse));

        System.out.println("\nSorted by course:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + " Course: " + student.getCourse());
        }
    }
}