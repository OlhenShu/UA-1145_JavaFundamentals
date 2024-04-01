package src.edu04.Task4;

import java.util.Scanner;

enum currentSeason {
    SUMMER("Summer", "The vacation period"),
    AUTUMN("Autumn", "1st semester"),
    WINTER("Winter", "Exam period"),
    SPRING("Spring", "2nd semester");

    final String meaning;
    final String name;

    currentSeason(String name, String meaning) {
        this.meaning = meaning;
        this.name = name;
    }

    static String getSeason(String season) {
        season = season.toLowerCase();
        return switch (season) {
            case "summer" -> SUMMER.meaning;
            case "autumn" -> AUTUMN.meaning;
            case "winter" -> WINTER.meaning;
            case "spring" -> SPRING.meaning;

            default -> throw new IllegalStateException("Unexpected value: " + season);
        };
    }
}

public class Faculty {
    public static void main(String[] args) {
        System.out.println("Please write a number of students and season: ");
        Scanner studentInfo = new Scanner(System.in);
        int numOfStudents = studentInfo.nextInt();
        studentInfo.nextLine();
        String season = studentInfo.nextLine();

        System.out.println("In " + season + "(" + currentSeason.getSeason(season) + ")" +
                "in faculty study this number of student " + numOfStudents);

    }


}
