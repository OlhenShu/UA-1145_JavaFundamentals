package edu03;

import java.util.Scanner;

import static java.lang.System.in;

// Write  Java console application with method to calculate the area of a triangle.
public class HomeWork01 {
    static double side1;
    static double side2;
    static double side3;
    static double semiPerimeter; //Semi Perimeter = (a+b+c)/2

    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        System.out.print("Введіть довжину першої сторони трикутника: ");
        side1 = scan.nextDouble();
        System.out.print("Введіть довжину другої сторони трикутника: ");
        side2 = scan.nextDouble();
        System.out.print("Введіть довжину третьої сторони трикутника: ");
        side3 = scan.nextDouble();
        semiPerimeter = semiPerimeter(side1, side2, side3);
        System.out.println("Напівпериметр = " + semiPerimeter(side1, side2, side3));
        System.out.printf("Площа трикутника = %.2f одиниць²%n", area(side1, side2, side3, semiPerimeter));
    }

    static double semiPerimeter(double x, double y, double z) {
        return (x + y + z) / 2;
    }

    static double area(double x, double y, double z, double s) {
        return Math.sqrt(s * (s - x) * (s - y) * (s - z));
    }
}
