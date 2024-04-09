package homeworks.homework_edu11.Practical;

import java.util.Scanner;

public class PrTask3 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String regex = "^[a-zA-Z0-9_]{3,15}$";

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter username " + (i + 1) + ": ");
            String username = SCANNER.nextLine();

            if (username.matches(regex)) {
                System.out.println("Username is valid.");
            } else {
                System.out.println("Username is invalid.");
            }
        }

    }
   
}
