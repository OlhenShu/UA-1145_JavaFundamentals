package edu04.Practical;

import java.util.Scanner;

public class PrTask2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the number of the day of the week");
        int dayNumber = SCANNER.nextInt();
        DayOfWeek dayOfWeek = DayOfWeek.getByNumber(dayNumber);
        System.out.println("This day corresponds to " + dayOfWeek.engListName);
        System.out.println("Цей день  відповідає дню " + dayOfWeek.ukrainianListName);
    }
}

enum DayOfWeek {
    MONDAY("Monday", "понеділок"),
    TUESDAY("Tuesday", "вівторок"),
    WEDNESDAY("Wednesday", "середа"),
    THURSDAY("Thursday", "четвер"),
    FRIDAY("Friday", "п'ятниця"),
    SATURDAY("Saturday", "субота"),
    SUNDAY("Sunday", "неділя");

    public final String engListName;
    public final String ukrainianListName;

    DayOfWeek(String engListName, String ukrainianListName) {
        this.engListName = engListName;
        this.ukrainianListName = ukrainianListName;
    }
    public static DayOfWeek getByNumber(int number) {
        return switch (number) {
            case 1 -> MONDAY;
            case 2 -> TUESDAY;
            case 3 -> WEDNESDAY;
            case 4 -> THURSDAY;
            case 5 -> FRIDAY;
            case 6 -> SATURDAY;
            case 7 -> SUNDAY;
            default -> null;
        };
    }
}