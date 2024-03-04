package edu03;

import java.util.Arrays;
import java.util.Scanner;

public class TheSmallestNumber {
    static int findSmallest(int first, int second, int third) {
        int temp[] = {first, second, third};
        Arrays.sort(temp);
        int result = temp[0];
        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Input the second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Input the third number:");
        int thirdNumber = scanner.nextInt();

        System.out.println("The smallest number is " + findSmallest(firstNumber, secondNumber, thirdNumber));

        scanner.close();
    }
}