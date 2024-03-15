package Task4;

import java.util.Random;
import static Task4.Main.SCANNER;

public class Program {
    private static int randomNumber;
    private static boolean ifGuessed = false;

    public static int generateRandomNumber() {
        Random random = new Random();
        randomNumber = random.nextInt(10);
        return randomNumber;
    }

    public static void findNumber(int randomNumber) {
        while (!ifGuessed) {
            System.out.println("Enter the number: ");
            int inputedNumber = SCANNER.nextInt();

            if (inputedNumber < 0 | inputedNumber >= 10) {
                throw new IllegalArgumentException("Input must be higher than 0 and lower than 9.");
            }

            if (inputedNumber > randomNumber) {
                System.out.println("Too high, try again");
                ifGuessed = false;
            } else if (inputedNumber < randomNumber) {
                System.out.println("Too low, try again");
                ifGuessed = false;
            } else {
                System.out.println("You win!");
                ifGuessed = true;
            }
            }
        }
    }
