package homework_edu04.Practical04;

import java.util.Scanner;

public class PrTask2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of the day of the week: ");
        int dayNumber = SCANNER.nextInt();
        DayOfWeek dayOfWeek = DayOfWeek.getByNumber(dayNumber);
        System.out.println("The specified number corresponds to this day of the week: " + dayOfWeek.englishName);
        System.out.println("Заданий номер відповідає такому дню тижня: " + dayOfWeek.ukrainianName);
    }
}
enum DayOfWeek {
    MONDAY("Monday", "Понеділок"),
    TUESDAY("Tuesday","Вівторок"),
    WEDNESDAY("Wednesday","Середа"),
    THURSDAY("Thursday","Четвер"),
    FRIDAY("Friday","П'ятниця"),
    SATURDAY("Saturday","Субота"),
    SUNDAY("Sunday","Неділя");

    public final String englishName;
    public final String ukrainianName;

    DayOfWeek(String englishName, String ukrainianName) {
        this.englishName = englishName;
        this.ukrainianName = ukrainianName;
    }

    public static DayOfWeek getByNumber (int number){
        return switch (number) {
            case 1 -> MONDAY;
            case 2 -> TUESDAY;
            case 3 -> WEDNESDAY;
            case 4 -> THURSDAY;
            case 5 -> FRIDAY;
            case 6 -> SATURDAY;
            case 7 -> SUNDAY;
            default -> throw new IllegalArgumentException(
                    "There is no such day of the week for the given number: "+ number);
        };
    }
}
