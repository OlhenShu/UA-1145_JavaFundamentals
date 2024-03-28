package Homework_5.Task1;

import java.util.Scanner;

public class MonthNumber {
    public static void main(String[] args) {
        int[] months = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month number from 1 to 12: ");
        int number = scanner.nextInt();

        int daysInMonth = getMonth(months, number);

        System.out.println("There are " + daysInMonth + " days in month '" + number + "'.");
    }

    public static int getMonth(int[] months, int number) {
        return months[number - 1];
    }
}
