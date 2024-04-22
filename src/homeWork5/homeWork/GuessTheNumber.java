package homeWork5.homeWork;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    void guessNumber(Scanner scanner) {
        Random random = new Random();
        int randomNumber = random.nextInt(0, 100);// its to 99
        //int randomNumber = random.nextInt(101); // Now includes 100

        //To make the random range more flexible and not hardcoded,
        // you can define the range limits as parameters to the guessNumber method or as class variables.
        // Here’s an example of how you can modify the GuessTheNumber class to accept dynamic range limits:

//    private int lowerBound;
//    private int upperBound;
//
//    public GuessTheNumber(int lowerBound, int upperBound) {
//        this.lowerBound = lowerBound;
//        this.upperBound = upperBound;
//    }
//
//    void guessNumber(Scanner scanner) {
//        Random random = new Random();
//        // Adjust the upper bound to make it inclusive
//        int randomNumber = random.nextInt((upperBound - lowerBound) + 1) + lowerBound;

        boolean guessed = false;
        do {
            System.out.println("Guess the number between 0 and 100 ->> ");
            int userNumber = scanner.nextInt();
            if (userNumber > randomNumber) {
                System.out.println("Too high, try again.");
            } else if (userNumber < randomNumber) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Correct!");
                guessed = true;
            }
        } while (!guessed);
    }
}

class RunGuessTheNumber {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        GuessTheNumber guessTheNumber = new GuessTheNumber();
        guessTheNumber.guessNumber(sc);
    }
}
