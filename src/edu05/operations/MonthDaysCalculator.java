package edu05.operations;

import java.util.Scanner;

public class MonthDaysCalculator {
    public static void main(String[] args) {
        int monthNumber;
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Input month number: ");
            monthNumber = in.nextInt();

            if (monthNumber < 1 || monthNumber > 12) {
                System.out.println("Invalid month number. Month number should be between 1 and 12.");
            } else {
                System.out.print("Number of days in month " + monthNumber + " is " + monthDays[monthNumber - 1]);
                break; // Exit the loop if input is valid
            }
        } while (true);

        in.close();
    }
}