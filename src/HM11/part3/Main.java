package HM11.part3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String inputText = sr.nextLine();
        Pattern pattern = Pattern.compile("\\$\\d+(\\.\\d{2})?");
        Matcher matcher = pattern.matcher(inputText);
        System.out.println("Occurrences of US currency format");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
