package edu11.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence of five words:");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        int numLetters = longestWord.length();

        System.out.println("Longest word: " + longestWord);
        System.out.println("Number of letters in the longest word: " + numLetters);

        if (words.length >= 2) {
            String secondWord = words[1];
            StringBuilder reversedSecondWord = new StringBuilder(secondWord).reverse();
            System.out.println("Second word in reverse order: " + reversedSecondWord);
        } else {
            System.out.println("There are not enough words in the sentence to display the second word.");
        }

        scanner.close();
    }
}
