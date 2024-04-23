package edu13.task01;

import java.util.Scanner;

import static java.lang.System.in;

public class WordsCheck {
    private static final Scanner SCANNER = new Scanner(in);

    public static void main(String[] args) {
        System.out.print("Enter a sentence with five words: ");
        String sentence = SCANNER.nextLine();


        String[] words =sentence.split("\\s");
        String longestWord = "";
        int maxLength = 0;

        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }
        System.out.println("Longest word is: " + longestWord);
        System.out.println("Number of letters in the longest word: " + maxLength);

        StringBuilder secondWord= new StringBuilder(words[1]);
        secondWord.reverse();

        System.out.println("Second word of the sentence, but reversed: "+secondWord);
    }
}
