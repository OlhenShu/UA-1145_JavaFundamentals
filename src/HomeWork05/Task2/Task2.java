package HomeWork05.Task2;

import java.util.Scanner;

import static java.lang.System.in;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String choice;
        do {
            System.out.print("Enter the first number: ");
            double number1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double number2 = scanner.nextDouble();
            double sum = number1 + number2;
            System.out.println("Sum: " + sum);
            System.out.print("Do you want to perform the operation again? (yes/no): ");
            choice = scanner.next();
            scanner.nextLine();
        } while (choice.equalsIgnoreCase("yes"));
    }
}
