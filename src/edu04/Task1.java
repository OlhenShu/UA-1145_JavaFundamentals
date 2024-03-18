package edu04;

import java.util.Scanner;

public class Task1 {
    static Scanner scanner = new Scanner(System.in);

    static void checkThreeNumbers(float number1, float number2, float number3) {
        if ((number1 >= -5 && number1 <= 5) && (number2 >= -5 && number2 <= 5) && (number3 >= -5 && number3 <= 5)) {
            System.out.println("The numbers belong to the range [-5, 5].");
        } else {
            System.out.println("Not all numbers belong to the range [-5, 5].");
        }
    }

    public static void main(String[] args) {
        System.out.println("Please input the first number (its could be Float or Integer value).");
        float number1 = scanner.nextFloat();
        System.out.println("Please input second number");
        float number2 = scanner.nextFloat();
        System.out.println("Please input third number");
        float number3 = scanner.nextFloat();

        checkThreeNumbers(number1, number2, number3);
    }

}
