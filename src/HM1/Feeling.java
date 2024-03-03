package HM1;

import java.util.Scanner;

public class Feeling {
    public static void main(String[] args) {
        System.out.println("How are you?");
        String felling;
        Scanner sc = new Scanner(System.in);
        felling = sc.nextLine();
        System.out.println("You are " + felling );
    }
}
