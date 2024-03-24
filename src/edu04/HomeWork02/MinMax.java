package edu04.HomeWork02;

import java.util.Scanner;

import static java.lang.System.in;

public class MinMax {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int min;
        int max;

        Scanner scan = new Scanner(in);
        System.out.println("Please enter first number: ");
        num1 = scan.nextInt();
        System.out.println("Please enter second number: ");
        num2 = scan.nextInt();
        System.out.println("Please enter third number: ");
        num3 = scan.nextInt();

        min = Math.min(Math.min(num1, num2), num3);
        System.out.println("Minimal value = " + min);

        max = Math.max(Math.max(num1, num2), num3);
        System.out.println("Maximal value = " + max);
        scan.close(); // It's a good practice to close the Scanner object
    }
}
