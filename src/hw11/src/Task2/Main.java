package Task2;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.println("Enter the sentence with consecutive spaces: ");
        String string = scanner.nextLine();
        System.out.println("Sentence with consecutive spaces: " + "''" + string + "''");
        String result = string.replaceAll("\\s+", " ");
        System.out.println("Sentence with a single spaces: " + "''" + result + "''");
    }
}
