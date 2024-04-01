package edu10.Practical;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static java.lang.System.in;

public class Task1 {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put( 1, "Alice");
        employeeMap.put( 2, "Alex");
        employeeMap.put( 3, "Bob");
        employeeMap.put( 4, "Jack");
        employeeMap.put( 5, "John");
        employeeMap.put( 6, "Bob");
        employeeMap.put( 7, "Alex");
        System.out.println(employeeMap);

        Scanner SCANNER = new Scanner(in);
        System.out.println("Enter id to find:");
        int id = Integer.parseInt(SCANNER.nextLine());
        if (employeeMap.containsKey(id)) {
            System.out.println("Employee with id = " + id + " is " +
                    employeeMap.get(id));
        } else {
            System.out.println("Can't find this id" + id);
        }

        System.out.println("Enter the name to find the id: ");
        String name = SCANNER.nextLine().trim();
        boolean found = false;
            for ( var entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(name)) {
                    System.out.println(entry.getKey() + " : " + name);
                    found = true;
                }
            }
            if (!found) {
            System.out.println("There is no such name = " + name);
        }
    }
}
