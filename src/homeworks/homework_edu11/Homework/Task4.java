package homeworks.homework_edu11.Homework;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        FullName fullName = new FullName();
        do {
            System.out.print("Enter your first name: ");
            fullName.setFirstName(SCANNER.nextLine());
        } while (!FullName.correctName(fullName.getFirstName()));

        // Validate last name
        do {
            System.out.print("Enter your last name: ");
            fullName.setLastName(SCANNER.nextLine());
        } while (!FullName.correctName(fullName.getLastName()));


        String[] greetings = {
                "Nice to meet you %s!",
                "Dear, %s! Happy to see you again",
                "Hey, %s! how can I help you?",
                "Welcome, %s. Would you like to talk? "
        };
        Random random = new Random();
        int randomIndex = random.nextInt(greetings.length);
        String greeting = String.format(greetings[randomIndex], fullName.getFullName());

        System.out.println(greeting);
    }


    public static class FullName {
        private String firstName;
        private String lastName;

        public FullName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public FullName() {
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            if (correctName(firstName)) {
                this.firstName = firstName;
            } else {
                throw new IllegalArgumentException("First name can only contain English letters, spaces, and hyphens. Try again.");
            }
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            if (correctName(lastName)) {
                this.lastName = lastName;
            } else {
                throw new IllegalArgumentException("Last name can only contain English letters, spaces, and hyphens. Try again.");
            }
        }

        public static boolean correctName(String name) {
            String regex = "^[a-zA-Z\\s-]+$";
            return name.matches(regex);
        }


        public Object getFullName() {
            return getFirstName() + " " + getLastName();
        }
    }

}
