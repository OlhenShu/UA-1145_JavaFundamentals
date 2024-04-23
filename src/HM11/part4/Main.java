package HM11.part4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        Random random = new Random();
        String[] greetings = {
                "Hello,%s!",
                "Hi there, %s!",
                "Good Morning, %s!",
                "Hey, %s!",
                "Greetings, %s!"
        };
        String nameRegex = "^[a-zA-Z\\s\\-]+$";
        String firstName;
        String lastName;
        boolean validName = false;
        do {
            System.out.print("Enter your first name: ");
            firstName = sr.nextLine();
            System.out.print("Enter your last name: ");
            lastName = sr.nextLine();
            if (firstName.matches(nameRegex) && lastName.matches(nameRegex)) {
                validName = true;
            } else {
                System.out.println("Your entered symbols aren't correct.Try again");
            }
        } while (!validName);
        String greeting = greetings[random.nextInt(greetings.length)];
        System.out.printf(greeting, lastName, firstName);
    }
}
