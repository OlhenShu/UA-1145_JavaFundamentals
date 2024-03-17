import java.util.Scanner;
public class MinandMax {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = scanner.nextInt();
        System.out.println("Enter second number :");
        int b = scanner.nextInt();
        System.out.println("Enter third number :");
        int c = scanner.nextInt();
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a,b), c);
        System.out.printf("largest of three numbers %d, %d, and %d is : %d %n", a, b, c, max);
        System.out.printf("smallest of three numbers %d, %d, and %d is : %d %n", a, b, c, min);
    }



}
