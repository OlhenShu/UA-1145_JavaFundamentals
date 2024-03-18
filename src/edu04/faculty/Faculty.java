package edu04.faculty;

import java.util.Scanner;

import static edu04.faculty.Season.getSeason;
import static java.lang.System.in;

public class Faculty {
    static Scanner scanner = new Scanner(in);

    public static void main(String[] args) {
        System.out.println("Input number of the students");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input current Month");
        String yourMonth = scanner.nextLine().toUpperCase();

        System.out.println("Number of students is " + numberOfStudents + " and now is " + getSeason(yourMonth));
    }
}
