package edu05.HomeWork02;

import java.util.Scanner;

import static java.lang.System.in;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        int[] twoNumbers = new int[2];
        String userResp;

        do {
            System.out.println("Введіть 2 числа: ");
            for (int i = 0; i < twoNumbers.length; i++) {
                twoNumbers[i] = scan.nextInt();
            }
            System.out.println("The sum is:" + sumCalc(twoNumbers));

            System.out.print("Може, ще разочок? (yes/no): ");
            userResp = scan.next();
        }
        while (userResp.equalsIgnoreCase("yes"));
    }

    private static int sumCalc(int[] twoNumbers) {
        int sum = 0;
        for (int twoNumber : twoNumbers) {
            sum += twoNumber;
        }
        return sum;
    }
}
//Add input validation to ensure the user inputs integers.
// If a non-integer is entered, the program prompts the user again for a numerical input.