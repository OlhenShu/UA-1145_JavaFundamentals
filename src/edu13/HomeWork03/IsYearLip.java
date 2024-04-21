package edu13.HomeWork03;

import java.util.Scanner;

import static java.lang.System.in;

public class IsYearLip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        System.out.println("Enter the year: ");
        int year = scan.nextInt();

        IsYearLip isYearLip = new IsYearLip();
        isYearLip.isLeapYear(year);
        scan.close();
    }

    public void isLeapYear(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("Year " + year + " is a leap year");
        } else {
            System.out.println("Year " + year + " is not a leap year");
            System.out.println();
        }

    }
}