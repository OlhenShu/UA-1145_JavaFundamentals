package edu05.task01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class DaysInMonth {

    private static final Scanner SCANNER = new Scanner(in);

    public static void main(String[] args) {
        DaysInMonth checkYourMonth = new DaysInMonth();
        System.out.println("Input number of your month");
        int inputMonth = SCANNER.nextInt();
        System.out.println("Input the year:");
        int inputYear = SCANNER.nextInt();
        SCANNER.nextLine();

        if (inputMonth >= 1 && inputMonth <= 12) {
            int days = checkYourMonth.checkYourMonth(inputMonth, inputYear);
            System.out.println("Your month has " + days + " days.");
        } else {
            System.out.println("Invalid month number. Please try again with a number between 1 and 12.");
        }
    }

    public int checkYourMonth(int month, int year) {
        // Map<Integer, Double> months = new HashMap<>();//its bad idea Double for days
        Map<Integer, Integer> months = new HashMap<>();
        months.put(1, 31);
        months.put(2, isLeapYear(year) ? 29 : 28);//february can be 28(common year) or 29 days
        months.put(3, 31);
        months.put(4, 30);
        months.put(5, 31);
        months.put(6, 30);
        months.put(7, 31);
        months.put(8, 31);
        months.put(9, 30);
        months.put(10, 31);
        months.put(11, 30);
        months.put(12, 31);


        return months.get(month);
    }

    /*Added a method isLeapYear to determine if the given year is a leap year and adjust February's days accordingly.*/
    private boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
}

