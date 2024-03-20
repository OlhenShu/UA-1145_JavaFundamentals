package Homework_4;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        int firstNumber = getNumber("Enter the first number: ");
        int secondNumber = getNumber("Enter the second number: ");
        int thirdNumber = getNumber("Enter the third number: ");

        int minNumber = (calculateMin(firstNumber, secondNumber, thirdNumber));
        int maxNumber = (calculateMax(firstNumber, secondNumber, thirdNumber));
        System.out.println("The minimum number is " + minNumber);
        System.out.println("The maximum number is " + maxNumber);
    }

    public static int calculateMin(int number1, int number2, int number3) {
        int minNumber = number1;
        if (number2 < number1) {
            minNumber = number2;
        }
        if (number3 < minNumber) {
            minNumber = number3;
        }
        return minNumber;
    }

    public static int calculateMax(int number1, int number2, int number3) {
        int maxNumber = number1;
        if (number2 > number1) {
            maxNumber = number2;
        }
        if (number3 > maxNumber) {
            maxNumber = number3;
        }
        return maxNumber;
    }

    private static int getNumber(String s) {
        System.out.print(s);

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
