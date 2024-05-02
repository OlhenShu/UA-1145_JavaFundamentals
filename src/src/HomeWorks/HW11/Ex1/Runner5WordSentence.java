package HomeWorks.HW11.Ex1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Runner5WordSentence {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String sent = scanner.nextLine();
        //StringTokenizer is part of the legacy collection since JDK 1.0.
        //It is recommended to use split() in new code unless there are specific reasons to prefer StringTokenizer.
        StringTokenizer stringTokenizer = new StringTokenizer(sent);

        String longestWord = findLongestWord(stringTokenizer);
        System.out.println("The longest word is " + longestWord);

        int numbOfLetters = longestWord.length();

        System.out.println("The longest word consist of " + numbOfLetters + " letters.");

        int numbWord = 2;
        String secondWord = findNthWord(sent, numbWord);
        System.out.println("This is reversed word #" + numbWord + " from the initial sentence: " + reversWord(secondWord));
    }

    public static String findNthWord(String sentence, int n) {
        String[] temp = sentence.split(" ");
        return temp[n - 1];

    }
//         Додатковий рабочий метод
//    public static String reversWord(String word) {
//        char[] charList = word.toCharArray();
//        char[] finalList = new char[charList.length];
//
//        int j = 0;
//
//        for (int i = charList.length - 1; i >= 0; --i) {
//            finalList[j] = charList[i];
//            j++;
//        }
//        return new String(finalList);
//    }
//Your reversWord method using StringBuilder is efficient and concise.Good idea!
    public static String reversWord(String word) {
        return String.valueOf(new StringBuilder(word).reverse());
    }


    public static String findLongestWord(StringTokenizer stringTokenizer) {

        int maxLength = 0;
        String longestWord = "";

        while (stringTokenizer.hasMoreTokens()) {
            String temp = stringTokenizer.nextToken();
            int tempLength = temp.length();
            if (tempLength > maxLength) {
                maxLength = tempLength;
                longestWord = temp;
            }
        }
        return longestWord;
    }
}
//When dealing with spaces, especially multiple consecutive spaces,
// split() is more predictable because it handles them explicitly based on the regex provided.
//For example, split(" ") will treat consecutive spaces as separate delimiters, resulting in empty strings for each space.