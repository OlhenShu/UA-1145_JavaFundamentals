package homework.hw5;

import java.util.Random;
import java.util.Scanner;

public class TheHigherLowerGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = new Random().nextInt(1, 20);
        System.out.println("Let`s play \"The Higher Lower Game\"");
        int flagNumber;

        do {
            flagNumber = scanner.nextInt();
            if (flagNumber < randomNumber) {
                System.out.println("Higher");
            } else if (flagNumber > randomNumber){
                System.out.println("Lower");
            } else {
                System.out.println("You win");
            }
        } while (flagNumber != randomNumber);
    }
}
