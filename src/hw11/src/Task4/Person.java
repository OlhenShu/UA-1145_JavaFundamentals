package Task4;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class Person {
    private static String firstName;
    private static String lastName;
    private static String regex = "^[a-zA-Z\\s\\-]+";
    public static String input() {
        Scanner scanner = new Scanner(in);
        do {
            System.out.println("Enter your first name: ");
            firstName = scanner.nextLine();
            if(!firstName.matches(regex)) {
                System.out.println("Invalid input of first name. Please enter only English letters, spaces, and hyphens.\"");
            }
        } while (!firstName.matches(regex));
        do {
            System.out.println("Enter your last name: ");
            lastName = scanner.nextLine();
            if(!lastName.matches(regex)) {
                System.out.println("Invalid input of last name. Please enter only English letters, spaces, and hyphens.\"");
            }
        } while (!lastName.matches(regex));
        return firstName + " " + lastName;
    }

    public static String randomGreeting() {
        Random random = new Random();
        String[] greeting = new String[]{
                "Hi, %s! Nice to see you in my program!",
                "Hello, %s! Hope you are doing well!",
                "Hi, %s! Welcome to my program!",
                "Hi, %s! Have a good day!"
        };
        int randomIndex = random.nextInt(greeting.length);
        return greeting[randomIndex];
    }
}
