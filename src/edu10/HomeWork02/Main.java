package edu10.HomeWork02;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        /*
        Create a map to store person information (last name, first name)
        */
        Map<String, String> personMap = new HashMap<>();

        personMap.put("Jobs", "Steve");
        personMap.put("Johnson", "Emily");
        personMap.put("Fassbinder", "Michael");
        personMap.put("Jones", "Jessica");
        personMap.put("Bloomfield", "Daniel");
        personMap.put("Connor", "Sarah");
        personMap.put("Miller", "Sergiy");
        personMap.put("Wilson", "Irene");
        personMap.put("Moore", "Matthew");
        personMap.put("Natanovich", "Orest");

        System.out.println("Contents of personMap:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("Last Name: " + entry.getKey() + ", First Name: " + entry.getValue());
        }

        // Check if there are at least two persons with the same first name
        boolean hasDuplicateFirstName = checkDuplicateFirstNames(personMap);

        // Display the result
        if (hasDuplicateFirstName) {
            System.out.println("There are at least two persons with the same first name.");
        } else {
            System.out.println("There are no two persons with the same first name.");
        }

        // Remove the person whose first name is Orest
        personMap.values().removeIf(firstName -> firstName.equals("Orest"));

        // Print the resulting map after removal
        System.out.println("\nAfter removing the person with first name 'Orest':");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("Last Name: " + entry.getKey() + ", First Name: " + entry.getValue());
        }
    }

    // Method to check if there are at least two persons with the same first name
    private static boolean checkDuplicateFirstNames(Map<String, String> personMap) {
        Map<String, Integer> firstNameCount = new HashMap<>();

        // Count occurrences of each first name
        for (String firstName : personMap.values()) {
            firstNameCount.put(firstName, firstNameCount.getOrDefault(firstName, 0) + 1);
        }

        // Check if any first name occurs more than once
        for (int count : firstNameCount.values()) {
            if (count > 1) {
                return true;
            }
        }

        return false;
    }
}

