package homeworks.homework_edu11.Homework;

import java.util.Scanner;

public class Task1 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a sentence of five words: ");
        String sentence = SCANNER.nextLine();
        String[] words = sentence.split(" ");

        if (words.length != 5) {
            System.out.println("The sentence does not contain 5 words ");
            return;
        }

        String theLongestWord = "";
        for (String word : words) {
            if (word.length() >= theLongestWord.length()) {
                theLongestWord = word;
            }
        }
        System.out.println("The longest word is: " + theLongestWord);

        System.out.println("The number of letters in the longest word: " + theLongestWord.length());

        String secondWordInRevers = new StringBuilder(words[1]).reverse().toString();
        System.out.println("The second word of the sentence in reverse: " + secondWordInRevers);


    }
}
