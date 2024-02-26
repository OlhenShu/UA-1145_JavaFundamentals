package edu01;

import java.util.Scanner;

public class HomeworkEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String customName = scanner.nextLine();
        System.out.println("Where do you live, " + customName + "?");
        String customAddress = scanner.nextLine();
        System.out.println("So your name is " + customName + " and your place of living is " + customAddress);

        scanner.close();
    }
}
