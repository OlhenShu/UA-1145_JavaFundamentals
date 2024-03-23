package homeWork5.homeWork;

import java.util.Scanner;

public class Month {
    private static final int[][] monthDays = {
            {1, 31}, // January
            {2, 28}, // February
            {3, 31}, // March
            {4, 30}, // April
            {5, 31}, // May
            {6, 30}, // June
            {7, 31}, // July
            {8, 31}, // August
            {9, 30}, // September
            {10, 31}, // October
            {11, 30}, // November
            {12, 31}  // December
    };

    void getNumberOFDays(Scanner scanner) {
        int numberOfDays = 0;
        boolean found = false;
        System.out.println("Please enter the number of the month ->> ");
        int monthNumber = scanner.nextInt();
        for (int i = 0; i < monthDays.length; i++) {
            if (monthDays[i][0] == monthNumber) {
                numberOfDays = monthDays[i][1];
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The month number " + monthNumber + " contains " + numberOfDays + " days.");
        } else {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }
    }
    // added this one for Tests!!!!
    int  getNumberOFDays() {
        int numberOfDays = 0;
        boolean found = false;
        int monthNumber = 5;
        for (int[] monthDay : monthDays) {
            if (monthDay[0] == monthNumber) {
                numberOfDays = monthDay[1];
                found = true;
                break;
            }
        }
        return numberOfDays;
    }

}

class RunMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Month month = new Month();
        month.getNumberOFDays(sc);
    }
}
