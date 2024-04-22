package HomeWork12;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;


public class Task2 {
    public static int readNumber(int start, int end) throws InputMismatchException, IllegalArgumentException {
        Scanner scanner = new Scanner(in);
        System.out.printf("Enter a number between " + start + " and " + end + ": ");

        while (true) {
            try {
                int number = scanner.nextInt();
                if (number < start || number > end) {
                    throw new IllegalArgumentException("Number is out of range.");
                }
                return number;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        int previousNumber = start;
        try {
            for (int i = 0; i < 10; i++) {
                int number = readNumber(previousNumber + 1, end);
                if (number <= previousNumber) {
                    throw new IllegalArgumentException("Number must be greater than the previous.");
                } else {
                    previousNumber = number;
                }
                System.out.println("All numbers entered.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer number.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

