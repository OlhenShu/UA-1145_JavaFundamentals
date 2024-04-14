package Homework_11;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 5 words:");
        String string = scanner.nextLine();

        String[] words = string.split(" ");

        // 1. Identify the longest word in the sentence
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("The longest word in sentence is: " + longestWord);

        // 2. Determine the number of letters in the longest word
        System.out.println("The number of letters in the longest word: " + longestWord.length());

        // 3. Display the second word of the sentence in reverse order
        String secondWord = words[1];
        StringBuilder builder = new StringBuilder(secondWord);
        System.out.println("The second word of the sentence in reverse order: " + builder.reverse().toString());

        scanner.close();
    }
}
