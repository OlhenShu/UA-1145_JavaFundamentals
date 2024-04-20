package HM5;

import java.util.Scanner;

public class MonthDays {
    private static final int[][] daysInMonth = {
            //we write month from 01 to 12 , so the first rows about order of month from january to december
            {1, 31},
            {2, 28},
            {3, 31},
            {4, 30},
            {5, 31},
            {6, 30},
            {7, 31},
            {8, 31},
            {9, 30},
            {10, 31},
            {11, 30},
            {12, 31}
    };

    void getNumberOfDays() {
        Scanner sr = new Scanner(System.in);
        int numberOfTheDays = 0;
        System.out.print("Include number of month: ");
        int currentMonth = sr.nextInt();
        while (currentMonth < 1 || currentMonth > 12) {
            System.out.print("You  include uncorrect number of month , because we have 12 months " + "\n" + "try again: ");
            currentMonth = sr.nextInt();
        }
        for (int i = 0; i < daysInMonth.length; i++) {
            if (daysInMonth[i][0] == currentMonth) {
                numberOfTheDays = daysInMonth[i][1];
            }
        }
        System.out.println("The number of the month " + currentMonth + " include " + numberOfTheDays + " days");


    }
}


