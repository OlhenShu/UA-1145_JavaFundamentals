package HM12.part2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TenNumb {
    public static int readNumber(int start, int end) throws InputMismatchException, IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter an integer in the range [%d, %d]: ", start, end);
        int number = scanner.nextInt();
        scanner.nextLine(); // consume newline character

        if (number < start || number >= end) {
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
            System.out.println("Invalid input. Please enter an integer.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
