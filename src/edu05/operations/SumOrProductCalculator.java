package edu05.operations;

import java.util.Scanner;

public class SumOrProductCalculator {
    public static void main(String[] args) {
        int[] arr = new int[10];

        Scanner in = new Scanner(System.in);

        System.out.print("Input 10 positive and negative numbers mixed up separated by space: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
        }

        boolean positive = true;
        for (int i = 0; i < 5; i++) {
            if (arr[i] < 0) {
                positive = false;
                break;
            }
        }

        if (positive) {
            int result = 0;
            for (int i = 0; i < 5; i++) {
                result += arr[i];
            }
            System.out.print("The sum of the first five numbers: " + result);
        } else {
            int result = 1;
            for (int i = 5; i < 10; i++) {
                result *= arr[i];
            }
            System.out.print("The product of the last 5 numbers: " + result);
        }

        in.close();
    }
}
