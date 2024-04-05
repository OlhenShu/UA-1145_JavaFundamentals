package edu12.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = 1;
        int end = 100;
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            try {
                int num = readNumber(start, end);
                if (i > 0 && num <= numbers[i - 1]) {
                    throw new IllegalArgumentException("Number must be greater than the previous one!");
                }
                numbers[i] = num;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input: " + e.getMessage());
                i--; // Retry input for the current number
            }
        }

        System.out.println("Entered numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        scanner.close();
    }

    public static int readNumber(int start, int end) {
        Scanner scanner = new Scanner(System.in);
        int num;
        try {
            num = Integer.parseInt(scanner.nextLine());
            if (num < start || num > end) {
                throw new IllegalArgumentException("Number must be in the range [" + start + ", " + end + "]");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid number format. Please enter an integer.");
        }
        return num;
    }
}
