package homeWork3;

import java.util.Scanner;

public class TriangleArea {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Triangle triangle = new Triangle();

        System.out.print("Input the length of side 1: ");
        double side1 = sc.nextDouble();
        triangle.setSide1(side1);

        System.out.print("Input the length of side 2: ");
        double side2 = sc.nextDouble();
        triangle.setSide2(side2);

        System.out.print("Input the length of side 3: ");
        double side3 = sc.nextDouble();
        triangle.setSide3(side3);

        System.out.println("Area of the triangle is: " + triangle.getArea());
    }

}

class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;//better naming half-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

}
//
//In such tasks, it would be beneficial to add a check to ensure that the side values are positive and not zero.
// From a mathematical standpoint,
// it would also be prudent to include a verification to ascertain whether a triangle can exist with the given side lengths.



