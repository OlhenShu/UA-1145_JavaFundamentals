package Practicals.Pr10.Ex1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class RunnerEmployeeMap {

    public static void main(String[] args) {
        HashMap<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Kate");
        employeeMap.put(2, "Bob");
        employeeMap.put(3, "Ron");
        employeeMap.put(4, "Bill");
        employeeMap.put(5, "Ann");
        employeeMap.put(6, "Tod");
        employeeMap.put(7, "Den");

        System.out.println("Employee HashMap has such elements: " + employeeMap);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the ID of employee: ");
        int key = scanner.nextInt();

        boolean is_validKey = containsKey(employeeMap, key);
        if (is_validKey) {
            System.out.println("ID # " + key + " has " + employeeMap.get(key));
        } else {
            System.out.println("There is no worker with ID # " + key);
        }
        scanner.nextLine();

        System.out.println("ID of what worker do you want to find?");
        String workerName = scanner.nextLine();

        boolean is_validName = containsValue(employeeMap, workerName);

        if (is_validName) {
            System.out.println(workerName + " has ID # " + findKeyFromValue(employeeMap, workerName));
        } else {
            System.out.println("There is no worker with name" + workerName);
        }


        scanner.close();

    }

    public static boolean containsKey(HashMap<Integer, String> map, int key) {
        return map.containsKey(key);
    }

    public static boolean containsValue(HashMap<Integer, String> map, String name) {
        return map.containsValue(name);
    }

    public static int findKeyFromValue(HashMap<Integer, String> map, String name) {
        Set<Integer> keySet = map.keySet();
        for (Integer i : keySet) {
            if (map.get(i).equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
