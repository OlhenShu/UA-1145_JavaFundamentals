package HomeWork11;

import java.util.Scanner;

import static java.lang.System.in;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        System.out.print("Enter a sentence of five words: ");
        String sentence = scanner.nextLine().trim();

        String[] words = sentence.split(" ");

        if (words.length != 5) {
            System.out.println("Please enter a sentence containing exactly five words.");
            return;
        }

        String longestWord = findLongestWord(words);

        int longestLength = longestWord.length();

        System.out.println("Longest word: " + longestWord);
        System.out.println("Number of letters in the longest word: " + longestLength);

        if (words.length >= 2) {
            String secondWord = words[1];
            String reversedSecondWord = reverseString(secondWord);
            System.out.println("Second word reversed: " + reversedSecondWord);
        } else {
            System.out.println("The sentence does not contain a second word.");
        }

        scanner.close();
    }

    private static String findLongestWord(String[] words) {
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    private static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}


