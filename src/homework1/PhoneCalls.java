package homework1;

import java.util.Scanner;

public class PhoneCalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float c1, c2, c3;
        float t1, t2, t3;
        float price1, price2, price3;
        System.out.println("Enter first cost per minute? - Bolivia");
        c1=sc.nextFloat();
        System.out.println("Enter second cost per minute? - Sweden");
        c2=sc.nextFloat();
        System.out.println("Enter third cost per minute? - Germany");
        c3=sc.nextFloat();

        System.out.println("Enter duration to Bolivia");
        t1=sc.nextFloat();
        System.out.println("Enter duration to Sweden");
        t2=sc.nextFloat();
        System.out.println("Enter duration to Germany");
        t3=sc.nextFloat();
        sc.close();

        price1 = c1 * t1;
        price2 = c2 * t2;
        price3 = c3 * t3;

        System.out.println("A phone call to Bolivia cost " + price1 + " dollars");
        System.out.println("A phone call to Sweden cost " + price2 + " dollars");
        System.out.println("A phone call to Germany cost " + price3 + " dollars");

    }
}
