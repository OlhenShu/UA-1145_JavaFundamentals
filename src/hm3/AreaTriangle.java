package hm3;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First side:");
        double side1 = scanner.nextDouble();
        System.out.println("Second side:");
        double side2 = scanner.nextDouble();
        System.out.println("Third side:");
        double side3 = scanner.nextDouble();

        scanner.close();

        double area = (CalculateArea(side1, side2, side3));
        System.out.println("Area of a triangle: " + area);
    }

    static double CalculateArea(double side1, double side2, double side3) {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p-side1) * (p-side2) * (p-side3));
    }
}
