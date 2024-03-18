package homework.hw1;

import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Де ви живете?");
        String address = scanner.nextLine();

        System.out.println("You`r name is " + name + " and you live " + address);
        scanner.close();
    }
}
