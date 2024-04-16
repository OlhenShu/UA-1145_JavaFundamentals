package edu10.HomeWork03;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    // Print students @ specific course
    public static void printStudents(List<Student> students, int targetCourse) {
        Iterator<Student> iterator = students.iterator();
        System.out.println("Students enrolled in course " + targetCourse + ":");
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == targetCourse) {
                System.out.println(student.getName());
            }
        }
    }

    // Compare by name
    public static Comparator<Student> compareByName() {
        return Comparator.comparing(Student::getName);
    }

    // Compare by course
    public static Comparator<Student> compareByCourse() {
        return Comparator.comparingInt(Student::getCourse);
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }
}

