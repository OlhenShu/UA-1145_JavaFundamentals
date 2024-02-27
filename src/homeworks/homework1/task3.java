package homework1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.println("Input the coast per minute for call 1: ");
        double c1 = scann.nextDouble();
        System.out.println("Input the duration of call 1: ");
        double t1 = scann.nextDouble();

        System.out.println("Input the coast per minute for call 2: ");
        double c2 = scann.nextDouble();
        System.out.println("Input the duration of call 2: ");
        double t2 = scann.nextDouble();

        System.out.println("Input the coast per minute for call 3: ");
        double c3 = scann.nextDouble();
        System.out.println("Input the duration of call 3: ");
        double t3 = scann.nextDouble();

        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;

        double total = cost1 + cost2 + cost3;

        // Or such an option
        //double total = (c1 * t1) + (c2 * t2) + (c3 * t3);

        System.out.println("The cost of the first call: " + cost1);
        System.out.println("The cost of the second call: " + cost2);
        System.out.println("The cost of the third call: " + cost3);
        System.out.println("Total cost for three calls: " + total);
    }
}
