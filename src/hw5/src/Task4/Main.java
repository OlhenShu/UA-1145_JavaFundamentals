package Task4;

import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello! It`s a game, where you need to guess a number in range from 0 to 9! Good luck!");
        int number = Program.generateRandomNumber();
        Program.findNumber(number);
    }
}
