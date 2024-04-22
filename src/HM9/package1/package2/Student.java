package HM9.package1.package2;

import java.util.List;

public class Student {
    private final List<Integer> gradeStudent;
    private String name;
    private int group;
    private int course;

    public Student(String name, int course, int group, List<Integer> gradeStudent) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.gradeStudent = gradeStudent;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public double calculateAverage() {
        double finalMarks = 0;
        for (Integer grade : gradeStudent) {
            finalMarks += grade;
        }
        return finalMarks / gradeStudent.size();
    }
}
