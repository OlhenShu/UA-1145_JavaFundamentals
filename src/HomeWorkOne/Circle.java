package HomeWorkOne;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть радіус кола: ");
        int radius = scanner.nextInt();
        double Perimeter = 2 * 3.14 * radius;
        double area = 3.14 * Math.pow(radius, 2);
        System.out.println("Периметр кола: " + Perimeter);
        System.out.println("Площа кола: " + area);
    }
}
