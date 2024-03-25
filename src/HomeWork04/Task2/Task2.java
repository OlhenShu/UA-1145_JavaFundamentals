package HomeWork04.Task2;

import java.util.Scanner;

import static java.lang.System.in;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = scanner.nextInt();
        maxNumber(firstNumber, secondNumber, thirdNumber);
        minNumber(firstNumber, secondNumber, thirdNumber);
    }

    public static void maxNumber(int firstNumber, int secondNumber, int thirdNumber) {
        int max = firstNumber;
        if (secondNumber > max) {
            max = secondNumber;
        }
        if (max < thirdNumber) {
            max = thirdNumber;
        }
        System.out.println("Highest number is: " + max);
    }

    public static void minNumber(int firstNumber, int secondNumber, int thirdNumber) {
        int min = firstNumber;
        if (secondNumber < min) {
            min = secondNumber;
        }
        if (thirdNumber < min) {
            min = thirdNumber;
        }
        System.out.println("Smallest number is: " + min);
    }
}
