package Second;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Student {
    private String name;
    private int group;
    private int course;
    private ArrayList<Integer> grades;

    public Student(String name, int group, int course, ArrayList<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public static ArrayList<Integer> fillGrades(String name) {
        ArrayList<Integer> filledGrades = new ArrayList<>();
        Scanner scanner = new Scanner(in);
        System.out.println("Enter 5 grades for the student " + name + ":");
        for(int i = 0; i < 5; i++) {
            int grade = scanner.nextInt();
            if(grade <= 0 || grade >= 6) {
                throw new IllegalArgumentException("Grade must be higher than 0 and lower than 6");
            }
            filledGrades.add(grade);
        }
        return filledGrades;
    }

    public static ArrayList<Student> studentsGradesAverage(ArrayList<Student> students) {
        System.out.println(" " + "\nStudents list is successfully updated");
        System.out.println("Before updating: ");
        System.out.println(students.toString());
        System.out.println("\nAfter updating: ");
        for (int i = 0; i < students.size(); i++) {
            int sum = 0;
            for (int grade : students.get(i).getGrades()) {
                sum += grade;
            }
            double average = sum / 5.0;

            if (average < 3) {
                students.remove(i);
                i--; // changing the index, because we lost the student and issued it
            } else if (average > 3) {
                students.get(i).setCourse(students.get(i).getCourse() + 1);
            }
        }
        return students;
    }

    public static void printStudents(ArrayList<Student> students, int course) {
        System.out.println("List of students name, which study on course " + course + ": ");
        boolean key = false;
        for(int i = 0; i < students.size(); i++) {
            if(course == students.get(i).getCourse()){
                System.out.println(students.get(i).getName());
                key = true;
            }
        }
        if(!key) {
            System.out.println("There are no students on this course");
        }
    }

    @Override
    public String toString() {
        return "\nInformation about student:" +
                "\nName: " + getName() +
                "\nGroup: " + getGroup() +
                "\nCourse: " + getCourse() +
                "\nGrades: " + getGrades() + "\n";
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

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }
}
