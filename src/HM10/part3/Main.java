package HM10.part3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Oleg", 4));
        students.add(new Student("Andrey", 3));
        students.add(new Student("Sergiy", 5));

        students.sort(Comparator.comparing(Student::getName));
        System.out.println("Sort by name: ");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + "\n" + "Course: " + student.getCourse());
        }

        students.sort(Comparator.comparingInt(Student::getCourse));
        System.out.println("Sort by course: ");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + "\n" + "Course: " + student.getCourse());
        }
    }
}
