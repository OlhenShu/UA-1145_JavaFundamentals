package practical_tasks.pt4.days_of_week;

import java.util.Scanner;

public class DaysOfWeekMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of week day(1 - 7): ");
        int dayOfWeekNumber = scanner.nextInt();
        System.out.println("Day of week ENG: " + DaysOfWeek.values()[dayOfWeekNumber - 1].getDayOfWeekOnEng());
        System.out.println("Day of week UKR: " + DaysOfWeek.values()[dayOfWeekNumber - 1].getDayOfWeekOnUkr());
    }
}
