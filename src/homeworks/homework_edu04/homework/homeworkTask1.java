package homework_edu04.homework;

import java.util.Scanner;

public class homeworkTask1 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input the first number: ");
        int number1 = SCANNER.nextInt();
        System.out.println("Input the second number: ");
        int number2 = SCANNER.nextInt();
        System.out.println("Input the third number: ");
        int number3 = SCANNER.nextInt();

        if (number1 >= -5 && number1 <= 5 &&
                number2 >= -5 && number2 <= 5 &&
                number3 >= -5 && number3 <= 5) {
            System.out.println("All three values are in range [-5; 5] ");
        }
        else {
            System.out.println("Not all values are in the range [-5; 5] ");
        }
    }

}

