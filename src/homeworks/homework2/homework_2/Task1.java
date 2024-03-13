package homework2.homework_2;

import java.util.Scanner;

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
/*Good job! For this task, there can be some improvement
Add input validation for triangle sides.
Check for negative values or zero. But it's you will understand in feature
Also, a good idea creates a method to verify that the sum of any two sides is greater than the third (triangle existence condition).

Create a separate class for user input. This will make your code more modular.
Keep the main Task1 class for calculating the triangle area. It will use the data obtained from the input class.
    */
}


