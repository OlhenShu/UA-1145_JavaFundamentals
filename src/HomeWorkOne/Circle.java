package HomeWorkOne;//package name must be in lowercase

import java.util.Scanner;

public class Circle {//class name better CircleCalculation
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть радіус кола: ");//better to use English
        int radius = scanner.nextInt();
        double Perimeter = 2 * 3.14 * radius;//better to use Math.PI, name of variable must be perimeter.
        // I mean that the name of variable must be lowercase
        double area = 3.14 * Math.pow(radius, 2);//better to use Math.PI
        System.out.println("Периметр кола: " + Perimeter);
        System.out.println("Площа кола: " + area);
    }
}
