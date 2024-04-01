package src.edu04.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner numberScan = new Scanner(System.in);
        System.out.println("Please write three float numbers: ");
        float num1 = numberScan.nextFloat();
        float num2 = numberScan.nextFloat();
        float num3 = numberScan.nextFloat();

        int count = 0;
        if ((num1 >= -5) && (num1 <= 5)) {
            count++;
        }
        if ((num2 >= -5) && (num2 <= 5)) {
            count++;
        }
        if ((num3 >= -5) && (num3 <= 5)) {
            count++;
        }
        if (count == 3) {
            System.out.println("All numbers belong to the range [-5, 5]. ");
        } else {
            System.out.println("Not all numbers belong to the range [-5, 5]. ");
        }


    }

}
