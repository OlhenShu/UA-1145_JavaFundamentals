package edu09.task2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String name;
    private int course;
    private final List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.course = course;
        this.grades = grades;
    }

    public double calculateGPA() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public void promoteStudent() {
        double gpa = calculateGPA();
        if (gpa >= 3.0) {
            course++;
            System.out.println(name + " promoted to course " + course);
        }
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Students in course " + course + ":");
        boolean found = false;
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No students in this course.");
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", "Group A", 1, List.of(75, 90, 78)));
        students.add(new Student("Alice", "Group B", 2, List.of(85, 80, 98)));
        students.add(new Student("Bob", "Group C", 1, List.of(80, 75, 58)));

        for (Student student : students) {
            student.promoteStudent();
        }

        for (Student student : students) {
            student.setCourse(student.getCourse());
        }

        for (int i = 1; i <= 2; i++) {
            printStudents(students, i);
        }
    }
}
