package edu11.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Ввод предложения
        System.out.print("Введіть речення: ");
        String sentence = in.nextLine();

        String[] words = sentence.split(" ");

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Найдовше слово у реченні: " + longestWord);
        System.out.println("Кількість літер у найдовшому слові: " + longestWord.length());

        if (words.length >= 2) {
            StringBuilder secondWordReversed = new StringBuilder(words[1]);
            secondWordReversed.reverse();
            System.out.println("Друге слово обернене: " + secondWordReversed);
        } else {
            System.out.println("У реченні менше двух слів.");
        }

        in.close();
    }
}