package HometasK;
import java.util.Scanner;

public class Homework_1 {
    // Task 1: Perimeter and area of the flower bed
    public static void task_1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value of the radius");
        double radius = scanner.nextDouble();
        System.out.println("The perimeter of the flower bed is: " + (2 * 3.14 * radius));
        System.out.println("The area of the flower bed is: " + (3.14 * radius * radius));

    }

    //Task 2: Name and address
    public static void task_2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter your address: ");
        String address = scanner.nextLine();
        System.out.println("Your name is " + name);
        System.out.println("Your address is " + address);
    }

    //Task 3: The cost of the calls
    public static void task_3() {
        double c1, c2, c3;
        int t1, t2, t3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the cost of the first call");
        c1 = scanner.nextDouble();
        System.out.println("Please enter the cost of the second call");
        c2 = scanner.nextDouble();
        System.out.println("Please enter the cost of the third call");
        c3 = scanner.nextDouble();
        System.out.println("Please enter the duration of the first call");
        t1 = scanner.nextInt();
        System.out.println("Please enter the duration of the second call");
        t2 = scanner.nextInt();
        System.out.println("Please enter the duration of the third call");
        t3 = scanner.nextInt();
        System.out.println("You spent " + t1 * c1 + " dollars for the first call");
        System.out.println("You spent " + t2 * c2 + " dollars for the second call");
        System.out.println("You spent " + t3 * c3 + " dollars for the third call");
        double total = (t1 * c1) + (t2 * c2) + (t3 * c3);
        System.out.println("Totally you spent " + total + " dollars for the first call");
    }
}
