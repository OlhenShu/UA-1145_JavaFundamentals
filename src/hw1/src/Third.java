import java.util.InputMismatchException;
import java.util.Scanner;

public class Third {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter the cost per minute for the call from first country: ");
                double c1 = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter the duration of call from first country: ");
                int t1 = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter the cost per minute for the call from second country: ");
                double c2 = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter the duration of call from second country: ");
                int t2 = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter the cost per minute for the call from third country: ");
                double c3 = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter the duration of call from third country: ");
                int t3 = Integer.parseInt(scanner.nextLine());

                double eachСost1 = c1 * t1;
                System.out.println("Cost of the call from first country equals: " + eachСost1);
                double eachcost2 = c2 * t2;
                System.out.println("Cost of the call from second country equals: " + eachcost2);
                double eachcost3 = c3 * t3;
                System.out.println("Cost of the call from third country equals: " + eachcost3);
                double totalСost = eachСost1 + eachcost2 + eachcost3;
                System.out.println("Total cost equals: " + totalСost);

                break;
            } catch (NumberFormatException e) {
                System.err.println("Entered number must be a valid number.");
            }
        }
        scanner.close();
    }
}
