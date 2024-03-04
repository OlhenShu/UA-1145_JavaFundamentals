package Second;

import java.util.Locale;

import static Second.Main.SCANNER;

public class Number {
    private static int firstNumber;
    private static int secondNumber;
    private static int thirdNumber;
    public static void input() {
        Locale.setDefault(Locale.ROOT);
        System.out.println("Input the first number: ");
        firstNumber = SCANNER.nextInt();
        System.out.println("Input the second number: ");
        secondNumber = SCANNER.nextInt();
        System.out.println("Input the third number: ");
        thirdNumber = SCANNER.nextInt();
    }

    public static void findSmallest() {
        // equals the first given number to the minimum
        int min = firstNumber;
        if (secondNumber < min) { // if the second number is less than the first, the second becomes the minimum
            min = secondNumber;
        }
        if (thirdNumber < min) {// if the third number is less than the first or the second, the third becomes the minimum
            min = thirdNumber;
        }
        System.out.println("The smallest number is: " + min);
    }
}
