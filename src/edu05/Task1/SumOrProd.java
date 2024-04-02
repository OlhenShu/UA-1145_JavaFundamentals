package src.edu05.Task1;

import java.util.Scanner;

public class SumOrProd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write 10 numbers: ");
        int[] numbAr = new int[10];
        boolean flag = true;
        for (int i = 0; i < numbAr.length; i++) {
            numbAr[i] = scanner.nextInt();
            if (numbAr[i] < 0) {
                flag = false;
            }
        }
        if (!flag) {
            int prod = 1;
            for (int i = 5; i < numbAr.length; i++) {
                prod *= numbAr[i];
            }
            System.out.println(prod);
        } else {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += numbAr[i];
            }
            System.out.println(sum);
        }
    }

}



