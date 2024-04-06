package homeworks.homework_edu10.Homework;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Smith", "Adam");
        personMap.put("Johnson", "Anna");
        personMap.put("Williams", "Herry");
        personMap.put("Brown", "Dan");
        personMap.put("Jones", "Jon");
        personMap.put("Miller", "Bob");
        personMap.put("Lopez", "Lise");
        personMap.put("Wilson", "Alise");
        personMap.put("Moore", "Greg");
        personMap.put("Lee", "Robert");

        for (Map.Entry<String, String> person : personMap.entrySet()) {
            System.out.println(person.getKey() + " " + person.getValue());
        }
        System.out.println(" ");

        boolean duplicatesFirstName = duplicatesFirstName(personMap);
        boolean i = true;
        if (duplicatesFirstName == i) {
            System.out.println("The are two or more duplicates first name.");
        } else {
            System.out.println("All names are unique.");
        }
        System.out.println(" ");

        deletePersonWithSpecifiedName(personMap, "Anna");
        System.out.println("Map after removing the person: ");
        for (Map.Entry<String, String> person : personMap.entrySet()) {
            System.out.println(person.getKey() + " " + person.getValue());
        }

    }

    private static boolean duplicatesFirstName(Map<String, String> personMap) {
        Set<String> firstNames = new HashSet<>(personMap.values());
        return firstNames.size() != personMap.size();
    }

    private static void deletePersonWithSpecifiedName(Map<String, String> personMap, String firstNames) {
        Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals(firstNames)) {
                iterator.remove();
            }
        }

    }


}
