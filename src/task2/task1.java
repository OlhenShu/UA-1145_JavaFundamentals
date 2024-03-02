import java.util.Scanner;

public class Task1 {
    static int sidearr[] = new int[3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first side:");
        sidearr[0] = Integer.parseInt(scanner.nextLine());
        System.out.println("Input second side:");
        sidearr[1] = Integer.parseInt(scanner.nextLine());
        System.out.println("Input third side:");
        sidearr[2] = Integer.parseInt(scanner.nextLine());

        int perimeter = calculatePerimeter();
        System.out.println("Perimeter of the triangle: " + perimeter);
    }

    static int calculatePerimeter() {
        int sum = 0;
        for (int i = 0; i < 3; i++)
            sum = sum + sidearr[i];
        return sum;
    }
}