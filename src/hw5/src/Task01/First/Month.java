package Task01.First;

import static Task01.First.Main.SCANNER;

public class Month {
    private static int monthNumber;
    private static int year;

    public static int monthNumberInput() {
        System.out.println("Enter the number of month: ");
        monthNumber = SCANNER.nextInt();
        return monthNumber;
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0;
    }

    public static int dayAmountCalculate(int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (monthNumber < 1 || monthNumber > 12) {
            return -1;
        }
        if (isLeapYear(year) && monthNumber == 2) {
            return 29;
        }
        return daysInMonth[monthNumber - 1];
    }

    public static void dayAmountOutput() {
        int monthNumber = monthNumberInput();
        int dayAmount = dayAmountCalculate(year);
        if (dayAmount == 31) {
            System.out.println("In " + monthNumber + " month is " + dayAmount + " day");
        } else {
            System.out.println("In " + monthNumber + " month are " + dayAmount + " days");
        }
    }

    public static int getMonthNumber() {
        return monthNumber;
    }

    public static void setMonthNumber(int monthNumber) {
        Month.monthNumber = monthNumber;
    }

    public static int getYear() {
        return year;
    }

    public static void setYear(int year) {
        Month.year = year;
    }

}
