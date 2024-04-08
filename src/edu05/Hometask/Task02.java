package edu05.Hometask;

import java.util.Locale;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] str) {
        Scanner SCANNER = new Scanner(System.in);
        System.out.println("Please enter 2 numbers:");
        int number1 = SCANNER.nextInt();
        int number2 = SCANNER.nextInt();
        String answer;

        do {
            int sum = number1 + number2;
            System.out.println("Their sum is equal to: " + sum);
            System.out.println("Do you want to repeat calculation?");
            answer = SCANNER.next();

        }
        while (answer.equalsIgnoreCase("yes"));
    }
}
