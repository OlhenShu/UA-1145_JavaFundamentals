package edu05.Practical;

import java.util.Scanner;

public class PrTask02 {
    public static void main(String[] args) {
        Scanner SCANNER = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = SCANNER.nextInt();
        if (isPrime(number)) {
            System.out.println("The number " + number + " is prime");
        } else {
            System.out.println("The number " + number + " is not prime");
        }
    }
    public static boolean isPrime(int number) {
        if (number < 0) number = -number;
        if (number == 1) return false;
        for (int i = 2; i <= number - 1; i++)
            if (number % i == 0) return false;
        return true;
    }

}
