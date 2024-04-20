package edu10.Task3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class Student {
    private final String name;
    private final int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public static void printStudents(List<Student> students, int numOfCourse) {
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student student = it.next();
            if (student.course == numOfCourse) {
                System.out.println("Student " + student.getName() + " is enrolled to " + numOfCourse + " course.");
            }


        }
    }

    public static void listOutput(List<Student> students) {
        for (Student student : students) {
            System.out.println("Name: " + student.name + " Course: " + student.course);
        }
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    static class CourseCompare implements Comparator<Student> {


        @Override
        public int compare(Student o1, Student o2) {
            return o1.getCourse() - o2.getCourse();
        }

    }

    static class NameCompare implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

}
