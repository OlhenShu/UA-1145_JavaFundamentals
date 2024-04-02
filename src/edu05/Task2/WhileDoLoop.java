package src.edu05.Task2;

import java.util.Scanner;

public class WhileDoLoop {
    public static void main(String[] args) {
        String answer;
        do {
            System.out.print("Please write 1st number: ");
            Scanner scanner = new Scanner(System.in);
            float num1 = scanner.nextFloat();
            System.out.print("Please write 2nd number: ");
            float num2 = scanner.nextFloat();
            System.out.println("Their product is: " + (num1 * num2));

            System.out.print("Do you want to repeat: ");
            scanner.nextLine();
            answer = scanner.nextLine();
        } while (answer.equalsIgnoreCase("yes"));
    }

}
