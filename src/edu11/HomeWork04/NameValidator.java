package edu11.HomeWork04;

import java.util.Scanner;
import java.util.regex.Pattern;

public class NameValidator {
    private static final Pattern pattern = Pattern.compile("^[a-zA-Z\\s-]+$");
    private static final String[] greetingPhrases = {
            "Hello, %s!",
            "Greetings, %s!",
            "Hi there, %s!",
            "What's up, %s?"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName;
        String lastName;

        do {
            System.out.print("Enter your first name: ");
            firstName = scanner.nextLine();
        } while (!isValidName(firstName));

        do {
            System.out.print("Enter your last name: ");
            lastName = scanner.nextLine();
        } while (!isValidName(lastName));

        // Generate and print random greeting
        String greeting = String.format(
                greetingPhrases[(int) (Math.random() * greetingPhrases.length)],
                firstName + " " + lastName
        );
        System.out.println(greeting);
    }

    private static boolean isValidName(String name) {
        if (pattern.matcher(name).matches()) {
            return true;
        } else {
            System.out.println("Invalid input. Name should only contain English letters, spaces, and hyphens.");
            return false;
        }
    }
}
