package edu03.task1;

import java.util.Scanner;

//Homework Task1
class HomeworkTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the side 1");
        double side1 = scanner.nextDouble();

        System.out.println("Type the side 2");
        double side2 = scanner.nextDouble();

        System.out.println("Type the side 3");
        double side3 = scanner.nextDouble();

        double area = calculateArea(side1, side2, side3);
        System.out.println("Area of triangle is = " + area);
        scanner.close();
    }

    public static double calculateArea(double side1, double side2, double side3) {

        double perimeter = (side1 + side2 + side3) / 2;

        double area;
        area = Math.sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));
        return area;
    }
}
