package edu05.Practical;

import java.util.Scanner;

import static java.lang.System.in;

public class PracticalTask02 {
    private static final Scanner SCANNER = new Scanner(in);

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int number = SCANNER.nextInt();
        if (isPrime(number)) {
            System.out.println("The number " + number + " is prime");
        } else {
            System.out.println("The number " + number + " is not prime");
        }
    }

    public static boolean isPrime(int number) {
        if (number == 1) return false;
        if (number < 0) number = -number;
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
