import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть радіус кола для обрахунку площі та периметра(ціле число)");
        int r = scanner.nextInt();
        double S = r * r * 3.14;
        double P = 2 * 3.14 * r;
        System.out.println("результати обрахунків є наступні:");
        System.out.print("Площа = " + S + " периметр = " + P);
    }
}