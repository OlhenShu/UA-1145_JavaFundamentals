package Homework_11;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // 1. Іnput a sentence that contains words separated by more than one space on the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a sentence that contains words separated by more than one space:");
        String string = scanner.nextLine();

        // 2. Replace all consecutive spaces with a single space
        System.out.println(string.replaceAll("\\s+", " ").strip());

    }
}
