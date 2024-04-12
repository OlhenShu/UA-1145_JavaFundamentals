package HomeWorks.HW11.Ex1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Runner5WordSentence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sent = scanner.nextLine();

        StringTokenizer stringTokenizer = new StringTokenizer(sent);

        String longestWord = findLongestWord(stringTokenizer);
        System.out.println("The longest word is " + longestWord);

        int numbOfLetters = longestWord.length();

        System.out.println("The longest word consist of " + numbOfLetters + " letters.");

        int numbWord = 2;
        String secondWord = findNthWord(sent, numbWord);
        System.out.println("This is reversed word #" + numbWord + " from the initial sentence: " + reversWord(secondWord));


        scanner.close();
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
