package homeworks.homework_edu11.Practical;

import java.util.Scanner;

public class PrTask2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the first name: ");
        String firstName = SCANNER.nextLine();

        System.out.println("Enter the last name: ");
        String lastName = SCANNER.nextLine();

        System.out.println("Enter the middle name:");
        String middleName = SCANNER.nextLine();

        String initial1 = firstName.substring(0, 1);
        String initial2 = middleName.substring(0, 1);
        String initials = initial1.concat(". " + initial2 + ".");

        System.out.println(lastName.concat(" " + initials));


    }
}
