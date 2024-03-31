package edu04.Hometask04;

import java.util.Scanner;

public class Task01 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        float number1 = SCANNER.nextFloat();
        float number2 = SCANNER.nextFloat();
        float number3 = SCANNER.nextFloat();

        int count = 0;
        if ((-5 <= number1) && (number1 <= 5)) count++;
        if ((-5 <= number2) && (number2 <= 5)) count++;
        if ((-5 <= number3) && (number3 <= 5)) count++;
        if (count == 3) {
            System.out.println("All three numbers are in the range [-5, 5].");
        } else {
            System.out.println("Some of the numbers is out of the range [-5, 5], please double check.");
        }
    }
}
