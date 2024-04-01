package hm4;

import java.util.Scanner;

public class MinMaxNumbers {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Перше число");
        int n1 = sc.nextInt();
        System.out.println("Друге число");
        int n2 = sc.nextInt();
        System.out.println("Третє число");
        int n3 = sc.nextInt();

        int maxnumber;
        if (n1 >= n2 && n1 >=n3) {
            maxnumber = n1;
        }
        else if (n2 >= n1 && n2 >=n3) {
            maxnumber = n2;
        }
        else {
            maxnumber = n3;
        }
        System.out.println("Найбільше число: " + maxnumber);

        int minnumber;
        if (n1 <= n2 && n1 <=n3) {
            minnumber = n1;
        }
        else if (n2 <= n1 && n2 <=n3) {
            minnumber = n2;
        }
        else {
            minnumber = n3;
        }
        System.out.println("Найменше число: " + minnumber);
    }
}
