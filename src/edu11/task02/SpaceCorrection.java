package edu11.task02;

import java.util.Scanner;

import static java.lang.System.in;

public class SpaceCorrection {    private static final Scanner SCANNER = new Scanner(in);

    public static void main(String[] args) {
        System.out.print("Enter your sentence: ");
        String sentence = SCANNER.nextLine();

        String[] words = sentence.trim().split("\\s+");
        StringBuilder correctedSentence = new StringBuilder();

        for (String word : words) {
            correctedSentence.append(word + " ");

        }
        System.out.println("Your sentence, optimized: " + correctedSentence);

    }
}
