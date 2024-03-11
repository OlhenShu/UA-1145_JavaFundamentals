import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number:");
        int num1= scanner.nextInt();
        System.out.print("Input second number:");
        int num2= scanner.nextInt();
        System.out.print("Input third number:");
        int num3= scanner.nextInt();
        int lowest = Lowest.findLowestNumber(num1,num2,num3);
        System.out.println("The smallest number is "+lowest);
    }
}