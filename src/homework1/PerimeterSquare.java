package homework1;

import java.util.Scanner;

public class PerimeterSquare {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String name, address;
        System.out.println("What is your name?");
        name = sc1.next();
        System.out.println("Where do you live," + name + "?");
        address = sc1.next();
        System.out.println("Name is " + name);
        System.out.println("Address is " + address);
        sc1.close();
    }
}