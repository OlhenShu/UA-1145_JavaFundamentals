package edu05.task1;

import java.util.Scanner;

import static java.lang.System.in;

public class homework1_1 {
    private static final Scanner SCANNER = new Scanner(in);
    public static int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {

//        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;

//        int[] monthDays = new int[12];
//        monthDays[0] = 31;
//        monthDays[1] = 28;
//        monthDays[2] = 31;
//        monthDays[3] = 30;
//        monthDays[4] = 31;
//        monthDays[5] = 30;
//        monthDays[6] = 31;
//        monthDays[7] = 31;
//        monthDays[8] = 30;
//        monthDays[9] = 31;
//        monthDays[10] = 30;
//        monthDays[11] = 31;

        System.out.println("Input the number of the month (1-12): ");
        int monthNumber = SCANNER.nextInt();

        if (monthNumber >= 1 && monthNumber <= 12) {
            System.out.println("Number of days in month is: " + monthDays[monthNumber - 1]);
        } else {
            System.out.println("Invalid month number.");
        }
    }
}