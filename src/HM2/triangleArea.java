package HM2;

import java.util.Scanner;

public class triangleArea {//TriangleArea

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input side of triangle: ");
        int side = sc.nextInt();//better variable name base
        System.out.print("Input high of triangle: ");
        int high = sc.nextInt();//better variable name height
        double area = getArea(side, high);
        System.out.println("Area of the triangle: " + area);
    }

    public static double getArea(int side, int high) {
        return 0.5f * side * high;//why do you use float?
    }
//    public static double calculateArea(int base, int height) {
//        return 0.5 * base * height;
//    }
}
