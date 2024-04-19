import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 1));
        students.add(new Student("Bob", 2));
        students.add(new Student("Charlie", 1));
        students.add(new Student("David", 3));
        students.add(new Student("Emily", 2));

        System.out.println("Original list:");
        for (Student student : students) {
            System.out.println(student.getName() + " - Course " + student.getCourse());
        }

        Collections.sort(students, Comparator.comparing(Student::getName));
        System.out.println("\nSorted by name:");
        for (Student student : students) {
            System.out.println(student.getName() + " - Course " + student.getCourse());
        }

        Collections.sort(students, Comparator.comparingInt(Student::getCourse));
        System.out.println("\nSorted by course:");
        for (Student student : students) {
            System.out.println(student.getName() + " - Course " + student.getCourse());
        }

        // Print students in course 1
        Student.printStudents(students, 1);
    }
}