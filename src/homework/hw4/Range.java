package homework.hw4;

import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double c = scanner.nextDouble();

        checkNumber(a, b, c);
    }

    public static void checkNumber(double a, double b, double c) {
        if (a <= 5 && a >= -5 && b <= 5 && b >= -5 && c <= 5 && c >= -5) {
            System.out.println("All numbers belong to the range [-5, 5]");
        } else {
            System.out.println("Not all numbers belong to the range [-5, 5]");
        }
    }
}
