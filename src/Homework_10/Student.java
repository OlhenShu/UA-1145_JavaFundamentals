package Homework_10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
    private final String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name = '" + name + '\'' +
                ", course = " + course +
                '}';
    }
}

class StudentDemo {
    public static void main(String[] args) {
        List<Homework_10.Student> students = new ArrayList<Homework_10.Student>();

        students.add(new Homework_10.Student("Alice", 2));
        students.add(new Homework_10.Student("Bob", 1));
        students.add(new Homework_10.Student("Charlie", 3));
        students.add(new Homework_10.Student("Ann", 3));
        students.add(new Homework_10.Student("Jack", 1));

        System.out.println("Student original list: ");
        for (var student : students) {
            System.out.println(student);
        }
        System.out.println();

        // To check method - change course number:
        printStudents(students, 3);

        // Check of sorting methods:
        students.sort(new StudentsCourseComparator());
        System.out.println("\nStudents sorted by course: ");
        for (Student student : students) {
            System.out.println(student);
        }

        students.sort(new StudentsNameComparator());
        System.out.println("\nStudents sorted by name: ");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Implementation of method printing students:
    public static void printStudents(List<Homework_10.Student> studentsList, int course) {
        System.out.println("Student names enrolled the course " + course + ":");
        Iterator<Homework_10.Student> iterator = studentsList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}

// Implementation of comparators:
class StudentsNameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Student) o1).getName().compareTo(((Student) o2).getName());
    }
}

class StudentsCourseComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Student) o1).getCourse() - (((Student) o2).getCourse());
    }
}
