package homework1;
import java.util.Scanner;

public class NameAddress {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius please:");
        double  Radius = sc.nextDouble();
        double Per = 2 * pi * Radius;
        double Square = pi * Radius * Radius;
        System.out.println("Perimeter is " + Per);
        System.out.println("Square is " + Square);
        sc.close();
    }
}
