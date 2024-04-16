package edu10.HomeWork03;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {

        // In the main() method, create a List named "students" and add five different Student
        //objects to it.
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 1));
        students.add(new Student("Bob", 2));
        students.add(new Student("Charlie", 1));
        students.add(new Student("David", 3));
        students.add(new Student("Eve", 2));

        // Display the list of students sorted by name
        System.out.println("Students sorted by name:");
        students.sort(Student.compareByName());
        for (Student student : students) {
            System.out.println(student.getName() + " - Course: " + student.getCourse());
        }

        // Display the list of students sorted by course
        System.out.println("\nStudents sorted by course:");
        students.sort(Student.compareByCourse());
        for (Student student : students) {
            System.out.println(student.getName() + " - Course: " + student.getCourse());
        }

        // Print students @ course 1
        Student.printStudents(students, 1);
    }
}
