package edu11.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please write your sentence: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str.replaceAll("\\s{2,}", " "));
    }
}
