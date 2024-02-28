package edu01.homework;

import java.util.Scanner;

public class  CalculateFlowerBed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        System.out.print ("Enter the radius of the circul flower bed: ");
        double radius = scanner.nextDouble();


        double perimeter = 2 *  Math.PI * radius;
      //  double PI = 3.14;
        double area = Math.PI *  Math.pow(radius,2);

        System.out.println("Perimeter of the circul flower bed: " + perimeter);
        System.out.println("Area of the circul flower bed: " + area);
        scanner.close();
    }
}


