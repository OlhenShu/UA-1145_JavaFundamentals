package homeworks.homework1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.println("Input radius of flower bed: ");
        double radius = scann.nextDouble();

        double perimeter = 2 * 3.14 * radius;//Use Math.PI instead of 3.14
        double area = 3.14 * radius * radius;

        System.out.println("Perimeter of flower bed is: " + perimeter);
        System.out.println("Area of flower bed is: " + area);

        scann.close();//close scanner to avoid resource leak
    }
}
