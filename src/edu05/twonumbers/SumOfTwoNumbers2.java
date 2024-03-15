package edu05.twonumbers;

import java.util.Scanner;

// The task solution is implemented with validation for entered incorrect data

public class SumOfTwoNumbers2 {
    public static void main(String[] args) {
        String choice = null;

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Input the first integer or decimal number: ");
            String firstInput = in.nextLine();

            System.out.print("Input the second integer or decimal number: ");
            String secondInput = in.nextLine();

            //Check if input contains empty string
            if (firstInput.isEmpty() || secondInput.isEmpty()) {
                System.out.println("Empty input. Please enter both numbers.");
                continue;
            }

            /// Check if input contains any non-numeric characters or commas for decimal numbers
            if (!firstInput.matches("[0-9]+(,[0-9]+)?") || !secondInput.matches("[0-9]+(,[0-9]+)?")) {
                System.out.println("Invalid input format. Please enter valid numbers.");
                continue;
            }

            // Replace comma with dot if present
            firstInput = firstInput.replace(",", ".");
            secondInput = secondInput.replace(",", ".");

            double firstNumber = Double.parseDouble(firstInput);
            double secondNumber = Double.parseDouble(secondInput);

            double sum = firstNumber + secondNumber;
            String formattedSum = String.format("%.2f", sum);
            System.out.println("Sum: " + formattedSum);

            System.out.print("\nWould you like to continue? Y/N: ");
            choice = in.nextLine().trim().toUpperCase();
        } while ("Y".equals(choice));

        in.close();
    }
}
