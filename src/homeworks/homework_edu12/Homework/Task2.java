package homeworks.homework_edu12.Homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            int number;
            do {
                try {
                    number = readNumber((i == 0 ? 1 : numbers[i - 1] + 1), 99);
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } while (true);

            numbers[i] = number;
        }

        System.out.println("Following numbers in increasing order: ");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static int readNumber(int start, int end) {
        while (true) {
            try {
                System.out.println("Enter a number between " + start + " and " + end + ": ");
                int numb = scanner.nextInt();
                if (numb >= start && numb <= end) {
                    return numb;
                } else {
                    throw new IllegalArgumentException("Number isn't within the range.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input.");
                scanner.next();
            }
        }
    }
}
