package Homework_9;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private final int SUBJECT_NUMBER = 4;
    private final String name;
    private final String group;
    private int course;
    private int[] grades = new int[SUBJECT_NUMBER];

    public Student(String name, String group, int course, int[] grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public int[] getGrades() {
        return grades;
    }

    public double averageScore() {
        int average = 0;
        for (int grade : this.grades) {
            average += grade;
        }
        double score = average / (double) SUBJECT_NUMBER;
        return score;
    }

    public void isPromoted() {
        this.course++;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name = '" + name + '\'' +
                ", group = '" + group + '\'' +
                ", course = " + course +
                ", grades = " + Arrays.toString(grades) +
                '}';
    }
}

class StudentDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student("Alice", "MT-1", 2, new int[]{2, 2, 3, 2}));
        students.add(new Student("Bob", "RT-1", 1, new int[]{3, 4, 4, 3}));
        students.add(new Student("Charlie", "HR-2", 3, new int[]{5, 4, 5, 4}));
        students.add(new Student("Ann", "MT-1", 3, new int[]{4, 4, 5, 3}));
        students.add(new Student("Jack", "MT-2", 1, new int[]{3, 4, 4, 3}));
        students.add(new Student("Nick", "HR-2", 2, new int[]{2, 2, 3, 2}));
        students.add(new Student("James", "HR-1", 1, new int[]{5, 5, 5, 5}));

        System.out.println("Student list before change: ");
        for (var student : students) {
            System.out.println(student);
        }

        System.out.println("\nStudent list after change: ");
        checkGrades(students);
        for (var student : students) {
            System.out.println(student);
        }
        System.out.println();

        // To check method change course number:
        print(students, 4);

    }

    // Step 1: Method that removes/promotes students
    public static void checkGrades(ArrayList<Student> studentsList) {
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).averageScore() >= 3.0) {
                studentsList.get(i).isPromoted();
            } else {
                studentsList.remove(i);
            }
        }
    }

    // Step 2: Method that prints students
    public static void print(ArrayList<Student> studentsList, int course) {
        System.out.println("Student names enrolled the course " + course + ": ");
        for (Student student : studentsList) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

}
