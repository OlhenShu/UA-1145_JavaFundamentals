package homework.hw4.facultyAndSeason;

import java.util.Scanner;

public class FacultyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        Season.showAllSeasons();
        System.out.println("Select the number that corresponds to the desired season: ");
        int selectedSeason = scanner.nextInt();
        Faculty faculty = new Faculty(numberOfStudents, Season.values()[selectedSeason - 1].getSeason());
        System.out.println(faculty);
    }
}
