package edu09.task02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StudentApplication {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Petro", "TK43", 2, 4, 5, 3));
        studentList.add(new Student("Watary", "IT23", 3, 3, 3, 3));
        studentList.add(new Student("Helga", "TK53", 4, 4, 4, 4));
        studentList.add(new Student("Yana", "ПК22", 2, 4, 4, 3));
        studentList.add(new Student("Ivan", "IT23", 3, 2, 4, 3));
        studentList.add(new Student("Bogdan", "TK43", 2, 2, 3, 3));
        studentList.add(new Student("Vlad", "ПК12", 4, 3, 3, 2));
        Student studentN = new Student("Vasyl", "ПК12", 4, 3, 5, 4);
        studentList.add(studentN);
        //Original list:
        //System.out.println(studentList);


        List<Student> accessedStudents = findAccessedStudents(studentList);
        System.out.println("Students who are promoted: ");
        for (var student : accessedStudents) {
            System.out.println(student + ", average grade is: " + student.getAverageGrade());
        }
        System.out.println();
        System.out.println("All students enrolled in the second course are: ");

        printStudents(accessedStudents, 2);
    }

    static List<Student> findAccessedStudents(List<Student> students) {
        return students.stream()
                .filter(student -> student.getAverageGrade() >= 3).toList();
    }

    static void printStudents(List<Student> students, int course) {//student has course, that's why u don't need second parameter

        Collection<Student> collection = students.stream().filter(s -> s.getCourse() == course).toList();
        for (var c : collection) {
            System.out.println(c.getName());
        }
    }
}

