package HM3;

import java.util.Scanner;

public class Faculty {
    private int numOfStudents;
    private Season thisSeason;

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public Season getThisSeason() {
        return thisSeason;
    }

    public void setThisSeason(Season thisSeason) {
        this.thisSeason = thisSeason;
    }

    enum Season {
        SUMMER("HOLIDAY"),
        AUTUMN("THE FIRST SEMESTR"),
        WINTER("THE WINTER SESSION"),
        SPRING("THE LAST SEMESTR");
        public final String semestr;

        Season(String semester) {
            this.semestr = semester;
        }

    }
}

class Shedule {
    public static void main(String[] args) {
        Faculty faculty = new Faculty();
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter number of student: ");
        faculty.setNumOfStudents(sr.nextInt());
        System.out.println("Enter season: ");
        String personSeason;
        personSeason = sr.next();
        Faculty.Season season = Faculty.Season.valueOf(personSeason.toUpperCase());
        faculty.setThisSeason(season);
        System.out.println("The number of students in this group are " + faculty.getNumOfStudents());
        System.out.println("The current season is " + season + " you have " + faculty.getThisSeason().semestr);
    }
}




