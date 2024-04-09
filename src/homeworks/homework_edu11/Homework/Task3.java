package homeworks.homework_edu11.Homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter text which containing US currency formats:");
        String text1 = SCANNER.nextLine();

        String formatText = "\\$\\d+(\\.\\d{2})?";
        Pattern pattern = Pattern.compile(formatText);
        Matcher matcher = pattern.matcher(text1);

        System.out.println("Occurrences of US currency format:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
