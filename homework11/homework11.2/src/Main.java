import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence with words separated by more than one space:");
        String sentence = scanner.nextLine();

        String cleanedSentence = sentence.replaceAll("\\s+", " ");

        System.out.println("Result: " + cleanedSentence);

        scanner.close();
    }
}
