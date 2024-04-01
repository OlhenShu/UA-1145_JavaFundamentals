package practical_tasks.pt5;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(isPrime(number));
    }

    public static String isPrime(int number) {
        if (number <= 1) {
            return "Is not prime number";
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return "Is not prime number";
            }
        }
        return "Is a prime number";
    }
}
