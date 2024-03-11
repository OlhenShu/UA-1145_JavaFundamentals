import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Side 1:");
        double side1= scanner.nextInt();
        System.out.println("Input Side 2:");
        double side2= scanner.nextInt();
        System.out.println("Input Side 3:");
        double side3= scanner.nextInt();

        Triangle triangle = new Triangle(side1, side2, side3);
        double area = triangle.getArea();
        System.out.println("Area: " +area);


    }
}