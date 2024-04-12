package Practicals.Pr11.Ex2;

import java.util.Locale;
import java.util.Scanner;

public class RunnerNames {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, input your LAST name");
        String lastName = scanner.next();
        System.out.println("Please, input your FIRST name");
        String firstName = scanner.next();
        System.out.println("Please, input your MIDDLE name");
        String middleName = scanner.next();

        System.out.println(lastName + " " + firstName.toUpperCase(Locale.ROOT).charAt(0) + "." + middleName.toUpperCase(Locale.ROOT).charAt(0) + ".");
        System.out.println(firstName);
        System.out.println(firstName + " " + middleName + " " + lastName);


        scanner.close();
    }
}
