package HomeWork04.Task4;

import java.util.Scanner;

import static java.lang.System.in;

public class Faculty {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        System.out.println("Choose current season: ");
        String currentSeason = scanner.next().toUpperCase();
        System.out.println("There are " + numberOfStudents + " " + "student's in "
                + Season.valueOf(currentSeason));

    }
}
