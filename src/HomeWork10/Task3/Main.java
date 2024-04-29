package HomeWork10.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", 1));
        students.add(new Student("Bob", 2));
        students.add(new Student("Tom", 1));
        students.add(new Student("Vitaliy", 3));
        students.add(new Student("Oleg", 2));

        System.out.println("Students sorted by name:");
        Collections.sort(students, Student.compareByName());
        for (Student student : students) {
            System.out.println(student.getName() + " - Course " + student.getCourse());
        }

        System.out.println("\nStudents sorted by course:");
        Collections.sort(students, Student.compareByCourse());
        for (Student student : students) {
            System.out.println(student.getName() + " - Course " + student.getCourse());
        }
    }

}
