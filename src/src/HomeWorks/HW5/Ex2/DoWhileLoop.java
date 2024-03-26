package HomeWorks.HW5.Ex2;

import java.util.Scanner;

public class DoWhileLoop {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        boolean answer;

        do {
            Sum.sumOfTwoNumbs();
            answer = Question.question();
        } while (answer);

        System.out.println("It was a great job!");
    }
}
