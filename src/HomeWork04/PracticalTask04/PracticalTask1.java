package HomeWork04.PracticalTask04;

import java.util.Scanner;

import static java.lang.System.in;

public class PracticalTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();
        int count = 0;

        if (number1 % 2 != 0) {
            count++;
        }
        if (number2 % 2 != 0) {
            count++;
        }
        if (number3 % 2 != 0) {
            count++;
        }
        System.out.println("There are a total of odd numbers: " + count);
    }
}
