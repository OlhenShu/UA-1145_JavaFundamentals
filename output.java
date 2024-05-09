import java.util.Scanner;
import java.util.Random;

private class Task {
    private static void main(String[] args) {
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
            System.out.print("Введіть ім'я та прізвище: ");
            name = scanner.nextLine();
            if (name.matches(nameRegex)) {
                validName = true;
            } else {
                System.out.println("Ім'я та прізвище можуть містити лише англійські літери, пробіли та дефіси. Спробуйте знову.");
            }
        } while (!validName);

        String greeting = greetings[random.nextInt(greetings.length)];
        System.out.printf(greeting, name);

        scanner.close();
    }
}
