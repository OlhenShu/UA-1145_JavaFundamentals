package edu12.task1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static double div(double first, double second) {
        return first / second;
    }

    public static void main(String[] args) {
//better try with resources
        try (Scanner in = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.print("Input the first number: ");
            double firstNum = in.nextDouble();
            System.out.print("Input the second number: ");
            double secondNum = in.nextDouble();

            double result = div(firstNum, secondNum);

            System.out.println("Result of division: " + result);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
