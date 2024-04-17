package edu13.task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static boolean isValidDate(String date) {
        String pattern = "^(0[1-9]|1[0-2])\\.(0[1-9]|[12][0-9]|3[01])\\.\\d{2}$";

        Pattern regexPattern = Pattern.compile(pattern);

        Matcher matcher = regexPattern.matcher(date);

        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Enter the date in the format \"mm.dd.yy\": ");
            String date = in.nextLine();
            isValid = isValidDate(date);
            System.out.println("Date validation result (true/false): " + isValidDate(date));

            if (!isValid) {
                System.out.println("Invalid date format. Please try again.");
            }
        }

        in.close();
    }
}