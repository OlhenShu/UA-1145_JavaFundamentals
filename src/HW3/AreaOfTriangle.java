package HW3;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input side 1 : ");
        int side1 = scanner.nextInt();
        System.out.print("Input side 2 : ");
        int side2 = scanner.nextInt();
        System.out.print("Input side 3 : ");
        int side3 = scanner.nextInt();
        scanner.close();

        System.out.printf("The area of the triangle is %.2f", calcAreaTriangle(side1, side2, side3));
    }

    public static double calcAreaTriangle(int side1,int side2, int side3) {
        double perimeter = side1 + side2 + side3;
        double area = Math.sqrt(perimeter) * (perimeter - side1) + (perimeter - side2) + (perimeter - side3);
        return area;
    }

}