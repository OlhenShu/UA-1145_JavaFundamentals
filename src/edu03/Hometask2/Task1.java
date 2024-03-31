package edu03.Hometask2;

import edu03.Example.Student;

import java.util.Scanner;



 class Task1 {
     public static void main(String[] args) {
         Task1.getAreaTriangle();

     }
    public static double getAreaTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the 1st side of triangle");
        int a = scanner.nextInt();
        System.out.println("Please enter the 2d side of triangle");
        int b = scanner.nextInt();
        System.out.println("Please enter the 3d side of triangle");
        int c = scanner.nextInt();
        double p = (a + b + c) /(double) 2; // half of perimeter
        double number = (p * (p - a) * (p - b) * (p - c)); // to simplify the formula
        System.out.println("The area of triangle is: %.2f".formatted(Math.pow(number, 0.5)));
        return Math.pow(number, 0.5);

    }
}
