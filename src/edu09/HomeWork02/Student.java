package edu09.HomeWork02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Double> grades;

    public Student(String name, String group, int course, List<Double> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.print("Students enrolled in course " + course + ":");
        boolean found = false;
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("There are no students in this course.");
        }
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();


        studentList.add(new Student("Linus", "Group A", 1, List.of(3.5, 4.0, 3.7)));
        studentList.add(new Student("Bill", "Group B", 2, List.of(2.5, 3.0, 3.2)));
        studentList.add(new Student("Steve", "Group A", 3, List.of(3.8, 3.9, 4.0)));
        //Debug
        // System.out.println("Students list: " + studentList);


        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.calcAverageGrade() < 3) {
                iterator.remove();
            } else {
                student.promoteIfQualified();
            }
        }

        // Print students on a specific course
        //Debug
        //System.out.println(studentList);

        printStudents(studentList, 1);
        printStudents(studentList, 2);
        printStudents(studentList, 3);
        printStudents(studentList, 4);

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

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public List<Double> getGrades() {
        return grades;
    }

    //Calculate average grade points
    public double calcAverageGrade() {
        double sum = 0;
        for (Double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    //Promotion to the next course
    public void promoteIfQualified() {
        if (calcAverageGrade() >= 3) {
            course++;
        }
    }
}
