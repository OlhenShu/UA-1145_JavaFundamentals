package edu04;

import java.util.Scanner;

public class PracticalTask02 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of a day of a week");
        int dayNumber = SCANNER.nextInt();
        DayOfWeek dayOfWeek = DayOfWeek.getByNumber(dayNumber);
        System.out.println("This number corresponds to " + dayOfWeek.englishName);
        System.out.println("Цей номер відповідає дню: " + dayOfWeek.ukrainianName);
    }
}

enum DayOfWeek {
    MONDAY("Monday", "Понеділок"),
    TUESDAY("Tuesday", "Вівторок");

    public final String englishName;
    public final String ukrainianName;

    DayOfWeek(String englishName, String ukrainianName) {
        this.englishName = englishName;
        this.ukrainianName = ukrainianName;
    }

    public static DayOfWeek getByNumber(int number) {
        return switch (number) {
            case 1 -> MONDAY;
            case 2 -> TUESDAY;
            default -> throw new IllegalArgumentException(
                    "There is no such day number in a week: " + number);
        };
    }
}
