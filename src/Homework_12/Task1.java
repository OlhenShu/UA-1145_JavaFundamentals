package Homework_12;

import java.util.Locale;
import java.util.Scanner;

public class Task1 implements AutoCloseable {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Please input first double number in 0.00 format:");
            double number1 = scanner.nextDouble();

            System.out.println("Please input second double number in 0.00 format:");
            double number2 = scanner.nextDouble();

            double result = div(number1, number2);
            System.out.printf("%.2f / %.2f = %.2f%n", number1, number2, result);

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static double div(double num1, double num2) {
        return num1 / num2;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Exception is found.");
    }
}
