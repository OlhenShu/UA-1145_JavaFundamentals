package edu11.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введіть текст, що містить формат валюти США:");
        String text = in.nextLine();

        String currencyRegex = "\\$\\d+(\\.\\d{2})?";

        Pattern pattern = Pattern.compile(currencyRegex);

        Matcher matcher = pattern.matcher(text);

        System.out.println("Що є у введеному тексті:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        in.close();
    }
}
