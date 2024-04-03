package Third;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Paul", 2));
        students.add(new Student("Jack", 4));
        students.add(new Student("Zack", 3));
        students.add(new Student("Paul", 1));
        students.add(new Student("Matthew", 3));
        Student.printStudents(students, 3);
        System.out.println(Student.sortByName(students));
        System.out.println(Student.sortByCourse(students));
    }
}
