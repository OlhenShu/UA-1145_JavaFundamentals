package homeWork11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    private String inputSentence(Scanner sc) {
        System.out.println("Please enter a sentence of five words => ");
        return sc.nextLine();
    }

    void sentenceOperations(Scanner sc) {
        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(inputSentence(sc));

        String longestWord = "";
        String secondWordReverse = "";
        int maxLength = 0;
        int wordCount = 0;

        while (matcher.find()) {
            String word = matcher.group();
            wordCount++;

            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }

            if (wordCount == 2) {
                secondWordReverse = new StringBuilder(word).reverse().toString();
            }
        }

        System.out.println("The longest word is: " + longestWord);
        System.out.println("The longest word contains " + maxLength + " letters.");
        System.out.println(" The second word in reverse order is: " + secondWordReverse);
    }
}

class RunTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task1 task1 = new Task1();
        task1.sentenceOperations(scanner);
    }
}
