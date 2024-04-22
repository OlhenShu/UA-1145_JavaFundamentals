package edu11.Task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write your sentence or text: ");
        String myStr = scanner.nextLine();
        Pattern p = Pattern.compile("\\$\\d+\\.\\d{2}");
        Matcher matcher = p.matcher(myStr);

        while (matcher.find()) {
            System.out.println("Matches that was find in text: " + matcher.group());
        }


    }
}
