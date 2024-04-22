package edu10.task02;


import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Student {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public static void printStudents(List<Student> students, Integer studentCourse) {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.course == studentCourse) {
                System.out.println(student.name);
            }
        }
    }

    public static Comparator<Student> StudentNameComparator = Comparator.comparing(Student::getName);
    public static Comparator<Student> StudentCurseComparator = Comparator.comparing(Student::getCourse);
}

   