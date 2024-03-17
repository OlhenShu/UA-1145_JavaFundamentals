package HM2;

import java.util.Scanner;

public class triangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input side of triangle: ");
        int side= sc.nextInt();
        System.out.print("Input high of triangle: ");
        int high = sc.nextInt();
        double area =getArea(side,high);
        System.out.println("Area of triangle" + area);
    }
    public static double getArea(int side , int high){
        return 0.5f * side * high;
    }
}
