import java.util.Scanner;

public class SmallestNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int smallest = findSmallestNumber(num1, num2, num3);
        System.out.println("The smallest number is: " + smallest);
    }

    public static int findSmallestNumber(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}
