import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the circle radius: ");
        int radius = scanner.nextInt();
        double perimeter = (double)(2 * radius) * Math.PI;
        System.out.println("Circle perimeter equals: " + perimeter);
        double area = Math.PI * (double)(radius * radius);
        System.out.println("Circle area equals: " + area);
        scanner.close();
    }
}