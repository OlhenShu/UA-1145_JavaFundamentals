package Homework_11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        // 1. Implementation of a pattern to match US currency format
        String pattern = "\\$\\d+\\.\\d{2}";
        Pattern p = Pattern.compile(pattern);

        // 2. Input text containing US currency format
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text containing US currency format: ");
        String inputText = scanner.nextLine();

        // 3. Match the pattern in the input text
        Matcher m = p.matcher(inputText);

        // 4. Display all occurrences of US currency format
        System.out.println("Occurrences of US currency format:");
        while (m.find()) {
            System.out.println(inputText.substring(m.start(), m.end()));
        }
    }
}
