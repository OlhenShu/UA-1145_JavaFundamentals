package edu05;

import java.util.Scanner;

import static java.lang.System.in;

public class TaskDoWhile {
    public static final Scanner SCANNER = new Scanner(in);

    public static void main(String[] args) {
        String answer;
        double num1;
        double num2;
        do {
            System.out.println("input first number to made sum");
            num1 = SCANNER.nextDouble();
            SCANNER.nextLine();

            System.out.println("input next number to made sum");
            num2 = SCANNER.nextDouble();
            SCANNER.nextLine();
            System.out.println("The sum is " + (num1 + num2));
            System.out.println("If you want to continue, press yes, if not, press anything");
            answer = SCANNER.nextLine();
        } while (answer.trim().toLowerCase().contains("yes"));
    }
}
