package hm1;

import java.util.Scanner;

public class NameAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Where do you live, " + name + "?");
        String address = scanner.nextLine();

        System.out.println(name + " " + address);
        scanner.close();
    }
}
