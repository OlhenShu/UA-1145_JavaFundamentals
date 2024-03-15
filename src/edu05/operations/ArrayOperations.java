package edu05.operations;

import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner in = new Scanner(System.in);

        System.out.print("Input 5 positive and/or negative integer numbers mixed up separated by space: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }

        // 1 - Position of second positive number
        int countOfPositive = 0;
        int position = -1; // We use -1 as a flag for the absence of a second positive number
        for (int i = 0; i < 5; i++) {
            if (arr[i] > 0) {
                countOfPositive++;
                if (countOfPositive == 2) {
                    position = i;
                    break; // The second positive number is found, exit the loop
                }
            }
        }
        System.out.println("Position of the second positive number: " + (position == -1 ? "Not found" : position + 1));

        // 2 - Minimum value and its position in the array
        int minValue = arr[0];
        int positionOfMin = 0;
        for (int i = 1; i < 5; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                positionOfMin = i;
            }
        }
        System.out.println("Minimum: " + minValue + " Position: " + (positionOfMin + 1));

        // 3 - Calculate the product of all entered even numbers (exclude 0 from even if entered by user)
        int productOfEvenNum = 1;
        for (int i = 1; i < 5; i++) {
            if ((arr[i] % 2 == 0) && (arr[i] != 0)) {
                productOfEvenNum *= arr[i];
            }
        }
        if (productOfEvenNum == 1) {
            System.out.print("Even numbers are not found");
        } else {
            System.out.print("Product of all even numbers: " + productOfEvenNum);
        }

        in.close();
    }
}

