package edu12.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static int readNumber(int startNum, int endNum) throws InputMismatchException, IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter an integer in range %d and %d: ", startNum + 1, endNum - 1);
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number < startNum || number > endNum) {
            throw new IllegalArgumentException("Number is not in the range.");
        }

        return number;
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        int previousNumber = start - 1;

        try {
            for (int i = 0; i < 10; i++) {
                int number = readNumber(previousNumber + 1, end);
                if (number <= previousNumber) {
                    throw new IllegalArgumentException("Number must be greater than the previous.");
                }
                previousNumber = number;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer тгьиук.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
