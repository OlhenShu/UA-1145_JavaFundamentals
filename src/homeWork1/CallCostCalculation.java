package homeWork1;

import java.util.Scanner;

public class CallCostCalculation {

    private double cost;
    private double duration;
    private double result;

    private Scanner scanner = new Scanner(System.in);

    protected void callCostCalculator(){
        System.out.println("Enter the cost per minute?");
        cost = scanner.nextDouble();
        System.out.println("Enter the duration in minutes?");
        duration = scanner.nextDouble();
        result = calculateTheCost(cost, duration);
        System.out.println("The cost of the call is " + result);
    }

    private double calculateTheCost(double cost, double duration){
        return cost*duration;
    }
}
