package edu05.task01;

import java.util.Scanner;

import static java.lang.System.in;

public class InputFiveNumbers {
    private static final Scanner SCANNER = new Scanner(in);

    public static void main(String[] args) {
        InputFiveNumbers fiveNumbers = new InputFiveNumbers();
        System.out.println("You need to input five integer numbers(positive or negative)");
        int[] arrayNumbers = new int[5];
        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.println("Input number " + (i + 1) + " out of 5");
            arrayNumbers[i] = SCANNER.nextInt();
            SCANNER.nextLine();
        }

        int secondPositiveIndex = fiveNumbers.findSecondPositive(arrayNumbers);
        System.out.println("Position of second positive number that you input: " + (secondPositiveIndex + 1));

        int[] minValue = fiveNumbers.findMinValue(arrayNumbers);
        System.out.println("The minimum value is: " + minValue[0] + " and its position in the array: " + (minValue[1] + 1));

        int productOfEnteredEven = fiveNumbers.calculateProductOfEvenNumbers(arrayNumbers);
        System.out.println("Product of your even numbers is: " + productOfEnteredEven +
                "\n Notice, if your numbers not contains any integers to multiply, you still get '1'");
    }

    public int findSecondPositive(int[] numbers) {
        int positiveCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                positiveCount++;
                if (positiveCount == 2) {
                    return i;
                }
            }
        }
        return -1; // Return -1 if there is no second positive number
    }

    public int[] findMinValue(int[] fiveNumbers) {
        int minIndex = 0;
        int minValue = fiveNumbers[0];
        for (int i = 1; i < fiveNumbers.length; i++) {
            if (fiveNumbers[i] < minValue) {
                minValue = fiveNumbers[i];
                minIndex = i;
            }

        }
        return new int[]{minValue, minIndex};
    }

    public int calculateProductOfEvenNumbers(int[] fiveNumbers) {
        int product = 1;
        for (int i = 0; i < fiveNumbers.length; i++) {
            if ((fiveNumbers[i] != 0) && (fiveNumbers[i] % 2 == 0)) {
                product *= fiveNumbers[i];
            }
        }
        return product;
    }
}
