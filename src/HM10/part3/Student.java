package HM10.part3;

import java.util.Iterator;
import java.util.List;

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

    public void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println("Name:" + student.getName());
            }
        }

    }

    public boolean equalsByCourse(Student first, Student second) {
        return first.getCourse() == second.getCourse();
    }

    public boolean equalsByName(Student first, Student second) {
        return first.getName().equals(second.getName());
    }
}

