import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base of the triangle:");
        double base = scanner.nextDouble();
        System.out.println("Enter the height of the triangle:");
        double height = scanner.nextDouble();
        
        double area = calculateTriangleArea(base, height);
        System.out.println("The area of the triangle is: " + area);
    }
    
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
}
