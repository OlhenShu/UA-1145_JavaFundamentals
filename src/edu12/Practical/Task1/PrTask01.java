package edu12.Practical.Task1;

import java.util.Scanner;

import static java.lang.System.in;

public class PrTask01 {
    public static void main(String[] args) {
        while (true) {
            try {

                int a = readInt("Enter side a: ");
                int b = readInt("Enter side b: ");


                int area = rectangleArea(a, b);
                System.out.println("The rectangle area is " + area);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static int readInt(String prompt) {
        var SCANNER = new Scanner(in);
        while (true) {
            try {
                System.out.println(prompt);
                return Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("It should be a number");
            }

        }
    }

    public static int rectangleArea(int a, int b) {
        if (a < 0 | b < 0) {
            throw new IllegalArgumentException(
                    "The sides should be non negative"
            );
        }
        return a * b;

    }
}
