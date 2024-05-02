package HomeWorks.HW11.Ex4;

import java.util.Random;
import java.util.Scanner;

public class RunnerCorrectName {

    public static final Scanner SCANNER = new Scanner(System.in);
    public static String[] greetings = {"Hello", "Hi", "Aloha", "Good morning", "Shalom"};

    public static void main(String[] args) {

        System.out.println("Please, input your first name");
        String firstName = inputAndCheckName();

        System.out.println("Please, input your last name");
        String lastName = inputAndCheckName();

        printGreeting(firstName, lastName);
    }

    public static void printGreeting(String name, String surname) {
        Random random = new Random();
        int i = random.nextInt(greetings.length);

        System.out.printf(greetings[i] + ", my dear %s %s!%n", name, surname);

        // System.out.printf("%s, my dear %s %s!%n", greetings[i], name, surname);
    }

    public static String inputAndCheckName() {
        //  String pattern = "^[A-Z][a-z]+(?:[-'\\s][A-Z][a-z]+)*$";  // Improved pattern for name validation
        //Optionally, names can include a hyphen, apostrophe, or space followed by another capitalized segment,
        // useful for names like "Jean-Luc", "O'Reilly", or "Anna Maria".
        String pattern = "(^[A-z- ]+$)";//your pattern is partial correct
        boolean is_correctInput = false;
        String name = "";
        while (!is_correctInput) {
            System.out.print("Type your name: ");
            name = SCANNER.nextLine();
            if (name.matches(pattern)) {
                is_correctInput = true;
            } else {
                System.out.println("Incorrect input!");
                //better
                //System.out.println("Incorrect input! Please ensure your name starts with a capital letter and only contains letters, spaces, or hyphens.");
            }
        }
        return name;
    }
}
