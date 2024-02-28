import java.util.Scanner;

public class Homework_1 {
    public static void main(String[] args) {

        // Task 01
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the flower bed radius: ");

        float radius = scanner.nextFloat();

        double perimeter = 2 * Math.PI * radius;

        double area = radius * radius * Math.PI;

        System.out.println("The perimeter of flower bed is " + perimeter);
        System.out.println("The area of flower bed is " + area);

        // Task 02
        String name, address;

        System.out.println("What is your name?");
        name = scanner.nextLine();

        System.out.println("Where do you live, " + name + "?");
        address = scanner.nextLine();

        System.out.println("You name is " + name + ", your address is " + address);

        // Task 03
        int c1, c2, c3;
        int t1, t2, t3;

        System.out.println("Input price of first call in UAH:");
        c1 = scanner.nextInt();

        System.out.println("Input duration of first call in minutes:");
        t1 = scanner.nextInt();

        System.out.println("Input price of second call in UAH:");
        c2 = scanner.nextInt();

        System.out.println("Input duration of second call in minutes:");
        t2 = scanner.nextInt();

        System.out.println("Input price of third call in UAH:");
        c3 = scanner.nextInt();

        System.out.println("Input duration of third call in minutes:");
        t3 = scanner.nextInt();

        System.out.println("The price of first call is " + (c1 * t1) + " UAH");
        System.out.println("The price of second call is " + (c2 * t2) + " UAH");
        System.out.println("The price of third call is " + (c3 * t3) + " UAH");
    }
}