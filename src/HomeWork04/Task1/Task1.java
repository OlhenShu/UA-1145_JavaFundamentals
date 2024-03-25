package HomeWork04.Task1;

import java.util.Scanner;

import static java.lang.System.in;

public class Task1 {
    final static int MIN_RANGE = -5;
    final static int MAX_RANGE = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.print("Input first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Input second number: ");
        double secondNumber = scanner.nextDouble();
        System.out.print("Input third number: ");
        double thridNumber = scanner.nextDouble();

        if ((firstNumber >= MIN_RANGE && firstNumber <= MAX_RANGE) &&
                (secondNumber >= MIN_RANGE && secondNumber <= MAX_RANGE) &&
                (thridNumber >= MIN_RANGE && thridNumber <= MAX_RANGE)) {
            System.out.println("Numbers belong to the range [-5, 5]");
        } else {
            System.out.println("Numbers do not belong to the range [-5, 5]");
        }


    }
}
