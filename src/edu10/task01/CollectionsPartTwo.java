package edu10.task01;

import java.util.*;

public class CollectionsPartTwo {
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>(Arrays.asList("red", "blue", "black", "green", "red"));
        Set<String> set2 = new HashSet<>(Arrays.asList("red", "green", "yellow", "black"));

        System.out.println("Union: " + union(set1, set2));
        System.out.println("Intersection: " + intersect(set1, set2));

        Map<String, String> personMap = new HashMap<>();
        personMap.put("Smith", "Joshua");
        personMap.put("Doe", "Jane");
        personMap.put("Oakley", "Daniel");
        personMap.put("Blair", "John");
        personMap.put("Stanton", "Orest");
        personMap.put("Dmytrasevych", "Orest");

        personMap.put("Kaur", "Mark");
        personMap.put("Atticus", "Lee");
        personMap.put("Webb", "Camilla");
        personMap.put("Ball", "Omari");

        System.out.println("Persons of the map:");
        personMap.forEach((lastName, firstName) -> System.out.println(lastName + ": " + firstName));
        System.out.println("=".repeat(60));

        String targetName = "Orest";
        boolean hasDuplicate = personMap.values().stream()
                .filter(name -> name.equals(targetName))
                .count() >= 2;

        if (hasDuplicate) {
            // Remove all people with first name "Orest"
            personMap.entrySet().removeIf(entry -> entry.getValue().equals(targetName));
        }

        System.out.println("Map after removal:");
        personMap.forEach((lastName, firstName) -> System.out.println(lastName + " - " + firstName));
    }
}