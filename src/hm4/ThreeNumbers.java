package hm4;

import java.util.Scanner;

public class ThreeNumbers {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Перше число:");
        float n1 = sc.nextFloat();
        System.out.println("Друге число:");
        float n2 = sc.nextFloat();
        System.out.println("Третє число:");
        float n3 = sc.nextFloat();

        if ((n1 >= -5 && n1 <=5) && (n2 >= -5 && n2 <=5) && (n3 >= -5 && n3 <=5)){
            System.out.println("Числа входять у діапозон [-5;5]");
        }
        else {
            System.out.println("Числа не входять у діапозон [-5;5]");
        }
    }
}
