package homework.hw3.student;

import homework.hw3.person.Person;

import java.util.*;

public class StudentMain {
    public static final int COUNT_OF_STUDENTS = 3;

    public static void main(String[] args) {
        List<Student> studentsList = new ArrayList<>(COUNT_OF_STUDENTS);
        Scanner scanner = new Scanner(System.in);
        var s1 = Student.input(studentsList, scanner.nextLine(), scanner.nextLine());
        var s2 = Student.input(studentsList, scanner.nextLine(), scanner.nextLine());
        var s3 = Student.input(studentsList, scanner.nextLine(), scanner.nextLine());

        System.out.println(studentsList);

        System.out.println(Student.avgRating(studentsList, COUNT_OF_STUDENTS));
        System.out.println(Student.totalRating(studentsList));
        System.out.println(s1.betterStudent(s2));
        System.out.println(s2.betterStudent(s3));
    }
}
