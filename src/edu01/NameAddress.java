package edu01;

import java.util.Scanner;

public class NameAddress {
    public static void main(String[] args) {
        String name;
        String address;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        name = scanner.nextLine();

        System.out.println("Where do you live, " + name + "?");
        address = scanner.nextLine();

        System.out.println("Name: " + name + '\n' + "Address: " + address);
        scanner.close();
    }
}