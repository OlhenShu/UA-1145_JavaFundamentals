package edu11.task2;

import java.util.Scanner;

import static java.lang.System.in;

public class Task2 {
    public static void main(String[] args) {
        Scanner SCANNER = new Scanner(in);
        System.out.println("Enter your sentence with a lot of spaces");
        String str = SCANNER.nextLine();
//        String str = "I    am    learning     Java    Fundamental";
        var rStr = str.replaceAll("\\s+", " ");
        System.out.println("Here is your sentence without additional spaces: " + rStr);
        SCANNER.close();
    }
}
