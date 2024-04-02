package homeWork11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

    private String inputSentence(Scanner sc) {
        System.out.println("Please enter a sentence of five words separated by more than one space => ");
        return sc.nextLine();
    }

    void replaceConsecutiveSpaces(Scanner sc) {
        String sentence = inputSentence(sc);
        sentence = sentence.replaceAll("\\s+", " ");
        System.out.println(sentence);
    }
}

class RunTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task2 task2 = new Task2();
        task2.replaceConsecutiveSpaces(scanner);
    }
}
