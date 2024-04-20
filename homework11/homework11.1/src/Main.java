import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence of five words:");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        String longestWord = "";
        int longestLength = 0;
        for (String word : words) {
            if (word.length() > longestLength) {
                longestWord = word;
                longestLength = word.length();
            }
        }

        System.out.println("Longest word: " + longestWord);
        System.out.println("Number of letters in the longest word: " + longestLength);

        if (words.length >= 2) {
            String secondWord = words[1];
            StringBuilder reversedSecondWord = new StringBuilder(secondWord).reverse();
            System.out.println("Second word in reverse order: " + reversedSecondWord.toString());
        } else {
            System.out.println("Not enough words in the sentence to display the second word in reverse order.");
        }

        scanner.close();
    }
}
