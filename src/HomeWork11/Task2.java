package HomeWork11;

import java.util.Scanner;

import static java.lang.System.in;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String cleanedSentence = sentence.replaceAll("\\s+", " ");

        System.out.println("Sentence change: " + cleanedSentence);

        scanner.close();
    }
}
