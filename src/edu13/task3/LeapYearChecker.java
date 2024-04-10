package edu13.task3;

public class LeapYearChecker {

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else {
            return year % 400 == 0;
        }
    }

    public static void main(String[] args) {
        int year1 = 2020;
        int year2 = 2021;

        System.out.println(year1 + " is a leap year? " + isLeapYear(year1));
        System.out.println(year2 + " is a leap year? " + isLeapYear(year2));
    }
}
