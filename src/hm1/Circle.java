package hm1;

import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Radius:");
        double r = scanner.nextDouble();

        double perimeter = ( 2 * r * PI );
        double area = ( PI * pow(r,2));

        System.out.println("Perimeter:" + perimeter);
        System.out.println("Area:" + area);
        scanner.close();
    }
}
