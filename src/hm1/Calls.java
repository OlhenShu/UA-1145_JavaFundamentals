package hm1;

import java.util.Scanner;

public class Calls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cost per minute:");

        System.out.println("First");
        double c1 = scanner.nextDouble();
        System.out.println("Second");
        double c2 = scanner.nextDouble();
        System.out.println("Third");
        double c3 = scanner.nextDouble();

        System.out.println("Time:");

        System.out.println("First");
        double t1 = scanner.nextDouble();
        System.out.println("Second");
        double t2 = scanner.nextDouble();
        System.out.println("Third");
        double t3 = scanner.nextDouble();

        double p1 = c1 * t1;
        double p2 = c2 * t2;
        double p3 = c3 * t3;

        System.out.println("Cost of first call: " + p1);
        System.out.println("Cost of second call: " + p2);
        System.out.println("Cost of third call: " + p3);
        System.out.println("Total cost: " + (p1+p2+p3));
        scanner.close();
    }
}
