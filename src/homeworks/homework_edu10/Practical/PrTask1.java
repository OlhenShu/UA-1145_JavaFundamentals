package homeworks.homework_edu10.Practical;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrTask1 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Anna");
        employeeMap.put(2, "Alise");
        employeeMap.put(3, "Bob");
        employeeMap.put(4, "Kate");
        employeeMap.put(5, "Jon");
        employeeMap.put(6, "Anna");
        employeeMap.put(7, "Kate");
        for (Map.Entry<Integer, String> employee : employeeMap.entrySet()) {
            System.out.println(employee.getKey() + ": " + employee.getValue());
        }

        System.out.println("Enter id to find: ");
        int id = Integer.parseInt(SCANNER.nextLine());
        if (employeeMap.containsKey(id)) {
            System.out.println("Employee with id = " + id + ", is " + employeeMap.get(id));
        } else {
            System.out.println("There is no employee with id = " + id);
        }

        System.out.println("Enter the name to search for: ");
        String name = SCANNER.nextLine().trim();
        if (employeeMap.containsValue(name)) {
            for (var entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(name)) {
                    System.out.println(entry.getKey() + ": " + name);
                }
            }
        } else {
            System.out.println("there is no employee with name = " + name);
        }


    }
}
