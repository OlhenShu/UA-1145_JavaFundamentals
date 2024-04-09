package homeworks.homework_edu11.Homework;

import java.util.Scanner;

public class Task2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a sentence: ");
        String sentence = SCANNER.nextLine();

        String res = sentence.replaceAll("\\s+", " ");
        System.out.println("Result: " + res );
    }
}
