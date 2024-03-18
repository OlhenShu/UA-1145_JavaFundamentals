package edu05.HomeWork04;


import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(in);

        Random random = new Random();
        //Генеруємо рандом намбер
        int numberToGuess = random.nextInt(100) + 1;

        int guess;

        System.out.println("Вгадайте число (між 1 та 100):");

        // Loop4eg
        do {
            guess = scan.nextInt();

            if (guess > numberToGuess) {
                System.out.println("Доволі багато, спробуй ще.");
            } else if (guess < numberToGuess) {
                System.out.println("Цього замало, спробуй ще.");
            } else {
                System.out.println("Оце діло! Рекомендую перевірити себе на присутність екстрасенсорних здібностей!");
            }
        } while (guess != numberToGuess);

        scan.close();
    }
}
