package src.edu05.Task4;

import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {

        int randomNum = (int) (Math.random() * 101);

        Scanner scanner = new Scanner(System.in);


        boolean flag = false;
        while (!flag) {

            System.out.println("Please write your number: ");
            int guessNumber = scanner.nextInt();

            if (randomNum < guessNumber) {
                System.out.println("Too high, try again");
            }
            if (randomNum > guessNumber) {
                System.out.println("Too low, try again");
            }
            if (randomNum == guessNumber) {
                System.out.println("Hooray, you win");
                flag = true;
            }

        }

    }

}



