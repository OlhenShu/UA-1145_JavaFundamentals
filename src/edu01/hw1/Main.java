package hw1;

import java.util.Scanner;

import static java.lang.Math.PI;

class Main {
    public static void main(String[] args) {
//1
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть радіус: ");

        double rad = scan.nextDouble();
        double per = 2 * PI * rad;
        double area = rad * rad * PI;

        System.out.println("Периметр дорівнює = " + per);
        System.out.println("Площа дорівнює = " + area);

//2
        Scanner info_scan = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = info_scan.nextLine();

        System.out.println("Where do you live, " +  name + "?");
        String address = info_scan.nextLine();

        System.out.println("Hello " + name + " from " + address);

//3
        Scanner call_scan = new Scanner(System.in);
        System.out.println("Please, write cost of each call per minute: ");

        double first_price = call_scan.nextDouble();
        double second_price = call_scan.nextDouble();
        double third_price = call_scan.nextDouble();

        System.out.println("Please, write duration of each call: ");

        double first_call = call_scan.nextDouble();
        double second_call = call_scan.nextDouble();
        double third_call = call_scan.nextDouble();

        double firstCallPrice = first_price*first_call;
        double secondCallPrice = second_price*second_call;
        double thirdCallPrice = third_price*third_call;


        System.out.println("Cost of 1st call: " + firstCallPrice);
        System.out.println("Cost of 2nd call: " + secondCallPrice);
        System.out.println("Cost of 3rd call: " + thirdCallPrice);

        System.out.println("Total cost: " + (firstCallPrice + secondCallPrice + thirdCallPrice));

    }
}
