package edu05.Hometask;

import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        Calendar.calendar();
    }
    public static void calendar() {
        Scanner SCANNER = new Scanner(System.in);
        int [] calendar = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("Please enter the number of the month:");
        int month = SCANNER.nextInt() - 1;

        int daySum = 0;
        for (int i = 1; i <= calendar[month]; i++) {
            daySum += i;
        }
        System.out.println("The total amount of the days in this month is: " + daySum);
    };
}

