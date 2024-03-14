package edu05.task1;

import java.util.Scanner;

public class homework1_2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        // Entering array of 10 numbers
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input number:");
            arr[i] = SCANNER.nextInt();
        }

        int sumOfFirst5Positive = calculateSumOfFirst5Positive(arr);
        System.out.println("The sum of first 5 positive values is " + sumOfFirst5Positive);
        SCANNER.close();
    }

    private static int calculateSumOfFirst5Positive(int[] arr) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length && count < 5; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
                count++;
            }
        }

        return sum;
    }
}