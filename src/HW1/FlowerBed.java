package HW1;

import java.util.Scanner;

public class FlowerBed {
    public static void main(String[] args) {
        float radius;
        float perimeter;
        float area;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the radius of the flower bed:");
        radius = scanner.nextFloat();


        perimeter = (float) (2 * Math.PI * radius);
        area = (float) (Math.PI * Math.pow(radius, 2));

        System.out.println("Perimeter of the flower bed: " + perimeter);
        System.out.println("Area of the flower bed: " + area);
        scanner.close();
    }
    //remember to formatted your code
}