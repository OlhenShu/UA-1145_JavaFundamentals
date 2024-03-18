package Alt;

import java.util.Scanner;
import java.util.stream.IntStream;

import static java.lang.System.in;

public class PrimeNum {
    public static final Scanner SCANNER = new Scanner(in);

    public static boolean isPrime(int number) {
        return number > 1
                && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(n -> (number % n == 0));
    }

    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        System.out.println(isPrime(n));
        if (isPrime1(n)) {
            System.out.println("The number " + n + "is Prime");
        } else {
            System.out.println("The number " + n + "is not prime");

        }
        int i = 2;
        int j = 0;
        if (i * i <= n && j != 1) {
            if (n % i == 0) {
                j = 1;
            } else {
                i = i + 1;
            }

        } else {
            if (j == 1) {
                System.out.println("Составное числоа");
            } else {
                System.out.println("Ghjcnjnjt");
            }
        }
    }

    public static boolean isPrime1(int number) {
        if (number < 0) number = -number;
        if (number == 1) return false;
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) return false;

        }
        return true;

    }
}
