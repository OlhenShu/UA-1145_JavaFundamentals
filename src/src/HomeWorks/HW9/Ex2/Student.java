package HomeWorks.HW9.Ex2;

import java.util.ArrayList;

public class Student {

    private String name;
    private String group;
    private int course;
    private int averagePoint;

    public static ArrayList<Student> studentList = new ArrayList<>();//I leave a comment regarding such behavior in the 10th homework;
    // here it is similar.

    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
        studentList.add(this);
    }

    public static void findOnCourse(int course) {
        ArrayList<String> namesOnCourse = new ArrayList<>();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).course == course) {
                namesOnCourse.add(studentList.get(i).name);
            }
        }
        System.out.println("Students on course " + course + ": " + namesOnCourse);
    }

    public static void goExam() {
        System.out.println("Let exams start!");
        for (int i = 0; i < studentList.size(); i++) {
            Student temp = studentList.get(i);
            if (temp.averagePoint < 3) {
                System.out.println("Student " + temp.name + " expelled!");
                studentList.remove(i);
                i--;
            } else {
                temp.course++;
            }
        }
    }

    public void findAveragePoint(int a, int b, int c) {
        int sum = a + b + c;
        int averagePoint = (int) Math.round(sum / 3.0);
        this.averagePoint = averagePoint;
        System.out.println("Average point of student " + this.name + " is " + averagePoint);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", averagePoint=" + averagePoint +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getAveragePoint() {
        return averagePoint;
    }

    public void setAveragePoint(int averagePoint) {
        this.averagePoint = averagePoint;
    }
}