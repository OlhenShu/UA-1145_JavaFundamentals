package edu04.HomeWork01;

import java.util.Scanner;

import static java.lang.System.in;

public class Compare {
    public static void main(String[] args) {
        float num1;
        float num2;
        float num3;
        Scanner scan = new Scanner(in);
        System.out.println("Please, enter first float numbers: ");
        num1 = scan.nextFloat();
        System.out.println("Please, enter second float numbers: ");
        num2 = scan.nextFloat();
        System.out.println("Please, enter third float numbers: ");
        num3 = scan.nextFloat();


        if (num1 >= -5 && num1 <= 5f && num2 >= -5 && num2 <= 5f && num3 >= -5 && num3 <= 5f)
            System.out.println("All number belong to the range [-5, 5]");
        else System.out.println("Not all numbers belong to the range [-5, 5]");

    }
}
