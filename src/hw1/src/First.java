
import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            try{
                System.out.println("Enter the circle radius: ");
                int radius = Integer.parseInt(scanner.nextLine());
                double perimeter = 2 * radius * Math.PI;
                System.out.println("Circle perimeter equals: " + perimeter);

                double area = Math.PI * Math.pow(radius, 2);
                System.out.println("Circle area equals: " + area);
                break;

            } catch (NumberFormatException e) {
                System.err.println("Inputed value is non-integer");
            }
        }
    }
}