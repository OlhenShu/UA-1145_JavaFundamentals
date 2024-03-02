package edu01;
import java.util.Scanner;
/*
Define two String variables name and address. Output question "What is your name?
to the console. Read the value of name and output next question: “Where do you live,
(name)?“ to the console. Read the value of address from the console and output the
complete information.
 */
public class NameAddress {


    public static void main(String[] args) {
        String name;
        String address;
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        name = scanner.nextLine();
        System.out.print("Where do you live, " + name + "?: ");
        address = scanner.nextLine();
        System.out.println("Hey, " + name + "! I know where you live! It's " + address);
        scanner.close();

    }
}
