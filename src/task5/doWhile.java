package task4;

import java.util.Scanner;

public class doWhile {
    private static final Scanner SCANNER = new Scanner(System.in);
    static int sum;
    static int inputCount = 0;
    static void sumTwoNumber(){
        do {
            System.out.println("Enter the number: ");
            sum = sum + Integer.parseInt(SCANNER.nextLine());
            inputCount++;
        } while (inputCount < 2);
        System.out.println("The sum of two numbers is: " + sum);
    }
    static void promptUser() {
        do {
            sum = 0;
            inputCount = 0;
            sumTwoNumber();
            System.out.println("Would you like to calculate the sum?");
        } while(SCANNER.nextLine().equals("Yes"));
    }

    public static void main(String[] args) {
        promptUser();
    }
}
