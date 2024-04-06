package homeworks.homework_edu10.Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student> {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alise", 2));
        students.add(new Student("Bob", 3));
        students.add(new Student("Adam", 1));
        students.add(new Student("Jack", 2));
        students.add(new Student("Kate", 4));

        System.out.println("Students sorted be name: ");
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student.getName() + ", Course = " + student.getCourse());
        }
        System.out.println(" ");

        System.out.println("Students sorted be course: ");
        Collections.sort(students, Comparator.comparingInt(Student::getCourse));
        for (Student student : students) {
            System.out.println(student.getName() + ", Course = " + student.getCourse());
        }


    }

    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void printStudent(List<Student> students, int courseNumb) {
        System.out.println("Students enrolled in course " + courseNumb + ":");
        for (Student student : students) {
            if (student.getCourse() == courseNumb) {
                System.out.println(student.getName());
            }
        }
    }


    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

}
