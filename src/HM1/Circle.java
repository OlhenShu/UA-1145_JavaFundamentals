package HM1;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        int radius;
        System.out.println("Введіть радіус: ");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextInt();
        float Pi = 3.14f;
        float areaCircle =  Pi * radius * radius;
        float lengthCircle = 2 * Pi * radius;
        System.out.println("Довжина кола: " + lengthCircle);
        System.out.println("Площа кола: " + areaCircle);
    }
}
