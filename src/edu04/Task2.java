package edu04;

import java.util.Scanner;

public class Task2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    static int findMax(int number1, int number2, int number3) {
        int max;
        if ((number1 >= number2) && (number1 >= number3)) {
            max = number1;
        } else if ((number2 >= number1) && (number2 >= number3)) {
            max = number2;
        } else {
            max = number3;
        }
        return max;
    }

    static int findMin(int number1, int number2, int number3) {
        //прошу комент, чи прийнятний такий метод
        int min = Math.min(number1, number2);
        min = Math.min(min, number3);
        return min;
    }

    public static void main(String args[]) {
        System.out.print("You need to input three integer numbers. ");
        System.out.println("Please input the first number.");
        int number1 = SCANNER.nextInt();
        System.out.println("input second number");
        int number2 = SCANNER.nextInt();
        System.out.println("input third number");
        int number3 = SCANNER.nextInt();

        System.out.println("The smallest number is " + findMin(number1, number2, number3));
        System.out.println("The greatest number is " + findMax(number1, number2, number3));
    }
}
