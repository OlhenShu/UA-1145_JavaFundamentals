package HomeWork09.Task2;

import java.util.List;

public class Student {
    private String name;
    private int numberOfGroup;
    private int course;
    private final List<Double> grades;

    public Student(String name, int numberOfGroup, int course, List<Double> grades) {
        this.name = name;
        this.numberOfGroup = numberOfGroup;
        this.course = course;
        this.grades = grades;
    }

    public double calcAverageGrade() {
        double sum = 0;
        for (Double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Students in course " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public void promoteToNextCourse() {
        if (calcAverageGrade() >= 3.0) {
            this.course++;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
