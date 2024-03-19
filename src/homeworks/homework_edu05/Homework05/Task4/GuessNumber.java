package homework_edu05.Homework05.Task4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = randomNumbers(1);
        int randomNumber = arr[0];


        int guess;
        boolean userGuess = false;
        while (!userGuess) {
            System.out.println("Guess the number (between 1 and 50): ");
            guess = SCANNER.nextInt();

            if (guess == randomNumber) {
                System.out.println("You guessed it. The number is indeed: " + guess);
            } else if (guess < randomNumber) {
                System.out.println("Too low, try again.");

            } else {
                System.out.println("Too high, try again");
            }


        }


    }

    static int[] randomNumbers(int quantity) {
        Random rnd = new Random();
        int[] arr = new int[quantity];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(50) + 1;
        }
        return arr;
    }
}
