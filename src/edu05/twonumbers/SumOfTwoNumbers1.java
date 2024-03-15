package edu05.twonumbers;

import java.util.Scanner;

// The task solution is implemented without validation for entered incorrect data
public class SumOfTwoNumbers1 {
    public static void main(String[] args) {
        String choice;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Input the first number: ");
            int firstNumber = in.nextInt();

            System.out.println("Input the second number: ");
            int secondNumber = in.nextInt();

            int sum = firstNumber + secondNumber;
            System.out.print("Sum: " + sum);

            System.out.print("\nContinue? Y/N: ");
            choice = in.next().toUpperCase();
        } while ("Y".equals(choice));

        in.close();
    }
}
