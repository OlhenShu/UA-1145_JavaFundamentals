package task1;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task1 {
    public static void areaCalc(double side1, double side2, double side3) {

        double p = (side1 + side2 + side3) / 2;
        double area = sqrt (p * (p - side1) * (p - side2) * (p - side3));

        System.out.printf("Площа трикутника = %.2f", area);

    }

    public static void main(String[] arg) {
        Scanner sideScan = new Scanner(System.in);

        System.out.print("Введіть довжину сторін: ");
        double side1 = sideScan.nextDouble();
        double side2 = sideScan.nextDouble();
        double side3 = sideScan.nextDouble();

        areaCalc(side1, side2, side3);
    }
}
