package HomeWork04.PracticalTask04;

import java.util.Scanner;

import static java.lang.System.in;


public class PracticalTask2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.println("Enter the number of day (1-7): ");
        int numberOfWeek = scanner.nextInt();
        DaysOfWeek daysOfWeek = DaysOfWeek.getByNumber(numberOfWeek);
        System.out.println("This number corresponds to " + daysOfWeek.EN);
        System.out.println("Цей номер відповідає цьому дню: " + daysOfWeek.UA);
    }
}

enum DaysOfWeek {
    MONDAY("Понеділок", "Monday"),
    TUESDAY("Вівторок", "Tuesday"),
    WEDNESDAY("Середа", "Wednesday"),
    THURSDAY("Четвер", "THURSDAY"),
    FRIDAY("Пятниця", "Friday"),
    SATURDAY("Субота", "Saturday"),
    SUNDAY("Неділя", "Sunday");

    public final String UA;
    public final String EN;

    DaysOfWeek(String UA, String EN) {
        this.UA = UA;
        this.EN = EN;
    }

    public static DaysOfWeek getByNumber(int number) {
        return switch (number) {
            case 1 -> MONDAY;
            case 2 -> TUESDAY;
            case 3 -> WEDNESDAY;
            case 4 -> THURSDAY;
            case 5 -> FRIDAY;
            case 6 -> SATURDAY;
            case 7 -> SUNDAY;
            default -> throw new IllegalStateException("This number is not suitable " + number);
        };
    }
}



