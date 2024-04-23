package HM11.part2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter a sentences with 2 and more spaces: ");
        String sentence = sr.nextLine();
        String formattingSentences = sentence.replaceAll("\\s+", " ");
        System.out.println("Cleaned sentence: " + formattingSentences);
    }
}
