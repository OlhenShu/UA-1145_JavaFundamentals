package edu05;

import java.util.Scanner;

import static java.lang.System.in;

public class Task02DoWhile {
    public static final Scanner SCANNER = new Scanner(in);

    public static void main(String[] args) {
        Task02DoWhile task02DoWhile = new Task02DoWhile();
        char repeat;

        do {
            System.out.println("Enter the first number: ");
            double num1 = SCANNER.nextDouble();
            System.out.println("Enter the second number: ");
            double num2 = SCANNER.nextDouble();

            double sum = task02DoWhile.calculateSum(num1, num2);
            System.out.println("The sum of current values is: " + sum);

            System.out.println("Do you want to continue? (y/n):");
            repeat = SCANNER.next().charAt(0);

        } while (repeat == 'y' || repeat == 'Y');
        System.out.println("Thank you for using our service!");
    }

    public double calculateSum(double num1, double num2) {
        return num1 + num2;
    }

}