package edu11.task4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] greetings = {
                "Hello, %s!",
                "Hi there, %s!",
                "Good morning, %s!",
                "Hey, %s!",
                "Greetings, %s"
        };

        String nameRegex = "^[a-zA-Z\\s\\-]+$";

        String name;
        boolean validName = false;
        do {
            System.out.print("Enter your first and last name: ");
            name = scanner.nextLine();
            if (name.matches(nameRegex)) {
                validName = true;
            } else {
                System.out.println("First and last names may only contain English letters, spaces, and hyphens. Please try again.");
            }
        } while (!validName);

        String greeting = greetings[random.nextInt(greetings.length)];
        System.out.printf(greeting, name);

        scanner.close();
    }
}

// Example of the invalid test data: "John-Дмитро123 Smith"
//Example of valid test data: "Alice-Smith Johnson"