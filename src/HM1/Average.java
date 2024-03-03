package HM1;

import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        System.out.println("Введіть три числа: ");
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.print("Середнє значення: ");
        System.out.println((float)((a + b + c)/ 3));

    }
}
