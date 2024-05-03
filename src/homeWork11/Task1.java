package homeWork11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    private String inputSentence(Scanner sc) {
        System.out.println("Please enter a sentence of five words => ");
        return sc.nextLine();
    }

    //It would be better to split this method into several smaller methods.
    void sentenceOperations(Scanner sc) {
        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(inputSentence(sc));

        String longestWord = "";
        String secondWordReverse = "";
        int maxLength = 0;
        int wordCount = 0;
//The assignment specifies that the sentence must contain exactly five words,
// but your code does not check if the entered sentence meets this requirement.
// This can lead to incorrect behavior or erroneous results if the user enters fewer or more words.
//        while (wordCount < 5 && matcher.find()) {
//            // ...
//        }
//        if (wordCount != 5) {
//            System.out.println("Error: Please enter exactly five words.");
//            return;
//        }
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
