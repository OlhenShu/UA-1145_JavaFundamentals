package edu01;

import java.util.Scanner;

public class CallsCost {
    public static void main(String[] args) {
        int cost1, cost2, cost3; // Cost of each call
        //according to the convention, the variables should be declared on separate lines
        int time1, time2, time3; // Duration of each call
        int totalCost; // Total cost of calls
        int call1Cost, call2Cost, call3Cost; // Cost of each call based on duration

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input cost and duration for the first call:");
        cost1 = scanner.nextInt();
        time1 = scanner.nextInt();

        System.out.println("Input cost and duration for the second call:");
        cost2 = scanner.nextInt();
        time2 = scanner.nextInt();

        System.out.println("Input cost and duration for the third call:");
        cost3 = scanner.nextInt();
        time3 = scanner.nextInt();


        // Calculate the cost of each call based on duration
        call1Cost = cost1 * time1;
        call2Cost = cost2 * time2;
        call3Cost = cost3 * time3;

        // Calculate the total cost of calls
        totalCost = call1Cost + call2Cost + call3Cost;

        // Output the results
        System.out.println("The cost of the first phone call for " + time1 + " minutes: $" + call1Cost);
        System.out.println("The cost of the second phone call for " + time2 + " minutes: $" + call2Cost);
        System.out.println("The cost of the third phone call for " + time3 + " minutes: $" + call3Cost);
        System.out.println("Total cost: $" + totalCost);
        scanner.close();
    }
}
