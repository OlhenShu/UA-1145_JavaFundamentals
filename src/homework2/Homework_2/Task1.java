package Homework_2;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task1 {
    public static void main(String[] args) {
        int side1 = getNumbers("Input Side 1 : ");
        int side2 = getNumbers("Input Side 2 : ");
        int side3 = getNumbers("Input Side 3 : ");
        double halfPerimeter = getHalfPerimeter(side1, side2, side3);
        double area = getArea(side1, side2, side3, halfPerimeter);
        System.out.printf("The area of triangle is: %.2f%n", area);
    }

    private static int getNumbers(String promt) {
        System.out.println(promt);
        Scanner scann = new Scanner(System.in);
        return Integer.parseInt(scann.nextLine());

    }

    private static double getHalfPerimeter(int side1, int side2, int side3) {
        return (double) (side1 + side2 + side3) / 2;
    }

    private static double getArea(int side1, int side2, int side3, double halfPerimeter) {
        return Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
    }


}


