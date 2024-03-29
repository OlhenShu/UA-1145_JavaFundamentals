import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float num1 = scanner.nextFloat();
        System.out.print("Enter the second number: ");
        float num2 = scanner.nextFloat();
        System.out.print("Enter the third number: ");
        float num3 = scanner.nextFloat();

        if (checkRange(num1) && checkRange(num2) && checkRange(num3)) {
            System.out.println("All numbers belong to the range [-5, 5].");
        } else {
            System.out.println("Not all numbers belong to the range [-5, 5].");
        }

        scanner.close();
    }

    public static boolean checkRange(float num) {
        return num >= -5 && num <= 5;
    }
}
