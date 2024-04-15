package edu09.Task2;

import java.util.List;


public class Student {
    private final String name;
    private final String group;
    private final int course;
    private final List<Integer> grades;

    public Student(String name, String group, int course, List grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public static void studentsRemover(List<Student> students) {

        students.removeIf(student -> student.getAverageGrade() < 3);

    }

    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (course == (student.course + 1)) {
                System.out.println("This student is enrolled to " + course + " course : " + student.name);
            }

        }

    }

    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        } else {
            int count = 0;
            for (int i : grades) {
                count += i;
            }
            int averageGrade = count / grades.size();
            return averageGrade;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                '}';
    }
}



