package homework_edu05.Practical05;

import java.util.Scanner;

public class PrTask2 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a positive integer :");
        int number = SCANNER.nextInt();
        if (isPrime(number)) {
            System.out.println("The number " + number + " is prime.");
        } else {
            System.out.println("The number " + number + " is not prime.");

        }
    }

    public static boolean isPrime(int number) {
        if (number <= 0) number = - number;
        if (number == 1) return false;
        for (int i = 2; i <= number - 1; i++) {
            if( number % i == 0) return false;
        }
        return true;
    }
}
