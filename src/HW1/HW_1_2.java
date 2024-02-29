package HW1;

import java.util.Scanner;

public class HW_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Hi! \nWhat is your name?");
        String name = scanner.nextLine();
        System.out.printf("Where do you live, %s?\n", name);
        String city = scanner.nextLine();
        System.out.printf("%s lives in %s!", name, city);
    }
}
