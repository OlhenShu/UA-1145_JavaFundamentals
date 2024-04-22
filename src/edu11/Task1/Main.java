package edu11.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please write your sentence: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] sentenceArr = sentenceCleanUp(str).split(" ");
        String myLongestWord = longestWordFinder(sentenceArr);
        System.out.println("The longest word in sentence is " + myLongestWord + ". It's length is " + myLongestWord.length());
        System.out.println("Second word of reversed sentence is " + sentenceArr[sentenceArr.length - 2]);

    }

    public static String longestWordFinder(String[] arr) {
        String longestWord = arr[0];
        for (String word : arr) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }

        }
        return longestWord;
    }

    public static String sentenceCleanUp(String str) {
        var cleanSentence = str.replace(".", "").replace(",", "");

        return cleanSentence;
    }
}
