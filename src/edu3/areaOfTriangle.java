import java.util.Scanner;

public class areaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of side a:");
        double a = scanner.nextDouble();

        System.out.println("Enter the length of side b:");
        double b = scanner.nextDouble();

        System.out.println("Enter the length of side c:");
        double c = scanner.nextDouble();

        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The area of the triangle is: " + area);
    }
}