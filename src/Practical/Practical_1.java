package Practical;
import java.util.Scanner;

public class Practical_1 {
    public static void practical_1_Task_1() {
        String firstLine, secondLine, thirdLine;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        firstLine = scanner.nextLine();
        System.out.println("How old are you?");
        secondLine = scanner.nextLine();
        System.out.println("Where are do you live?");
        thirdLine = scanner.nextLine();
        System.out.println("You live in " + thirdLine + ", " + "you are " + secondLine +
                " years old, and your name is " + firstLine);
    }
    public static void practical_1_Task_2() {
        int firstNumber, secondNumber, thirdNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        firstNumber = scanner.nextInt();
        System.out.println("Enter the 2d number");
        secondNumber = scanner.nextInt();
        System.out.println("Enter the 3d number");
        thirdNumber = scanner.nextInt();
        double avarage = (double) (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("Avarage is: " + avarage);
    }

    public static void practical_1_Task_3() {
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

    public static void practical_1_Task_4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How are you?");
        String answer = scanner.nextLine();
        System.out.println("You are " + answer + ".");
    }
}
