package HomeWorks.HW5.Ex1;

import static HomeWorks.HW5.Ex1.Interface.scanner;

public class MonthsAndDays {
    public static void findMonth() {

        System.out.print("Input here the month number: ");
        scanner.nextLine();                                     //Це якась чорна магія! Без цього рядка не працює, але чому???
        String temp = scanner.nextLine();
        int monthNumber;


        if (temp.length() == 0) {
            System.out.println("Input string is empty!");
            return;
        }
        try {
            monthNumber = Integer.parseInt(temp);
        } catch (NumberFormatException exc) {
            System.out.println("Input string isn't a number!");
            return;
        }
        if (monthNumber <= 0 || monthNumber > 13) {
            System.out.println("Incorrect month number!");
            return;
        }

        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("Month #" + monthNumber + " has " + monthDays[monthNumber - 1] + " days!");


    }
}
