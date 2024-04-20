package edu12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWork02 {
    public static int readNumber(int start, int end) throws InputMismatchException, NumberOutOfRangeException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between " + start + " and " + end + ": ");
        int number;
        try {
            number = scanner.nextInt();
            if (number < start || number > end) {
                throw new NumberOutOfRangeException("Number is out of range.");
            }
        } catch (InputMismatchException e) {
            throw e;
        }
        return number;
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        int previousNumber = start;
        try {
            for (int i = 1; i <= 10; i++) {
                int number = readNumber(previousNumber, end);
                if (number <= previousNumber) {
                    System.out.println("Number must be greater than the previous number.");
                    i--; // Retry input
                } else {
                    previousNumber = number;
                }
            }
            System.out.println("All numbers entered successfully.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer number.");
        } catch (NumberOutOfRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}

class NumberOutOfRangeException extends Exception {
    public NumberOutOfRangeException(String message) {
        super(message);
    }
}
