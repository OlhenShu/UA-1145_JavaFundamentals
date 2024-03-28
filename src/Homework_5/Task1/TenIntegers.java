package Homework_5.Task1;

import java.util.Scanner;

// 10 integers numbers and calculates the sum of the first five elements if they are
// positive, or the product of the last five elements if they are not and output the result.
public class TenIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean ifPositive = true;

        int arraySize = 10;
        int halfArraySize = 5;
        int[] integerNumbers = new int[arraySize];

        System.out.println("Input 10 integer numbers one by one: ");

        for (int i = 0; i < arraySize; i++) {
            integerNumbers[i] = scanner.nextInt();

            if (i < halfArraySize) {
                if (integerNumbers[i] < 1) {
                    ifPositive = false;
                }
            }
        }

        if (ifPositive) {
            int sum = calculateSum(integerNumbers, halfArraySize);

            System.out.println("The sum of 5 first numbers is: " + sum);
        } else {
            int product = calculateProduct(integerNumbers, halfArraySize);

            System.out.println("The product of 5 last numbers is: " + product);
        }
    }

    public static int calculateSum(int[] array, int limit) {
        int sum = 0;

        for (int i = 0; i < limit; i++) {
            sum += array[i];
        }

        return sum;
    }

    public static int calculateProduct(int[] array, int limit) {
        int product = 1;

        for (int i = limit; i < array.length; i++) {
            product *= array[i];
        }

        return product;
    }
}
