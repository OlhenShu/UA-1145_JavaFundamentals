package edu05.Hometask;

import java.util.Random;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner SCANNER = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = 0;
        Random rnd = new Random();
        int random = rnd.nextInt(0, 100);
        do {
            number = SCANNER.nextInt();
            if (number > random) {
                System.out.println("Too height, try again!");
            }else if (number < random) {
                System.out.println("Too low, try again!");
            } else {
                System.out.println("Wow, it's awesome! You guess the number!");
            }

        }
        while (number != random);
    }
}
