package homework.hw3;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 sides of the triangle:");

        System.out.print("Input side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Input side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Input side 3: ");
        double side3 = scanner.nextDouble();

        System.out.printf("The area of the triangle is " + "%.2f", calculateTriangleArea(side1, side2, side3));
        scanner.close();
    }

    private static double calculateTriangleArea(double side1, double side2, double side3) {
        double semiPerimetrOfTriangle = (side1 + side2 + side3) / 2;

        return Math.sqrt(semiPerimetrOfTriangle *
                ((semiPerimetrOfTriangle - side1) *
                        (semiPerimetrOfTriangle - side2) *
                        (semiPerimetrOfTriangle - side3)));
    }
}
