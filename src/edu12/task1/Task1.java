package edu12.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();

                double result = div(num1, num2);
                System.out.println("Result: " + result);
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input. Please enter numbers.");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }

        scanner.close();
    }

    public static double div(double num1, double num2) {
        if (num1 < 0 || num2 < 0) {
            throw new IllegalArgumentException(
                    "The numbers should be non-negative."
            );
        }
        return num1 / num2;
    }
}