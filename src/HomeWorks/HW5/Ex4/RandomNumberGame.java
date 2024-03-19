package HomeWorks.HW5.Ex4;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {
        Random randomNumb = new Random();

        int numberForGame = randomNumb.nextInt(200);
        Scanner scanner = new Scanner(System.in);

        int count = 1;

        System.out.println("Try to guess the number! The range of guessed numbers is from 0 to 200.");
        System.out.print("Input your answer: ");

        boolean is_guess = false;
        while (!is_guess){
            int temp = scanner.nextInt();
            if (temp > numberForGame){
                System.out.println("Too high, try again");
                count++;
            }else if (temp < numberForGame){
                System.out.println("Too low, try again");
                count++;
            }else {
                is_guess = true;
            }
        }
        System.out.println("YOU WIN!!!");
        System.out.println("You guessed right on the " + count + "th try.");
        scanner.close();
    }
}
