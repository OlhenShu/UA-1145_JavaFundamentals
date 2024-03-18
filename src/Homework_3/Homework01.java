package Homework_3;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Input Side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Input Side 3: ");
        double side3 = scanner.nextDouble();
        double area = (calculateArea(side1, side2, side3));
        System.out.printf("The area of the triangle is %.2f", area);
    }

    public static double calculateArea(double side1, double side2, double side3) {
        double halfPerimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
    }
}
