package Task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Sentence {

    //input 5 words from console
    public static ArrayList<String> input() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>(5);

        for (int i = 0; i < 5; i++) {
            boolean validInput = false;
            while (!validInput) {
                System.out.println("Enter " + (i + 1) + " word: ");
                String string = scanner.nextLine().trim(); // to remove empty words in sentence
                if (string.isEmpty()) {
                    System.out.println("Please, enter a word (not just a space)");
                } else if (string.contains(" ")) {
                    System.out.println("Please, enter only one word without spaces");
                } else {
                    input.add(string);
                    validInput = true;
                }
            }
        }
        return input;
    }

    // identify the longest word in the sentence and display it on the console
    public static String displayTheLongestWord(ArrayList<String> sentence) {
        String longestWord = sentence.get(0);
        for(int i = 0; i < sentence.size(); i++) {
            if(longestWord.length() < sentence.get(i).length()) {
                longestWord = sentence.get(i);
            }
        }
        return longestWord;
    }

    // determine the number of letters in the longest word
    public static int numberOfLettersInLongestWord(ArrayList<String> sentence) {
        String longestWord = displayTheLongestWord(sentence);
        int number = longestWord.length();
        return number;
    }

   // display the second word of the sentence in reverse order on the console
    public static String reversedSecondWord(ArrayList<String> sentence) {
        String secondWord = sentence.get(1);
        return new StringBuilder(secondWord).reverse().toString();
    }
}