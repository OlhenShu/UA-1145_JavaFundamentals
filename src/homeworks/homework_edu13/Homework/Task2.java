package homeworks.homework_edu13.Homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the date (format \"mm.dd.yy\" ): ");
        String userDates = SCANNER.nextLine();

        if (validateDate(userDates)) {
            System.out.println("It is valid date format");
        } else {
            System.out.println("It is invalid date format");
        }
    }

    public static boolean validateDate(String data) {
        String regex = "^\\d{2}\\.\\d{2}\\.\\d{2}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);

        return matcher.matches();
    }
}
