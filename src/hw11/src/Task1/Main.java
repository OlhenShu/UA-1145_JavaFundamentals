package Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sentence = Sentence.input();
        System.out.println("The longest word is " + "''" + Sentence.displayTheLongestWord(sentence) + "''");
        System.out.println("Number of letters in the longest word is " + Sentence.numberOfLettersInLongestWord(sentence));
        System.out.println("Our second word in reversed order is " + "''" + Sentence.reversedSecondWord(sentence) + "''");
    }
}
