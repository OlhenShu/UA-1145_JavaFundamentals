package homework.hw4;

import java.util.Map;
import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        getMinAndMaxNumbers(a, b, c);
    }

    public static void getMinAndMaxNumbers(int a, int b, int c) {
        System.out.println("Min number: " + Math.min(a, Math.min(b, c)));
        System.out.println("Max number: " + Math.max(a, Math.max(b, c)));
    }
}
