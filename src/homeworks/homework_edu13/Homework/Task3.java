package homeworks.homework_edu13.Homework;

import java.util.Scanner;

public class Task3 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the year to check if it is a leap year: ");
        int userYear = SCANNER.nextInt();

        if (leapYear(userYear)) {
            System.out.println(userYear + " is a leap year.");
        } else {
            System.out.println(userYear + " is not a leap year.");
        }
    }

    public static boolean leapYear(int year) {
        boolean divideВy4 = year % 4 == 0;
        boolean divideВy100 = year % 100 == 0;
        boolean divideВy400 = year % 400 == 0;

        return divideВy4 && (!divideВy100 || divideВy400);

    }
}
