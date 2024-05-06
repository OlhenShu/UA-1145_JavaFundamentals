package edu05;

import java.util.Random;
import java.util.Scanner;

//public class Task04RandomGenerator {
//
//    private static final Scanner SCANNER = new Scanner(in);
//    private static int targetNumber;//The targetNumber should not be static if its value is specific to an instance of Task04RandomGenerator.
//
//    public void setTargetNumber(int targetNumber) {
//        this.targetNumber = targetNumber;
//    }
//
//    public static void main(String[] args) {
//        Random RAND = new Random();//should typically be a private static final field if you don't intend to regenerate the Random instance multiple times
//        targetNumber = RAND.nextInt(0, 100);
//
//        Task04RandomGenerator randomGenerator = new Task04RandomGenerator();
//
//        System.out.println(
//                "\"The program will pick a number from 0 to 100, and you need to guess which number it was.\"");
////input number
//        int userGuess;
//        do {
//            System.out.println("Guess the number (between 0 to 100)");
//            userGuess = SCANNER.nextInt();
//
//            if (randomGenerator.checkGuess(userGuess)) {
//                System.out.println("Hooray! You guessed the correct number " + randomGenerator.targetNumber + ".");
//            }
//        } while (userGuess != targetNumber);
//    }
//
//    public boolean checkGuess(int userGuess) {
//
//        if (userGuess == targetNumber) {
//            return true;
//        } else if (userGuess < targetNumber) {
//            System.out.println("Too low, try again.");
//        } else {
//            System.out.println("Too high, try again.");
//        }
//        return false;
//    }
//
//
//}
public class Task04RandomGenerator {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RAND = new Random();
    private int targetNumber;

    public Task04RandomGenerator() {
        targetNumber = RAND.nextInt(101); // Assuming exclusive upper bound (0 to 100)
    }

    public static void main(String[] args) {
        Task04RandomGenerator randomGenerator = new Task04RandomGenerator();

        System.out.println("The program will pick a number from 0 to 100, and you need to guess which number it was.");

        int userGuess = -1;
        while (userGuess != randomGenerator.targetNumber) {
            System.out.println("Guess the number (between 0 to 100):");
            while (!SCANNER.hasNextInt()) {
                System.out.println("That's not a valid number. Please enter a number:");
                SCANNER.next(); // Discard non-integer input
            }
            userGuess = SCANNER.nextInt();

            if (randomGenerator.checkGuess(userGuess)) {
                System.out.println("Hooray! You guessed the correct number " + randomGenerator.targetNumber + ".");
                break; // Exit loop if correct guess
            }
        }
        SCANNER.close();
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