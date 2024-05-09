package edu13.task3;

import java.util.Scanner;

public class Main {
    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input а year: ");
        int year = in.nextInt();
        System.out.println("It is a leap year: " + isLeap(year));
        //You can use Year.isLeap()
        //System.out.println(Year.isLeap(2024));
        in.close();
    }
}