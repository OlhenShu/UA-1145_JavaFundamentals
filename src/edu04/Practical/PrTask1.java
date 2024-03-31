package edu04.Practical;

import java.util.Scanner;

public class PrTask1 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter three numbers");
        int number1 = SCANNER.nextInt();
        int number2 = SCANNER.nextInt();
        int number3 = SCANNER.nextInt();

        int count = 0;
        if (number1 % 2 !=0) count++;
        if (number2 % 2 !=0) count++;
        if (number3 % 2 !=0) count++;

        System.out.println("There are " + count + " odd numbers.");
    }
}
