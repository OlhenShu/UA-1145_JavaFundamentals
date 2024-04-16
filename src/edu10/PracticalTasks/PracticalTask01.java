package edu10.PracticalTasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PracticalTask01 {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "John Smith");
        employeeMap.put(2, "Jane Doe");
        employeeMap.put(3, "Bill Jones");
        employeeMap.put(4, "Mary Johnson");
        employeeMap.put(5, "Tom Browne");
        employeeMap.put(6, "Bill Gates");
        employeeMap.put(7, "Steve Jobs");
        System.out.println(employeeMap);

        var scanner = new Scanner(System.in);
        System.out.println("Enter an employee ID: ");
        int employeeId = Integer.parseInt(scanner.nextLine());
        if (employeeMap.containsKey(employeeId)) {
            System.out.println("Employee name with id = " + employeeId + " is " +
                    employeeMap.get(employeeId));
        } else {
            System.out.println("Employee with id = " + employeeId + " was not found");
        }
        System.out.println("Enter an employee name to search for: ");
        String name = scanner.nextLine().trim();
        if (employeeMap.containsValue(name)) {
            for (var entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(name)) {
                    System.out.println("Employee id with name = " + name + " is " +
                            entry.getKey());
                }
            }
        } else {
            System.out.println("There is no such employee");
        }
    }
}
