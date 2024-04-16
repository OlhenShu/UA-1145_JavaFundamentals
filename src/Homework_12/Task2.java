package Homework_12;

import java.util.Scanner;

public class Task2 {
    public static final int START_RANGE = 1;
    public static final int END_RANGE = 100;
    public static final int INPUT_AMOUNT = 10;

    public static void main(String[] args) {
        System.out.println("Enter " + INPUT_AMOUNT + " integer numbers in range "
                + START_RANGE + " - " + END_RANGE + ":");

        for (int i = 0; i < INPUT_AMOUNT; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            try {
                readNumber(START_RANGE, END_RANGE);
            } catch (Exception e) {
                System.out.println("Invalid input");
            }
        }
    }

    public static int readNumber(int start, int end) throws RuntimeException {
        Scanner scanner = new Scanner(System.in);
        try {
            int number = scanner.nextInt();
            if (number < START_RANGE || number > END_RANGE) {
                System.out.println("Number must be in range " + start + " - " + end);
                throw new IllegalArgumentException();
            } else {
                return number;
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}

