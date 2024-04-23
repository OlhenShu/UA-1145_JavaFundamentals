package HM11.part1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Include sentences: ");
        String sentence = sr.nextLine();
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Longest word: " + longestWord);
        System.out.println("Number of letters: " + longestWord.length());
        if (words.length >= 2) {
            String secondWord = words[1];
            StringBuilder secondWordReserved = new StringBuilder(secondWord);
            secondWordReserved.reverse();
            System.out.println("Second reserved word: " + secondWordReserved);
        } else {
            System.out.println("We don't have two words");
        }
    }
}
