package edu04.Hometask04;


import java.util.Scanner;

public enum Season{
    SPRING("the 3d semester"),
    SUMMER("vacation"),
    AUTUMN("the 1st semester"),
    WINTER("the 2d semeter");

    public final String semester;

    public String getSemester() {
        return semester;
    }
    Season(String semester) {
        this.semester = semester;
    }

}
class Faculty{
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter the current season");
        String currentSeason = SCANNER.nextLine().toUpperCase();

        System.out.println("Please enter the amount of student");
        int numberOfStudent = SCANNER.nextInt();

        System.out.println("Now it is the " + currentSeason +
                " and all " + numberOfStudent + " students have a " +
                Season.valueOf(currentSeason).getSemester() + ".");
    }



}