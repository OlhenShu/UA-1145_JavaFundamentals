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
//Renamed methods semiPerimeter and area to calculateSemiPerimeter and calculateArea to be more descriptive of their actions.
// This Java console application calculates the area of a triangle using Heron's formula.
// The following variables are defined within the scope of the main method and passed to other methods as needed.
// It's recommended to add a method to check if a triangle is valid based on the lengths of its sides.
// A triangle is considered valid if the sum of any two sides is greater than the third side.


// You can keep static variable declarations if they logically fit the context of your program,
// especially if they are used across several methods or need to be shared across all instances
// of the class or remain unchanged throughout the program's execution.

// However, for this specific example, using static variables to store the lengths of the triangle's sides
// and the semi-perimeter isn't the best choice since these variables are only used within the main method
// and passed to methods for the triangle area calculation. Thus, there's no need to store side1, side2,
// side3, and semiPerimeter as static at the class level as they are not accessed outside of the main method.

// If there's no requirement in your program to retain these values for reuse or access them from other classes
// or methods, it's advisable to declare them as local variables within the method they are used. This approach
// simplifies code understanding and prevents unnecessary expansion of variable scope.
