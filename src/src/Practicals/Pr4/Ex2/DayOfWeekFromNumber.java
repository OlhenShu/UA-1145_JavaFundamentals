package Practicals.Pr4.Ex2;

import java.util.Scanner;

public class DayOfWeekFromNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number: ");
        int number = scanner.nextInt();

        switch (number){
            case 1 -> System.out.println("The day of week number " + number + " is " + DayOfWeek.MONDAY.getEn() + "\\" + DayOfWeek.MONDAY.getUa());
            case 2 -> System.out.println("The day of week number " + number + " is " + DayOfWeek.TUESDAY.getEn() + "\\" + DayOfWeek.THURSDAY.getUa());
            case 3 -> System.out.println("The day of week number " + number + " is " + DayOfWeek.WEDNESDAY.getEn() + "\\" + DayOfWeek.WEDNESDAY.getUa());
            case 4 -> System.out.println("The day of week number " + number + " is " + DayOfWeek.THURSDAY.getEn() + "\\" + DayOfWeek.THURSDAY.getUa());
            case 5 -> System.out.println("The day of week number " + number + " is " + DayOfWeek.FRIDAY.getEn() + "\\" + DayOfWeek.FRIDAY.getUa());
            case 6 -> System.out.println("The day of week number " + number + " is " + DayOfWeek.SATURDAY.getEn() + "\\" + DayOfWeek.SATURDAY.getUa());
            case 7 -> System.out.println("The day of week number " + number + " is " + DayOfWeek.SUNDAY.getEn() + "\\" + DayOfWeek.SUNDAY.getUa());
            default -> System.out.println("Wrong number!");
        };
        scanner.close();
    }
}
