package homeworks.homework_edu09.Homework;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int group;
    private int course;
    private List<Integer> grades;

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Bob", 100, 2, List.of(3, 4, 5)));
        students.add(new Student("Jon", 151, 3, List.of(3, 3, 3)));
        students.add(new Student("Anna", 251, 2, List.of(5, 4, 4)));
        students.add(new Student("Den", 171, 2, List.of(2, 3, 3)));

        System.out.println("List of all students:");
        for (Student student : students) {
            student.info();
            System.out.println();
        }

        System.out.println("Students enrolled in course 2:");
        for (Student student : students) {
            if (student.getCourse() == 2) {
                System.out.println(student.getName());
            }
        }
        for (Student student : students) {
            student.promotedToTheNextCourse();
        }

        System.out.println("List of students after promotion:");
        for (Student student : students) {
            student.info();
            System.out.println();
        }


    }

    public Student(String name, int group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public double averageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public void promotedToTheNextCourse() {
        double averageGrate = averageGrade();
        if (averageGrate >= 3.0) {
            course++;
            System.out.println(name + " has been promoted to the next " + course + " course.");
        }
    }

    public boolean removeIfAverageBelowThreshold(List<Student> students) {
        if (averageGrade() < 3) {
            System.out.println(name + " has been removed.");
            students.remove(this);
            return true;
        }
        return false;
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Students enrolled in course " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public void info() {
        System.out.println("Name: " + name);
        System.out.println("Group: " + group);
        System.out.println("Course: " + course);
        System.out.println("Grades: " + grades);
        double average = averageGrade();
        System.out.println("Average Grade: " + average);
        if (average >= 3) {
            System.out.println("Promoted to course " + (course + 1));
        }
    }


}

