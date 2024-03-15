package Task2;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 0;
        boolean key = true;
        Scanner scanner = new Scanner(in);

        do {
            System.out.println("Enter two numbers to calculate their sum");
            System.out.println("Please, enter first number");
            number1 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Please, enter second number");
            number2 = scanner.nextInt();
            scanner.nextLine();
            int sum = number1 + number2;
            System.out.println("Sum of the two given numbers is equal " + sum);
            System.out.println("");
            System.out.println("Do you want to perform the operation again? Enter yes or no");
            String answer = scanner.nextLine();

            switch (answer.toLowerCase()) {
                case "yes":
                    break;
                case "no":
                    System.out.println("Good luck!");
                    key = false;
                    break;
                default:
                    System.out.println("Unknown answer. Please enter yes or no");
                    key = false;
            }
        } while (key);
    }
}
