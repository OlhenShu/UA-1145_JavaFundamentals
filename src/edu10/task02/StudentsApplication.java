package edu10.task02;

import java.util.ArrayList;
import java.util.List;

import static edu10.task02.Student.StudentCurseComparator;
import static edu10.task02.Student.StudentNameComparator;

public class StudentsApplication {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Petro", 3));
        students.add(new Student("Yana", 3));
        students.add(new Student("Ivan", 2));
        students.add(new Student("Bob", 4));
        students.add(new Student("Nastia", 4));

        students.sort(StudentNameComparator);
        System.out.println(students);

        students.sort(StudentCurseComparator);
        System.out.println(students);

        Student.printStudents(students,2);
    }
}
