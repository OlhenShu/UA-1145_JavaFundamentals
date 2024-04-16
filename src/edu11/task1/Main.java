package edu11.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Ввод предложения
        System.out.print("Enter a sentence: ");
        String sentence = in.nextLine();

        String[] words = sentence.split(" ");

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("The longest word in the sentence: " + longestWord);
        System.out.println("The number of letters in the longest word: " + longestWord.length());

        if (words.length >= 2) {
            StringBuilder secondWordReversed = new StringBuilder(words[1]);
            secondWordReversed.reverse();
            System.out.println("The second word reversed: " + secondWordReversed);
        } else {
            System.out.println("There are less than two words in the sentence.");
        }

        in.close();
    }
}