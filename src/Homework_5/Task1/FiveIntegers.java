package Homework_5.Task1;

import java.util.Scanner;

public class FiveIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = 5;
        int[] integerNumbers = new int[arraySize];

        System.out.println("Input 5 integer numbers one by one:");

        // Initialisation of the array

        for (int i = 0; i < arraySize; i++) {
            integerNumbers[i] = scanner.nextInt();
        }

        // Check position of second positive number

        int positionOfSecond = checkPositionOfSecond(arraySize, integerNumbers);

        if (positionOfSecond < 0) {
            System.out.println("There are no two positive numbers");
        } else {
            System.out.println("The position in array of the second positive number is: " + positionOfSecond);
        }

        // Check for minimum value and its position in array

        int minValue = getMinimumValue(arraySize, integerNumbers);
        int positionOfMin = getPositionOfMin(arraySize, integerNumbers, minValue);

        System.out.println("The minimum value in the array is: " + minValue);
        System.out.println("The position of minimum value in the array is: " + positionOfMin);

        // Calculate the product of all entered even numbers

        int product = getProductOfEven(arraySize, integerNumbers);
        System.out.println("The product of all even numbers except 0 is: " + product);

    }

    public static int checkPositionOfSecond(int arraySize, int[] integerNumbers) {
        int counter = 0;
        for (int i = 0; i < arraySize; i++) {
            if (counter < 2) {
                if (integerNumbers[i] > 0) {
                    counter++;
                }
                if (counter == 2) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int getMinimumValue(int arraySize, int[] integerNumbers) {
        int minValue = integerNumbers[0];
        for (int i = 1; i < arraySize; i++) {
            if (minValue > integerNumbers[i]) {
                minValue = integerNumbers[i];
            }
        }
        return minValue;
    }

    public static int getPositionOfMin(int arraySize, int[] integerNumbers, int minValue) {
        int positionOfMin = 0;
        for (int i = 0; i < arraySize; i++) {
            if (minValue == integerNumbers[i]) {
                positionOfMin = i;
            }
        }
        return positionOfMin;
    }

    public static int getProductOfEven(int arraySize, int[] integerNumbers) {
        int product = 1;
        for (int i = 0; i < arraySize; i++) {
            if (integerNumbers[i] % 2 == 0 && integerNumbers[i] != 0) {
                product *= integerNumbers[i];
            }
        }
        return product;
    }
}
