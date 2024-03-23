package homeWork4;

import java.util.Scanner;

public class Faculty {
    private int numOfStudents;
    private Season currentSeason;

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public Season getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(Season currentSeason) {
        this.currentSeason = currentSeason;
    }

    enum Season {
        WINTER("Winter", "Exams semester"),
        SPRING("Spring", "Second semester"),
        SUMMER("Summer", "Vacation period"),
        AUTUMN("Autumn", "First semester");

        public final String engName;
        public final String semester;

        Season(String engName, String semester) {
            this.engName = engName;
            this.semester = semester;
        }
    }
}

class RunFaculty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Faculty faculty = new Faculty();

        System.out.println("Enter number of students ->> ");
        faculty.setNumOfStudents(sc.nextInt());

        System.out.println("Enter the current season (Winter, Spring, Summer, Autumn) ->> ");
        String seasonInput = sc.next().toUpperCase();
        Faculty.Season season = Faculty.Season.valueOf(seasonInput);
        faculty.setCurrentSeason(season);

        System.out.println("The number of students is ->>" + faculty.getNumOfStudents());
        System.out.println("The current season is ->> " + faculty.getCurrentSeason().engName +
                " and semester is " + faculty.getCurrentSeason().semester);
    }
}

