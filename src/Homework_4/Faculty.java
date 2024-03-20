package Homework_4;

// Task 4

import java.util.Scanner;

public class Faculty {
    private int studentsNumber;
    private Seasons season;

    public Faculty(int studentsNumber, Seasons season) {
        this.studentsNumber = studentsNumber;
        this.season = season;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the number of students: ");
        int studentsNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Choose and input the season: Spring, Summer, Autumn, Winter");
        String inputSeason = scanner.nextLine();

        Seasons currentSeason = null;

        switch (inputSeason) {
            case "Spring":
                currentSeason = Seasons.SPRING;
                break;
            case "Summer":
                currentSeason = Seasons.SUMMER;
                break;
            case "Autumn":
                currentSeason = Seasons.AUTUMN;
                break;
            case "Winter":
                currentSeason = Seasons.WINTER;
                break;
            default:
                System.out.println("There is no such season: " + inputSeason);
                return;
        }

        Faculty faculty = new Faculty(studentsNumber, currentSeason);

        System.out.println("The number of students in Faculty is: " + faculty.studentsNumber
                            + ". \nThe season is: " + faculty.season);

    }
}
