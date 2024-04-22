package HomeWork12;

import java.util.Scanner;

import static java.lang.System.in;

public class Task1 {
    public static double div(double number1, double number2) throws ArithmeticException {
        if (number2 == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return number1 / number2;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(in)) {
            System.out.print("Enter the first number: ");
            double number1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double number2 = scanner.nextDouble();

            double result = div(number1, number2);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input or unexpected error occurred.");
        }
    }
}
