package edu11.task03;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class CurrencyCheck {
    private static final Scanner SCANNER = new Scanner(in);

    public static void main(String[] args) {

        System.out.print("Enter a text containing US currency: ");
        String text = SCANNER.nextLine();

        String pattern = "\\$\\d+(\\.\\d{2})?";//another pattern can be "\\b\\$\\d+(\\.\\d{2})?\\b"
        //If you want to ensure that the currency symbol and the amount are not part of larger numbers or strings (e.g., avoid matching $100 in abc$100def)

        Pattern currencyPattern = Pattern.compile(pattern);
        Matcher matcher = currencyPattern.matcher(text);
        if (matcher.find()) {
            System.out.println("Occurrences of US currency format:");
        }
        matcher.reset();//The call to matcher.reset() right after matcher.find() might be redundant.

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
