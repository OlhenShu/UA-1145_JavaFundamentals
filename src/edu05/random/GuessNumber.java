package edu05.random;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int secretNumber = (int) (Math.random() * 100) + 1; // Generate a number from 1 to 100

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Guess the number between 1 and 100: ");

            String input = in.nextLine(); // User can input string, so we should read it and add verification of such case

            if (input.isEmpty()) { // Check if entered the data is not empty
                System.out.println("Invalid input. Please enter a valid number.");
                continue;
            }
            if (!input.matches("\\d+")) { // Check if the entered data contains only digits
                System.out.println("Invalid input. Please enter a valid number.");
                continue;
            }
            int number = Integer.parseInt(input); // Convert input string to integer for comparison with the secret number.
            if (number < 1 || number > 100) { // Check if entered integer number is in the range from 1 to 100.
                System.out.println("Invalid input. Please enter a valid number between 1 and 100.");
                continue;
            }
            if (secretNumber == number) {
                System.out.println("Congratulations! You guessed the correct number: " + secretNumber);
                break;
            } else if (secretNumber < number) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Too low, try again.");
            }
        }
        in.close();
    }
}

