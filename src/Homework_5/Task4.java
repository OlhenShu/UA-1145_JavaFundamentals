package Homework_5;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int secretNumber = random.nextInt(100);

        boolean isEqual = false;
        System.out.println("Input number from 0 to 100: ");

        while (!isEqual) {
            int inputNumber = scanner.nextInt();

            isEqual = isNumbersEqual(secretNumber, inputNumber);
        }

        System.out.println("Bye-bye!");
        scanner.close();
    }

    static boolean isNumbersEqual(int secretNumber, int inputNumber) {
        if ((inputNumber < 0 || inputNumber > 100) || (secretNumber < 0 || secretNumber > 100)) {
            System.out.println("Number should be in range 0 - 100:");
            return false;
        } else {
            if (inputNumber == secretNumber) {
                System.out.println("You won. The secret number is " + secretNumber);
                return true;
            } else if (inputNumber > secretNumber){
                System.out.println("Too high, try again!");
            } else {
                System.out.println("Too low, try again!");
            }
            return false;
        }
    }
}
