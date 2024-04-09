package HomeWork05.Task4;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        Random random = new Random();
        int randomNumber = random.nextInt(0,100);
        System.out.println("Hello! Try to guess the number between 1 and 100: ");
        while(true){
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            if (randomNumber == guess){
                System.out.println("Congratulations! You guessed the correct number");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Too low, try again");
            }
            else{
                System.out.println("Too hight, try again");
            }
        }
    }
}
