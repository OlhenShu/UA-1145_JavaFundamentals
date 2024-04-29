package HomeWork11;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String firstName = validateName(scanner, "Enter your first name: ");

        String lastName = validateName(scanner, "Enter your last name: ");

        String greeting = generateGreeting(firstName, lastName);
        System.out.println(greeting);

        scanner.close();
    }

    private static String validateName(Scanner scanner, String prompt) {
        String name;
        boolean isValid;
        do {
            System.out.print(prompt);
            name = scanner.nextLine();

            String regex = "^[A-Za-z -]+$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(name);
            isValid = matcher.matches();

            if (!isValid) {
                System.out.println("Invalid input! Please enter only English letters, spaces, and hyphens.");
            }
        } while (!isValid);

        return name;
    }

    private static String generateGreeting(String firstName, String lastName) {
        String[] greetings = {
                "Hello, " + firstName + " " + lastName + "!",
                "Welcome, " + firstName + "!",
                "Nice to see you, " + firstName + "!",
                "Greetings, " + firstName + "!"
        };

        Random random = new Random();
        int index = random.nextInt(greetings.length);
        return greetings[index];
    }
}
