package edu11.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введіть речення: ");
        String sentence = in.nextLine();

        String cleanedSentence = sentence.replaceAll("\\s+", " ");

        System.out.println("Речення після змін: " + cleanedSentence);

        in.close();
    }
}