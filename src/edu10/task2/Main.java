package edu10.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> personMap = new HashMap<>();

        personMap.put("Vetrov", "Vitalii");
        personMap.put("Shevchenko", "Orest");
        personMap.put("Ivanov", "Vitalii");
        personMap.put("Petrov", "Anton");
        personMap.put("Vetrova", "Anna");
        personMap.put("Klimok", "Alex");
        personMap.put("Bond", "James");
        personMap.put("Bond", "Orest");
        personMap.put("Camel", "Ivan");
        personMap.put("Oboev", "Rulon");

        System.out.println("Мапа до внесення змін: ");
        printPersons(personMap);

        //HashMap <String, String> newPersonMap = deleteOrest(personMap);

        System.out.println("Мапа після внесення змін: ");
        List<String> keys = new ArrayList<>();
        for (HashMap.Entry<String, String> pair : personMap.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            if (value.equals("Orest")) {
                keys.add(key);
            }
        }

        for (String e : keys) {
            personMap.remove(e);
        }

        printPersons(personMap);

    }

    public static void printPersons(HashMap<String, String> map) {
        for (HashMap.Entry<String, String> pair : map.entrySet()) {
            String value = pair.getKey();
            System.out.print(value + " ");
            value = pair.getValue();
            System.out.println(value);
        }
    }
}