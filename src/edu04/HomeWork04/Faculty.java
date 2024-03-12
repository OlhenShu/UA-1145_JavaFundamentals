package edu04.HomeWork04;

import java.util.Scanner;

import static java.lang.System.in;

public class Faculty {

    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scan.nextInt();

        System.out.print("Enter the season: ");
        String seasonSelect = scan.next().toLowerCase();

        System.out.println("There are " + numberOfStudents + " students, and it is " + Season.valueOf(seasonSelect.toUpperCase()).getReadableName());
        scan.close();
    }
}