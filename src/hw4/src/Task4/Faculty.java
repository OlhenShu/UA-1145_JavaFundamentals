package Task4;
import java.util.Locale;

import static Task4.Main.SCANNER;
public class Faculty {
    private static int numberOfStudents;
    private static String season;
    public static int numberOfStudentsInput() {
        System.out.println("Enter the number of student in the faculty: ");
        numberOfStudents = SCANNER.nextInt();
        if(numberOfStudents < 0) {
            throw new IllegalArgumentException("There can`t be amount below 0");
        }
        return numberOfStudents;
    }

    public static String seasonInput() {
        System.out.println("Enter the season: ");
        season = SCANNER.nextLine().toLowerCase(Locale.ROOT);
        return switch (season) {
            case "winter" -> Season.WINTER.name + ". It`s time for " + Season.WINTER.period;
            case "autumn" -> Season.AUTUMN.name + ". It`s time for " + Season.AUTUMN.period;
            case "spring" -> Season.SPRING.name + ". It`s time for " + Season.SPRING.period;
            case "summer" -> Season.SUMMER.name + ". It`s time for " + Season.SUMMER.period;
            default -> throw new IllegalArgumentException("Unknown season: " + season);
        };
    }

    public static void taskOutput() {
        String seasonOutput = seasonInput();
        int numberOutput = numberOfStudentsInput();
        if(numberOutput == 1) {
            System.out.println("There is " + numberOutput + " student on faculty. And now is a " + seasonOutput);
        } else {
            System.out.println("There are " + numberOutput + " students on faculty. And now is a " + seasonOutput);
        }
    }

}
