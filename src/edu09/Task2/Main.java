package edu09.Task2;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Roman Kushnir", "FL-14", 1, List.of(5, 2, 1, 4)));
        students.add(new Student("Mykola Barabash", "FL-34", 3, List.of(5, 5, 3, 4)));
        students.add(new Student("Maria Bubenets", "P3-34", 3, List.of(3, 1, 2, 4)));
        students.add(new Student("Kateryna Ivanets", "P3-34", 4, List.of(5, 5, 5, 4)));

        Student.studentsRemover(students);
        Student.printStudents(students, 4);
        Student.printStudents(students, 5);
    }
}
