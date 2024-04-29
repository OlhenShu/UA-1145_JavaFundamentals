package HomeWork11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String regex = "\\$\\d+\\.\\d{2}";
        Pattern pattern = Pattern.compile(regex);

        System.out.println("Input text containing US currency format:");
        String inputText = scanner.nextLine();

        Matcher matcher = pattern.matcher(inputText);

        System.out.println("Occurrences of US currency format:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        scanner.close();
    }
}

