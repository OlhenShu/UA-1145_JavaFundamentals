package Homework_5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int response = 0;

        do {
            System.out.print("Input first number: ");
            int inputNumber1 = scanner.nextInt();
            System.out.print("Input second number: ");
            int inputNumber2 = scanner.nextInt();

            System.out.println("The sum of numbers is: " + sumOfInts(inputNumber1, inputNumber2));
            System.out.print("If you want to try again press 1, if not press any number: ");
            response = scanner.nextInt();
        } while (response == 1);

        scanner.close();
    }

    public static int sumOfInts(int inputNumber1, int inputNumber2) {
        return inputNumber1 + inputNumber2;
    }
}
