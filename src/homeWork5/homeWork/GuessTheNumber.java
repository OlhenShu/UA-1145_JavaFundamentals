package homeWork5.homeWork;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    void guessNumber(Scanner scanner) {
        Random random = new Random();
        int randomNumber = random.nextInt(0, 100);
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GuessTheNumber guessTheNumber = new GuessTheNumber();
        guessTheNumber.guessNumber(sc);
    }
}
