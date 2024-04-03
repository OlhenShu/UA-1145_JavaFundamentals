package edu09.collections_part2;

import java.util.List;

class Student {
    private final List<Double> gradesAll;
    private String name;
    private int group;
    private int course;

    public Student(String name, int group, int course, List<Double> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.gradesAll = grades;
    }

    public double calculateGPA() {
        double sumAll = 0;
        for (Double grade : gradesAll) {
            sumAll += grade;
        }
        return sumAll / gradesAll.size();
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

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}