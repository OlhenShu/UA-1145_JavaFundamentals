package HW4;

import java.util.Scanner;

enum Season {
    WINTER("Winter exams"),
    SPRING("Second semester"),
    SUMMER("Summer vacation"),
    AUTUMN("First semester");

    private final String name;

    Season(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Faculty {
    private final int numberOfStudents;
    private final Season currentSeason;

    public Faculty(int numberOfStudents, Season currentSeason) {
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;
    }

    public void displayInfo() {
        System.out.println("Faculty Information:");
        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("Current Season: " + currentSeason.getName());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        // Input current season
        System.out.println("Enter the current season:");
        for (Season season : Season.values()) {
            System.out.println(season.ordinal() + 1 + ". " + season.name().toLowerCase());
        }
        System.out.print("Input the season name: ");
        String seasonChoice = scanner.next().toLowerCase();
        System.out.println("For " + numberOfStudents + " students " + "- " + Season.valueOf(seasonChoice.toUpperCase()).getName());

        scanner.close();
    }
}