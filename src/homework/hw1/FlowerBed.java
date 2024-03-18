package homework.hw1;

import java.util.Scanner;

public class FlowerBed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        calculateArea(radius);
        calculatePerimetr(radius);
        scanner.close();
    }

    private static void calculateArea (double radius) {
        double area = radius * radius * Math.PI;
        System.out.println("The area of the circle: " + area);
    }

    private static void calculatePerimetr (double radius) {
        double perimetr = 2 * Math.PI * radius;
        System.out.println("The perimetr of the circle: " + perimetr);
    }
}


