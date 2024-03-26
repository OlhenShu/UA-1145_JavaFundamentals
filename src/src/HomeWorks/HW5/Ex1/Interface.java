package HomeWorks.HW5.Ex1;

import java.util.Scanner;

public class Interface {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hallo!");

        System.out.println("Do you want to know a number of days in a month?");
        boolean answer = Choose.makeAChoose();

        if (answer) {
            MonthsAndDays.findMonth();
        }

        System.out.println("Do you want to test your luck?");
        answer = Choose.makeAChoose();

        if (answer) {
            TenNumbers.generateTenNumbs();
        }

        System.out.println("Do you want to test your luck again?");
        answer = Choose.makeAChoose();

        if (answer) {
            FiveRandomNumbs.generateFiveNumbs();
        }
    }
}
