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
    }

    public static String inputAndCheckName() {
        String pattern = "(^[A-z- ]+$)";
        boolean is_correctInput = false;
        String name = "";
        while (!is_correctInput) {
            System.out.print("Type your name: ");
            name = SCANNER.nextLine();
            if (name.matches(pattern)) {
                is_correctInput = true;
            } else {
                System.out.println("Incorrect input!");
            }
        }
        return name;
    }
}
