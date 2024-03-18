package homework.hw1.phoneCall;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter phone call #1 params");
        PhoneCall pc1 = new PhoneCall(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Enter phone call #2 params");
        PhoneCall pc2 = new PhoneCall(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Enter phone call #3 params");
        PhoneCall pc3 = new PhoneCall(scanner.nextDouble(), scanner.nextDouble());

        double costOfCall1 = calculateCostOfCall(pc1.getCostPerMinute(), pc1.getDuration());
        double costOfCall2 = calculateCostOfCall(pc2.getCostPerMinute(), pc2.getDuration());
        double costOfCall3 = calculateCostOfCall(pc3.getCostPerMinute(), pc3.getDuration());

        System.out.println("Cost of call 1: " + costOfCall1);
        System.out.println("Cost of call 2: " + costOfCall2);
        System.out.println("Cost of call 3: " + costOfCall3);


        double totalCallsCost = costOfCall1 + costOfCall2 + costOfCall3;

        System.out.println("Total calls cost: " + totalCallsCost);

        scanner.close();
    }

    private static double calculateCostOfCall(double costPerMinute, double duration) {
        return costPerMinute * duration;
    }
}
