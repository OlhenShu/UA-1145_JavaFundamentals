package edu05.task2;

import java.util.Scanner;

public class Homework02 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String response;
        do {
            System.out.println("Enter the first number:");
            int num1 = SCANNER.nextInt();

            System.out.println("Enter the second number:");
            int num2 = SCANNER.nextInt();

            int sum = num1 + num2;
            System.out.println("Sum of the numbers: " + sum);

            System.out.println("Do you want to repeat? (yes/no)");
            response = SCANNER.next();
        } while (response.equals("yes"));

        SCANNER.close();
    }
}
//    public static void main(String[] args) {
//        // Entering array of 2 numbers
//        int[] arr = new int[2];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Input number to calculate the sum:");
//            arr[i] = SCANNER.nextInt();
//        }
//
//        int sumOfTwo = calculateSumOfTwo(arr);
//        System.out.println("The sum of 2 values is " + sumOfTwo);
//    }
//
//    private static int calculateSumOfTwo(int[] arr) {
//        int sum = 0;
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0) {
//                sum += arr[i];
//                count++;
//            }
//        }
//
//        return sum;
//    }
