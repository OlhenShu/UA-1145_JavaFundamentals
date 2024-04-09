package homeworks.homework_edu11.Practical;

import java.util.Scanner;

public class PrTask1 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input first string: ");
        String str1 = SCANNER.nextLine();

        System.out.println("Input second string: ");
        String str2 = SCANNER.nextLine();

        boolean isContain = str2.contains(str1);
        System.out.println(isContain);

    }
}
