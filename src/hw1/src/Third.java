import java.util.Scanner;

public class Third {
    public Third() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the cost per minute for the call from first country: ");
        double c1 = scanner.nextDouble();
        System.out.println("Enter the duration of call from first country: ");
        int t1 = scanner.nextInt();
        System.out.println("Enter the cost per minute for the call from second country: ");
        double c2 = scanner.nextDouble();
        System.out.println("Enter the duration of call from second country: ");
        int t2 = scanner.nextInt();
        System.out.println("Enter the cost per minute for the call from third country: ");
        double c3 = scanner.nextDouble();
        System.out.println("Enter the duration of call from third country: ");
        int t3 = scanner.nextInt();
        double eachcost1 = c1 * (double)t1;
        System.out.println("Cost of the call from first country equals: " + eachcost1);
        double eachcost2 = c2 * (double)t2;
        System.out.println("Cost of the call from second country equals: " + eachcost2);
        double eachcost3 = c3 * (double)t3;
        System.out.println("Cost of the call from third country equals: " + eachcost3);
        double totalcost = eachcost1 + eachcost2 + eachcost3;
        System.out.println("Total cost equals: " + totalcost);
        scanner.close();
    }
}