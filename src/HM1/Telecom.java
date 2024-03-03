package HM1;

import java.util.Scanner;

public class Telecom {
    public static void main(String[] args) {
        int c, c1, c2;
        int t, t1, t2;
        Scanner sc = new Scanner(System.in);
        int d = 3;
        System.out.println("Enter the price per minute of talk:");
        for (int i = 1; i <= d; i++) {
            System.out.print("CLIENT NUM " + i + "\t");
            if (i == 1) {
                c = sc.nextInt();
                System.out.print("Total time: ");
                t = sc.nextInt();
                System.out.print("Prise for client " + i + "\t");
                System.out.println(c * t);
            } else if (i == 2) {
                c1 = sc.nextInt();
                System.out.print("Total time: ");
                t1 = sc.nextInt();
                System.out.print("Prise for client " + i + "\t");
                System.out.println(c1 * t1);
            } else {
                c2 = sc.nextInt();
                System.out.print("Total time: ");
                t2 = sc.nextInt();
                System.out.print("Prise for client " + i + "\t");
                System.out.println(c2 * t2);
            }
        }
    }
}