package homework_edu04.homework;

import java.util.Scanner;

public class homeworkTask4 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input number of students: ");
        int numberOfStudents = SCANNER.nextInt();
        if (numberOfStudents <= 0) {
            System.out.println("Number of students must be positive.");
            return; // Exit the program if the number of students is not positive.
        }

        System.out.println("Select the current season (1 - Winter, 2 - Spring, 3 - Summer, 4 - Autumn): ");
        int seasonNumber = SCANNER.nextInt();

        currentSeason seasons = currentSeason.getByNumber(seasonNumber);

        System.out.println("Number of students is: " + numberOfStudents);
        System.out.println("Current season is: " + seasons.seasonName);
        System.out.println("Corresponding semester is: " + seasons.correspondToSemester);

        // Create an instance of Faculty and set the values
        Faculty faculty = new Faculty(numberOfStudents, seasons.seasonName);

        // Access the values from the Faculty instance
        System.out.println("Faculty information - Number of students: " + faculty.getNumberOfStudents() +
                ", Current season: " + faculty.getCurrentSeason());
    }
}

class Faculty {
    private final int numberOfStudents;
    private final String currentSeason;


    public Faculty(int numberOfStudents, String currentSeason) {
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;
    }


    public int getNumberOfStudents() {
        return numberOfStudents;
    }


    public String getCurrentSeason() {
        return currentSeason;
    }
}

enum currentSeason {
    WINTER("Winter", "Winter session period"),
    SPRING("Spring", "Second (spring) semester"),
    SUMMER("Summer", "Summer vacation period"),
    AUTUMN("Autumn", "First (autumn) semester");

    public final String seasonName;
    public final String correspondToSemester;

    currentSeason(String seasonName, String correspondToSemester) {
        this.seasonName = seasonName;
        this.correspondToSemester = correspondToSemester;
    }

    public static currentSeason getByNumber(int number) {
        return switch (number) {
            case 1 -> WINTER;
            case 2 -> SPRING;
            case 3 -> SUMMER;
            case 4 -> AUTUMN;
            default -> throw new IllegalArgumentException("ERROR");
        };
    }
}



