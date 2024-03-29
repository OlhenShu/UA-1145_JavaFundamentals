import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        System.out.println("Enter the current season:");
        for (Season season : Season.values()) {
            System.out.println(season.ordinal() + 1 + ". " + season.getName());
        }
        int seasonIndex = scanner.nextInt();
        Season currentSeason = Season.values()[seasonIndex - 1];

        Faculty faculty = new Faculty(numberOfStudents, currentSeason);

        System.out.println("Faculty created with:");
        System.out.println("Number of students: " + faculty.getNumberOfStudents());
        System.out.println("Current season: " + faculty.getCurrentSeason().getName());

        scanner.close();
    }
}