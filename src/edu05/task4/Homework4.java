package edu05.task4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

// Looks correct, but I've never received - "Wow, it's correct"
// and sometimes for 0 - "Too high, try again"
// What I can do to improve the code?


public class Homework4 {
    private static final Scanner SCANNER = new Scanner(in);

    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(0, 11); //11 will not be in a array
        }
        System.out.println(Arrays.toString(arr));

        while (true) {
            System.out.println("Input number (0-10) ant try to guess what will be the output");
            int inputNumber = SCANNER.nextInt();
            if (inputNumber == rnd.nextInt()) {
                System.out.println("Wow, it's correct");
            } else if (inputNumber < rnd.nextInt()) {
                System.out.println("Too low, try again");
            } else {
                System.out.println("Too high, try again");
            }
        }
    }

    // These methods were added for running tests
    public void promptUserInput() {
    }

    public int[] generateArray() {
        return new int[0];
    }

    public void userInput() {
    }
}
