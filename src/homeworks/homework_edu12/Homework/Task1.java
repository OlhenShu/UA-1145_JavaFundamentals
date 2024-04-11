package homeworks.homework_edu12.Homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    static Scanner scanner = new Scanner(System.in);

    public static double div(double numerator, double denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        double numerator = 0;
        double denominator = 0;
        double result = 0;

        while (true) {
            try {
                System.out.println("Enter the number for numerator: ");
                numerator = scanner.nextDouble();
                System.out.println("Enter the number for denominator: ");
                denominator = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
                scanner.next();
            }
        }
        try {
            result = div(numerator, denominator);
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
