package Practical;
import java.util.Scanner;

public class Practical_1 {
    public static void practical_1_Task_1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value for 'a'");
        int a = scanner.nextInt();
        System.out.println("Please enter the value for 'b'");
        int b = scanner.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }

    public static void practical_1_Task_2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How are you?");
        String answer = scanner.nextLine();
        System.out.println("You are " + answer + ".");
    }
}
