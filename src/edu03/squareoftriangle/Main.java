package edu03.squareoftriangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c;
        System.out.print("Input Side 1: ");
        Scanner in=new Scanner(System.in);
        a=in.nextDouble();
        System.out.print("Input Side 2: ");
        b=in.nextDouble();
        System.out.print("Input Side 3: ");
        c=in.nextDouble();
        in.close();

        Triangle triangle=new Triangle(a,b,c);
        System.out.print("The area of the triangle is " + triangle.getArea());
    }
}