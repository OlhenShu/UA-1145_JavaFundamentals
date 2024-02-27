package homework1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scann.nextLine();

        System.out.println("Where do you live, " + name + "?");
        String address = scann.nextLine();

        System.out.println(name + ", live in " + address);
    }
}
