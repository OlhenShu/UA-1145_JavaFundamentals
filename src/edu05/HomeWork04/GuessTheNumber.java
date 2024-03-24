package edu05.HomeWork04;


import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(in);

        Random random = new Random();
        //Генеруємо рандом намбер
        int numberToGuess = random.nextInt(100) + 1;

        int guess = 0;// Initialize guess

        System.out.println("Вгадайте число (між 1 та 100):");

        // Loop4eg
        do {
            guess = scan.nextInt();

            if (guess > numberToGuess) {
                System.out.println("Доволі багато, спробуй ще.");
            } else if (guess < numberToGuess) {
                System.out.println("Цього замало, спробуй ще.");
            } else {
                System.out.println("Оце діло! Рекомендую перевірити себе на присутність екстрасенсорних здібностей!");
            }
        } while (guess != numberToGuess);

        scan.close();
    }
}
/*
do {
            while (!scan.hasNextInt()) { // Check if the user input is an integer
                System.out.println("Це не число. Введіть число між 1 та 100:");
                scan.next(); // Consume the non-integer input
            }
            guess = scan.nextInt();

            // Ensure the guess is within the valid range
            if (guess < 1 || guess > 100) {
                System.out.println("Число має бути між 1 та 100. Спробуйте ще раз:");
                continue; // Skip the remaining loop body and continue with the next iteration
            }

            if (guess > numberToGuess) {
                System.out.println("Доволі багато, спробуй ще.");
            } else if (guess < numberToGuess) {
                System.out.println("Цього замало, спробуй ще.");
            } else {
                System.out.println("Оце діло! Рекомендую перевірити себе на присутність екстрасенсорних здібностей!");
            }
        } while (guess != numberToGuess);
 */
/*
Validation of Integer Input:
Added a check to ensure the user inputs an integer.
If the input is not an integer, the program prompts the user again.
Range Checking:
Added a check to ensure guesses are within the range of 1 to 100.
If a guess is outside this range, it prompts the user to enter a number within the valid range again.
 */