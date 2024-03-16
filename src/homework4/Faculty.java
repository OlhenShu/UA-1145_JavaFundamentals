package homework4;

import java.util.Scanner;

public class Faculty {
    static public final Scanner SCANNER = new Scanner(System.in);
    public enum Season{
        WINTER("Зимовий семестр","Зимові екзамени"),
        SUMMER("Літній семестр","Літні екзамени"),
        AUTUMN("Осінній семестр","Осінні екзамени"),
        SPRING("Весняний семестр","Весняні екзамени");

        public final String semester;
        public final String exams;

        Season(String semester, String exams) {
            this.semester = semester;
            this.exams = exams;
        }
        public static int setNumberOfStudents(){
            System.out.println("Введіть кількість студентів: ");
            int numberOfStudents = SCANNER.nextInt();
            SCANNER.nextLine();
            return numberOfStudents;
        }
        public static Season setSemester(){
            System.out.println("Введіть пору року: ");
            String semester = SCANNER.nextLine().toLowerCase();
            return switch (semester){
                case "зима" -> Season.WINTER;
                case "літо" -> Season.SUMMER;
                case "осінь" -> Season.AUTUMN;
                case "весна" -> Season.SPRING;
                default -> throw new IllegalArgumentException("Такої пори року не існує");
            };
        }
        public static void infoAboutStudentsAndSemester(){
            int infoStudents = setNumberOfStudents();
            String semester = setSemester().semester;
            System.out.println("Кількість студентів: "+infoStudents+"\nСьогоднішній семестр: "+semester);
        }
    }
}
