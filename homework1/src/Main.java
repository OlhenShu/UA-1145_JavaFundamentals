import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть радіус кола для обрахунку площі та периметра(ціле число)");
        int r = scanner.nextInt();
        double S = r * r * 3.14; // Try to use Math.PI instead of 3.14 and Math.pow instead of r * r
        // double S = Math.PI * Math.pow(r, 2);
        double P = 2 * 3.14 * r;
        System.out.println("результати обрахунків є наступні:");
        System.out.print("Площа = " + S + " периметр = " + P);
        scanner.close();// It is not necessary to close the scanner
    }
}
/*
Variable names should be informative and reflect their purpose. For example, S and P could be replaced with area and perimeter; r should be replaced with radius.
Variable names should start with a lowercase letter.
The class Main is a standard name, but for clarity, you might consider a more descriptive name like CircleCalculator.
It’s recommended to use English for console commands as it’s the programming standard and facilitates better code portability.
* */