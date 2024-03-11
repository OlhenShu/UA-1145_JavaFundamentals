package task2;

import java.util.Scanner;

public class Task2 {

    public static void findMin (double num1,double num2,double num3){
        double result = Math.min(num1, num2);
        result = Math.min(result, num3);

        System.out.println("Найменше число = " + result);

    }

    public static void main(String[] arg) {
        Scanner numScan = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        double num1 = numScan.nextDouble();
        System.out.print("Введіть друге число: ");
        double num2 = numScan.nextDouble();
        System.out.print("Введіть третє число: ");
        double num3 = numScan.nextDouble();

        findMin(num1, num2, num3);
    }

}
