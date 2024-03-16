package HomeWork03;

import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Side 1: ");
        double side1 = scanner.nextInt();
        System.out.print("Input Side 2: ");
        double side2 = scanner.nextInt();
        System.out.print("Input Side 3: ");
        double side3 = scanner.nextInt();
        calculateArea(side1, side2, side3);

    }

    public static void calculateArea(double side1, double side2, double side3) {
        double halfPerimeter = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(halfPerimeter * ((halfPerimeter - side1) *
                (halfPerimeter - side2) * (halfPerimeter - side3)));
        System.out.println("The area of the triangle is: " + String.format("%.2f", area));

    }
}





