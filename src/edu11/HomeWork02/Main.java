package edu11.HomeWork02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sentence with multiple spaces
        System.out.println("Enter a sentence with multiple spaces:");
        String sentence = scanner.nextLine();

        // Replace consecutive spaces with a single space
        String cleanedSentence = sentence.replaceAll("\\s+", " ");

        // Display the cleaned sentence
        System.out.println("Cleaned sentence: " + cleanedSentence);

        scanner.close();
    }
}
