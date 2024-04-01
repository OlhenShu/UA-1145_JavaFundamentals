package hm4;

import java.util.Scanner;

public class Students {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введіть кількість студентів");
        int numberOfStudent = sc.nextInt();
        System.out.println("Введіть пору року (Літо-1, Осень-2, Зима-3, Весна-4)");
        int numberOfSeason = sc.nextInt();
        CurrentSeason currentSeason = CurrentSeason.getSeason(numberOfSeason);
        Faculty faculty = new Faculty(numberOfStudent, currentSeason.Semester);

        System.out.println("Пора року: " + currentSeason.Season +
                ", семестр: " + currentSeason.Semester +
                ", кількість студентів: " + numberOfStudent);

        System.out.println("Кількість студентів: " + faculty.getNumberOfStudent() +
                ", семестр: " + faculty.getCurrentSeason());
    }
}

class Faculty {
    private int NumberOfStudents;
    private String CurrentSeason;

    public Faculty(int NumberOfStudents, String CurrentSeason) {
        this.NumberOfStudents = NumberOfStudents;
        this.CurrentSeason = CurrentSeason;
    }

    public int getNumberOfStudent() {
        return NumberOfStudents;
    }

    public String getCurrentSeason() {
        return CurrentSeason;
    }
}
enum CurrentSeason {
    SUMMER("Summer", "Vocation period"),
    AUTUMN("Autumn", "First semester"),
    WINTER("Winter", "Period of winter exam"),
    SPRING("Spring", "Second semester");

    public String Season;
    public String Semester;
    CurrentSeason(String Season, String Semester) {
        this.Season = Season;
        this.Semester = Semester;
    }

    public static CurrentSeason getSeason (int season) {
        return switch (season) {
            case 1 -> SUMMER;
            case 2 -> AUTUMN;
            case 3 -> WINTER;
            case 4 -> SPRING;
            default -> throw new IllegalStateException("Це не пора року: " + season);
        };
    }
}
