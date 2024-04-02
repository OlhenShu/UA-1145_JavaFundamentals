package homeWork9;

import java.util.*;

public class Student {

    private final Map<String, Integer> grades;
    List<Student> student = new LinkedList<>();
    private String name;
    private String group;
    private int course;

    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new HashMap<>();
    }

    public static void removePromoteStudent(List<Student> list) {
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            double totalGrades = 0;
            for (Integer grade : student.getGrades().values()) {
                totalGrades += grade;
            }
            double avgGrade = totalGrades / student.getGrades().size();
            if (avgGrade >= 3) {
                student.course++;
                System.out.println("Student " + student.getName()
                        + " is promoted to the next course level.");
            } else {
                iterator.remove();
                System.out.println("Student " + student.getName()
                        + " was removed from the course.");
            }
        }

    }

    public static void printStudents(List<Student> list, int course) {
        for (Student student : list) {
            if (student.getCourse() == course) {
                System.out.println("Student " + student.getName()
                        + " enrolled in the course " + course);
            }
        }
    }

    public static void printAllStudents(List<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grades=" + grades +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                '}';
    }

    public void addGrade(String subject, int grade) {
        grades.put(subject, grade);
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }
}

class RunStudent {
    public static void main(String[] args) {
        List<Student> students = new LinkedList<>();

        Student student1 = new Student("Alice", "A1", 1);
        student1.addGrade("Math", 3);
        student1.addGrade("Science", 2);

        Student student2 = new Student("Bob", "A2", 1);
        student2.addGrade("Math", 4);
        student2.addGrade("Science", 5);

        Student student3 = new Student("Sam", "A1", 1);
        student3.addGrade("Math", 5);
        student3.addGrade("Science", 5);

        students.add(student1);
        students.add(student2);
        students.add(student3);


        Student.removePromoteStudent(students);
        Student.printStudents(students, 2);
        Student.printAllStudents(students);


    }
}
