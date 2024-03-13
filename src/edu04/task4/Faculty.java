package edu04.task4;

import java.util.Scanner;


// Не впевнена чи добре зрозуміла цю таску, не чіткі вимоги і я не зовсім вловила що потрібно виводити
enum Season {
    WINTER("Winter"),
    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn");

    private final String name;

    Season(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Faculty {
    private int numberOfStudents;
    private Season currentSeason;

    public Faculty(int numberOfStudents, Season currentSeason) {
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public Season getCurrentSeason() {
        return currentSeason;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int numberOfStudents = scanner.nextInt();

        System.out.println("Choose the current season:");
        System.out.println("1. Winter");
        System.out.println("2. Spring");
        System.out.println("3. Summer");
        System.out.println("4. Autumn");
        int seasonChoice = scanner.nextInt();

        Season currentSeason;
        switch (seasonChoice) {
            case 1:
                currentSeason = Season.WINTER;
                break;
            case 2:
                currentSeason = Season.SPRING;
                break;
            case 3:
                currentSeason = Season.SUMMER;
                break;
            case 4:
                currentSeason = Season.AUTUMN;
                break;
            default:
                System.out.println("Invalid choice, setting current season to Winter.");
                currentSeason = Season.WINTER;
                break;
        }

        Faculty faculty = new Faculty(numberOfStudents, currentSeason);
        System.out.println("Faculty information:");
        System.out.println("Number of students: " + faculty.getNumberOfStudents());
        System.out.println("Current season: " + faculty.getCurrentSeason().getName());

        scanner.close();
    }
}
