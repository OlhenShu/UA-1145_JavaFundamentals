package Homework_11;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Regular expression pattern to validate names
        Pattern namePattern = Pattern.compile("[A-Za-z\\s-]+");

        String[] greetingMessages = {
                "Hello, %s! Nice to meet you.",
                "Hi there, %s! Welcome!",
                "Greetings, %s! How are you today?"
        };

        String firstName;
        String lastName;

        // Validate and input first name
        do {
            System.out.print("Enter your first name: ");
            firstName = scanner.nextLine();
        } while (!namePattern.matcher(firstName).matches());

        // Validate and input last name
        do {
            System.out.print("Enter your last name: ");
            lastName = scanner.nextLine();
        } while (!namePattern.matcher(lastName).matches());

        // Generate the random greeting message
        String greeting = greetingMessages[random.nextInt(greetingMessages.length)];
        System.out.printf(greeting + "%n", firstName + " " + lastName);
    }
}
