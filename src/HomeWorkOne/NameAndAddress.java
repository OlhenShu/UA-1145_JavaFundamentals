package HomeWorkOne;

import java.util.Scanner;

public class NameAndAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Як тебе звати? ");
        String name = scanner.next();
        System.out.println("Де ти живеш? ");
        String address = scanner.next();
        System.out.println(name + " " + address);
    }
}
