package Homework_4;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {

        float firstNumber = getNumber("Enter the first float number: ");
        float secondNumber = getNumber("Enter the second float number: ");
        float thirdNumber = getNumber("Enter the third float number: ");

        boolean result = isInRangeNumber(firstNumber, secondNumber, thirdNumber);

        if (result == true) {
            System.out.println("Numbers belong to the range [-5, 5]");
        } else {
            System.out.println("Not all numbers belong to the range [-5, 5]");
        }
    }

    private static boolean isInRangeNumber(float firstNumber, float secondNumber, float thirdNumber) {
        if ((firstNumber < -5 || firstNumber > 5) ||
                (secondNumber < -5 || secondNumber > 5) ||
                (thirdNumber < -5 || thirdNumber > 5)) {
            return false;
        }
        return true;
    }

    private static float getNumber(String s) {
        System.out.print(s);

        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }
}
