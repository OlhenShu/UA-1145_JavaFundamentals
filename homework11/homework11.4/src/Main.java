import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] phrases = {
                "Hello, %s! Welcome.",
                "Nice to meet you, %s!",
                "Greetings, %s! How can I assist you?",
                "Hey there, %s! Ready to get started?"
        };

        String firstName, lastName;
        boolean validInput = false;

        do {
            System.out.println("Enter your first name (English letters, spaces, hyphens only):");
            firstName = scanner.nextLine().trim();
            if (isValidName(firstName)) {
                validInput = true;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        } while (!validInput);

        validInput = false;

        do {
            System.out.println("Enter your last name (English letters, spaces, hyphens only):");
            lastName = scanner.nextLine().trim();
            if (isValidName(lastName)) {
                validInput = true;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        } while (!validInput);

        String randomPhrase = phrases[random.nextInt(phrases.length)];
        String greetingMessage = String.format(randomPhrase, firstName + " " + lastName);
        System.out.println(greetingMessage);

        scanner.close();
    }

    private static boolean isValidName(String name) {
        return name.matches("[a-zA-Z\\s-]+");
    }
}
