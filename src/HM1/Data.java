package HM1;

import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        String name , adress;
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        name = sc.nextLine();
        System.out.println("Where do you live, " + name + "?");
        adress = sc.nextLine();
        System.out.println("You are " + name + " from" + adress +" !");
    }
}
