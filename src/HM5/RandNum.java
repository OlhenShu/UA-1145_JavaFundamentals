package HM5;

import java.util.Random;
import java.util.Scanner;

public class RandNum {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sr = new Scanner(System.in);
        int randomNumber = random.nextInt(100);
        do {
            System.out.println("Include your num: ");
            int yourNum = sr.nextInt();
            if (yourNum < randomNumber) {
                System.out.println("Too low, try again.");
            } else if (yourNum > randomNumber) {
                System.out.println("Too high, try again");
            } else {
                System.out.println("Congratulations!!! You guessed the number " + yourNum);
                break;
            }
        } while (true);
    }
}
