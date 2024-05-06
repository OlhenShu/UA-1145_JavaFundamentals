package edu11.task04;

import java.util.Scanner;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class NameValidator {
    private static final Scanner SCANNER = new Scanner(in);

    public static void main(String[] args) {
        Pattern namePattern = Pattern.compile("[a-zA-Z\\s-]+");//"^[\\p{L}]+([ '-][\\p{L}]+)*\\s+[\\p{L}]+([ '-][\\p{L}]+)*$" if u check Unicode
//another
        //"^[a-zA-Z]+([ '-][a-zA-Z]+)*\\s+[a-zA-Z]+([ '-][a-zA-Z]+)*$"
        String firstName;
        String lastName;
        do {
            System.out.print("Enter your first name: ");
            firstName = SCANNER.nextLine();
        } while (!namePattern.matcher(firstName).matches());

        do {
            System.out.print("Enter your last name: ");
            lastName = SCANNER.nextLine();
        } while (!namePattern.matcher(lastName).matches());

        String[] greetings = {
                "Hello, %s! Nice to meet you.",
                "Hi there, %s! Welcome.",
                "Greetings, %s! How can I assist you?"
        };
        String randomGreeting = greetings[(int) (Math.random() * greetings.length)];
        System.out.printf(randomGreeting, firstName + " " + lastName);
    }
}
