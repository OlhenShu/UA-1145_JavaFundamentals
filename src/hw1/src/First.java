import java.util.Scanner;

public class First {
    public First() {
    }

    public static void main(String[] args) {
        double pi = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the circle radius: ");
        int radius = scanner.nextInt();
        double perimeter = (double)(2 * radius) * pi;
        System.out.println("Circle perimeter equals: " + perimeter);
        double area = pi * (double)(radius * radius);
        System.out.println("Circle area equals: " + area);
        scanner.close();
    }
}