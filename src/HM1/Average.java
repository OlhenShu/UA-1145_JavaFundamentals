package HM1;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        System.out.println("Введіть три числа: ");//better to write text for users in English
        int a, b, c;//that style doesn't correct for convention
        //int a;
        //int b;
        //int c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.print("Середнє значення: ");
        System.out.println((float) ((a + b + c) / 3));//It's not correct. Try 3,4,1 --> your result will be 2.0
        // System.out.println(((a + b + c)/ 3.0));//2.6666
        //or
        // System.out.println((float)(a + b + c)) / 3;

    }
}
