package task4;

import java.util.Scanner;
public class EnterAMonth {
    private static final Scanner SCANNER = new Scanner(System.in);
//    String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    static int[] monthArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        System.out.println("Please, enter the month number: ");
        int userInput = Integer.parseInt(SCANNER.nextLine()) - 1;
        System.out.println("the number of days is:" + monthArray[userInput]);
    }
}
