package task3;

import java.util.Scanner;

public class Faculty {
    private static final Scanner SCANNER = new Scanner(System.in);

    public enum Seasons {
        WINTER, SPRING, SUMMER, AUTUMN
    }

    public static void main(String[] args) {
        System.out.println("Input number of students:");
        int studentsNumber = Integer.parseInt(SCANNER.nextLine());
        System.out.println("The number of students: " + studentsNumber + " and the current season: " + Seasons.AUTUMN);
    }
}


//current season (using enum). Each season must have a name in English (use the constructor). In the main() method,
//check the correctness of the code.  In the
//context of this task, it can correspond to a certain semester. For example, autumn could be the first semester, spring -
//        the second, and summer - the vacation period. Winter may correspond to the period of winter exams.
