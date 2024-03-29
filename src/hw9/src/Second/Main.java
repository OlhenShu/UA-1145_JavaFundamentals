package Second;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student("Jack", 107, 1, Student.fillGrades("Jack"));
        students.add(student1);
        Student student2 = new Student("Bob", 206, 2, Student.fillGrades("Bob"));
        students.add(student2);
        Student student3 = new Student("Ann", 205, 2, Student.fillGrades("Ann"));
        students.add(student3);

        System.out.println(" " + "\nBefore using studentsGradesAverage() method");
        Student.printStudents(students,1);
        Student.printStudents(students,2);
        Student.printStudents(students, 3);
        System.out.println(Student.studentsGradesAverage(students));
        System.out.println(" " + "\nAfter using studentsGradesAverage() method");
        Student.printStudents(students,1);
        Student.printStudents(students,2);
        Student.printStudents(students, 3);
    }
}
