package edu10.task2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {

        Map<String, String> personMap = new HashMap<>();
        personMap.put("Duda", "Andy");
        personMap.put("Nowak", "Anna");
        personMap.put("Smith", "John");
        personMap.put("Johnson", "John");
        personMap.put("Doe", "Jane");
        personMap.put("Lee", "David");
        personMap.put("Taylor", "Emma");
        personMap.put("Williams", "Emily");
        personMap.put("Brown", "Michael");
        personMap.put("Dorosh", "Orest");

        System.out.println("Contents of the map:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        boolean hasDuplicateFirstName = checkDuplicateFirstName(personMap);
        System.out.println("Are there at least two persons with the same first name? " + hasDuplicateFirstName);

        String firstNameToRemove = "Orest";
        removePersonWithFirstName(personMap, firstNameToRemove);

        System.out.println("\nMap after removing the person with first name \"" + firstNameToRemove + "\":");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static boolean checkDuplicateFirstName(Map<String, String> personMap) {
        Map<String, Integer> firstNameCountMap = new HashMap<>();
        for (String firstName : personMap.values()) {
            firstNameCountMap.put(firstName, firstNameCountMap.getOrDefault(firstName, 0) + 1);
        }
        for (int count : firstNameCountMap.values()) {
            if (count >= 2) {
                return true;
            }
        }
        return false;
    }

    private static void removePersonWithFirstName(Map<String, String> personMap, String firstName) {
        Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals(firstName)) {
                iterator.remove();
                break; // Remove only the first occurrence
            }
        }
    }
}
