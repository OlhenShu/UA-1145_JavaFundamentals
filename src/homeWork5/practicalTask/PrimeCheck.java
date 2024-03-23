package homeWork5.practicalTask;

import java.util.Scanner;

public class PrimeCheck {

    private static final Scanner scanner = new Scanner(System.in);

    private boolean isPrime(double num) {
        if (num < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public void isTheNumberPrime(Scanner scanner) {
        System.out.println("Please enter the number ->>");
        if (isPrime(scanner.nextDouble())) {
            System.out.println("The number is prime!");
        } else {
            System.out.println("The number is not prime!");
        }
    }
}

class RunPrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrimeCheck primeCheck = new PrimeCheck();
        primeCheck.isTheNumberPrime(sc);
    }
}
