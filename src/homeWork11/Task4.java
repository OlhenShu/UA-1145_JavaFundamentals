package homeWork11;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

    private final Random random = new Random();
    private final int randomInt = random.nextInt(0,2);

    private final String[] greetings = {
            "Hello, %s!",
            "Hi, %s!",
            "Dobryi den, %s!"
    };

    void greetingOfUSer(Scanner sc) {
        String validNameTemplate = "^[a-zA-Z\\s\\-]+$";
        boolean isNameValid = false;
        String name = "";

        do {
            System.out.println("Please enter your first and last name => ");
            String enteredName = sc.nextLine();
            if (Pattern.matches(validNameTemplate, enteredName)) {
                name = enteredName;
                isNameValid = true;
            } else {
                System.out.println("Entered name is invalid, please use only English letters, spaces, and hyphens.");
            }


        }while (!isNameValid);

        System.out.printf(greetings[randomInt], name);
    }
}
class RunTask4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task4 task4 = new Task4();
        task4.greetingOfUSer(scanner);
    }
}
