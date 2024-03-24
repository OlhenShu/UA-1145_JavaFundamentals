package edu03;
// Write Java console application with method
// to find the smallest number among three integer numbers.

import java.util.Scanner;

import static java.lang.System.in;

public class HomeWork02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scan.nextInt();
        System.out.println("Smallest number is: " + smallest(num1, num2, num3));
    }

    static int smallest(int a, int b, int c) {//findSmallest better naming
        return Math.min(Math.min(a, b), c);
    }
}
