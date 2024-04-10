package Homework_10;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Drinkers", "Bob");
        personMap.put("Charlston", "Nail");
        personMap.put("Zuckerberg", "Mark");
        personMap.put("Snow", "John");
        personMap.put("Mccartney", "Paul");
        personMap.put("Johanson", "Scarlett");
        personMap.put("Smith", "Anna");
        personMap.put("Pitt", "Brad");
        personMap.put("Lennon", "John");
        personMap.put("Eyelish", "Billy");

        System.out.println("Before changes:");
        for (String key : personMap.keySet()) {
            String value = personMap.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }

        System.out.println("\nAfter removal persons with the name 'John':");

        Map<String, String> newMap = new HashMap<>(personMap);

        for (String key : personMap.keySet()) {
            String value = personMap.get(key);
            if (!value.equals("John")) {
                newMap.put(key, value);
                System.out.println("Key: " + key + ", Value: " + value);
            }
        }
    }
}
