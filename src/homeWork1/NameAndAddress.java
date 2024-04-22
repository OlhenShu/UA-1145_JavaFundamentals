package homeWork1;

import java.util.Scanner;

public class NameAndAddress {
    private String name;
    private String address;
    private Scanner scanner = new Scanner(System.in);//better to use static Scanner

    public void greeting(){
        System.out.println("What is your name?");
        name = scanner.nextLine();
        System.out.println("Where do you live, "+ name + " ?");
        address = scanner.nextLine();
        System.out.println(name + " lives on " + address);
    }
}
