package edu11.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please input text containing US currency format:");
        String text = in.nextLine();

        String currencyRegex = "\\$\\d+(\\.\\d{2})?";

        Pattern pattern = Pattern.compile(currencyRegex);

        Matcher matcher = pattern.matcher(text);

        System.out.println("Found US currency formats in the input text:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        in.close();
    }
}

// Example of the input data: "I bought a book for $15.99 and a coffee for $3.50."