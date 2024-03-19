package homework_edu05.Homework05.Task1;

import java.util.Scanner;

public class FiveIntegers {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = new int[10];
        System.out.println("Enter 5 integer numbers: ");

        for (int i = 1; i < 6; i++) {
            System.out.println("Enter number " + i + ": ");
            numbers[i] = SCANNER.nextInt();
        }

        int secondPositivePosition = secondPositive(numbers);
        if (secondPositivePosition != -1) {
            System.out.println("Position of the second positive number is: " + secondPositivePosition);
        } else {
            System.out.println("There are less than two positive integers in the array.");
        }


    }

    static int secondPositive(int[] numbers) {
        int countPosition = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                ++countPosition;
            }
            return i + 1;

        }
        return -1;
    }


}
