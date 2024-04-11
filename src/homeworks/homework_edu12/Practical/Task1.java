package homeworks.homework_edu12.Practical;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        boolean validInput = false;

        while (!validInput) {
            System.out.println("Enter integer value of a: ");
            try {
                a = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Enter valid value.");
                scanner.next();
            }
        }

        validInput = false;

        while (!validInput) {
            System.out.println("Enter integer value of b: ");
            try {
                b = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Enter valid value.");
                scanner.next();
            }
        }


        try {
            int result = squareRectangle(a, b);
            System.out.println("result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int squareRectangle(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("a and/or b can't be negative.");
        }
        return a * b;
    }
}
