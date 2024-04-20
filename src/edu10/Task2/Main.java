package edu10.Task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Voznyak", "Maria");
        personMap.put("Smith", "John");
        personMap.put("Brown", "Bob");
        personMap.put("Hernandez", "Eduard");
        personMap.put("White", "Michael");
        personMap.put("Black", "Johny");
        personMap.put("Hguen", "Ivan");
        personMap.put("Red", "Patricia");
        personMap.put("Thguen", "Marcelo");
        personMap.put("Zapaska", "Bob");

        Person.output(personMap);
        Person.duplicatesFinder(personMap);
        Person.byFirstNameRemover(personMap, "Bob");

    }


    static class Person {
        public static void output(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                System.out.println("Last name: " + key + " First name: " + value);
            }
        }

        public static void duplicatesFinder(Map<String, String> map) {
            Set<String> values = new HashSet<>(map.values());
            if (values.size() != map.size()) {
                System.out.println("There is first name duplicates.");
            } else {
                System.out.println("There is no duplicates.");
            }


        }

        public static void byFirstNameRemover(Map<String, String> map, String name) {
            Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
            {
                while (iterator.hasNext()) {
                    Map.Entry<String, String> entry = iterator.next();
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (value.equals(name)) {
                        iterator.remove();
                        System.out.println("This person was removed: " + key + " " + value);
                    }
                }
            }
        }

    }
}
