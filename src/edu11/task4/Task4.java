package edu11.task4;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner SCANNER = new Scanner(System.in);
        Random random = new Random();

        String[] greetingPhrases = {
                "Hello, %s! Nice to meet you.",
                "Hi, %s! How are you doing?",
                "Hey, %s! Welcome!",
                "%s! Glad to see you here."
        };

        String firstName;
        do {
            System.out.print("Enter your first name: ");
            firstName = SCANNER.nextLine();
        } while (validName(firstName));

        String lastName;
        do {
            System.out.print("Enter your last name: ");
            lastName = SCANNER.nextLine();
        } while (validName(lastName));

        String greeting = greetingPhrases[random.nextInt(greetingPhrases.length)];
        System.out.printf(greeting + "%n", firstName + " " + lastName);
        SCANNER.close();
    }

    private static boolean validName(String name) {
        return !name.matches("[a-zA-Z\\s-]+");
    }
}
