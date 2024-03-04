package edu03;

import java.io.IOException;
import java.util.Scanner;

public class AreaOfTriangle {
    public static double calculateD(double Side1, double Side2, double Side3) {
        double p = (Side1 + Side2 + Side3) / 2;
        double S = Math.sqrt(p * (p - Side1) * (p - Side2) * (p - Side3));

        return S;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input length of 1 Side");
        double Side1 = scanner.nextDouble();
        System.out.println("Please input length of 2 Side");
        double Side2 = scanner.nextDouble();
        System.out.println("Please input length of 3 Side");
        double Side3 = scanner.nextDouble();

        System.out.println("The area of the triangle is " + calculateD(Side1, Side2, Side3));

        scanner.close();
    }
}

