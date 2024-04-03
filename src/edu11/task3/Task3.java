package edu11.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text containing US currency format:");
        String inputText = scanner.nextLine();
        String currencyPattern = "\\$\\d+\\.\\d{2}";
        Pattern pattern = Pattern.compile(currencyPattern);
        Matcher matcher = pattern.matcher(inputText);
        System.out.println("Occurrences of US currency format:");
        if (matcher.find()) {
            System.out.println(matcher.group());
        } else {
            System.out.println("Nothing matches");
        }
        scanner.close();
    }
}