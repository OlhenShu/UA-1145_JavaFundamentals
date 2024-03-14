package HomeWorks.HW4.Ex4;

import java.util.Locale;
import java.util.Scanner;

public class Faculty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of students: ");
        int numberOfStudents = scanner.nextInt();

        System.out.print("Input the current season: ");

        String temp = scanner.next();
        String currentSeason = temp.toUpperCase(Locale.ROOT);

        try {
            Season season = Season.valueOf(currentSeason);

            Season.findSemester(season);
        }
        catch (Exception exception){
            System.out.println("Can not find such season :(");
        }



    }
}