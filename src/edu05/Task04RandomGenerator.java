package edu05;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class Task04RandomGenerator {

    private static final Scanner SCANNER = new Scanner(in);
    private static int targetNumber;

    public void setTargetNumber(int targetNumber) {
        this.targetNumber = targetNumber;
    }

    public static void main(String[] args) {
        Random RAND = new Random();
        targetNumber = RAND.nextInt(0, 100);

        Task04RandomGenerator randomGenerator = new Task04RandomGenerator();

        System.out.println(
                "\"The program will pick a number from 0 to 100, and you need to guess which number it was.\"");
//input number
        int userGuess;
        do {
            System.out.println("Guess the number (between 0 to 100)");
            userGuess = SCANNER.nextInt();

            if (randomGenerator.checkGuess(userGuess)) {
                System.out.println("Hooray! You guessed the correct number " + randomGenerator.targetNumber + ".");
            }
        } while (userGuess != targetNumber);
    }

    public boolean checkGuess(int userGuess) {

        if (userGuess == targetNumber) {
            return true;
        } else if (userGuess < targetNumber) {
            System.out.println("Too low, try again.");
        } else {
            System.out.println("Too high, try again.");
        }
        return false;
    }


}
