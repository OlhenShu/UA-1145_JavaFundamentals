package HW1;

import java.util.Scanner;

public class HW_1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" What is a radius of flower bed in cm?");
        double radius = scanner.nextDouble();

        double perimeter = 2 * radius * Math.PI;
        double area = Math.pow(radius, 2) * Math.PI;

        System.out.printf("The perimeter of flower bed is %.2f cm and the area is %.2f cm2.", perimeter, area);
    }
}