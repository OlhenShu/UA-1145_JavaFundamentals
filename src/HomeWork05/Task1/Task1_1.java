package HomeWork05.Task1;

import java.util.Scanner;

import static java.lang.System.in;

public class Task1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int[] daysArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print("Enter the number of month: ");
        int monthNumber = scanner.nextInt();
        int days = 0;
        for (int i = 0; i < daysArray.length; i++) {
            if (i + 1 == monthNumber){
                days = daysArray[i];
                break;
            }
        }
        System.out.println("Number of days in a month: " + days);


    }
}
