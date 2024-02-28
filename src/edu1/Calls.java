import java.util.Scanner;

public class Calls {
    public Calls() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phone calls cost 1");
        double c1 = (double)scanner.nextInt();
        System.out.println("Phone calls cost 2");
        double c2 = (double)scanner.nextInt();
        System.out.println("Phone calls cost 3");
        double c3 = (double)scanner.nextInt();
        System.out.println("Phone calls duration 1");
        double t1 = (double)scanner.nextInt();
        System.out.println("Phone calls duration 2");
        double t2 = (double)scanner.nextInt();
        System.out.println("Phone calls duration 3");
        double t3 = (double)scanner.nextInt();
        double callcost1 = c1 * t1;
        System.out.println("Call Cost " + callcost1);
        double callcost2 = c2 * t2;
        System.out.println("Call Cost " + callcost2);
        double callcost3 = c3 * t3;
        System.out.println("Call Cost " + callcost3);
        double totalcost = callcost1 + callcost2 + callcost3;
        System.out.println("Total Cost " + totalcost);
    }
}