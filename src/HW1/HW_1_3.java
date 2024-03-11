package HW1;

import java.util.Scanner;

public class HW_1_3 {//class name should be more descriptive - CallsCostCalculator
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let`s count how much money you should pay for your calls!");
        System.out.println("How long was the first call?");
        int t1 = scanner.nextInt();//better name for variable is time1
        System.out.println("How much was it per minute?");
        double c1 = scanner.nextDouble();//the same here - cost1

        System.out.println("How long was the second call?");
        int t2 = scanner.nextInt();
        System.out.println("How much was it per minute?");
        double c2 = scanner.nextDouble();
        System.out.println("How long was the third call?");
        int t3 = scanner.nextInt();
        System.out.println("How much was it per minute?");
        double c3 = scanner.nextDouble();

        double totalPrice = t1 * c1 + t2 * c2 + t3 * c3;
        System.out.printf("You have to pay $%.2f!", totalPrice);
    }
}
