package edu10.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mariia", 4));
        students.add(new Student("Anya", 5));
        students.add(new Student("Roman", 3));
        students.add(new Student("Maryna", 2));
        students.add(new Student("Marselo", 4));

        Student.printStudents(students, 4);
        Collections.sort(students, new Student.CourseCompare());
        Student.listOutput(students);

        Collections.sort(students, new Student.NameCompare());
        Student.listOutput(students);
    }

}
