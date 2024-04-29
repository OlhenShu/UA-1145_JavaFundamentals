package HomeWork10.Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {

        Map<String, String> personMap = new HashMap<>();

        personMap.put("Doe", "John");
        personMap.put("Smith", "Emily");
        personMap.put("Johnson", "Michael");
        personMap.put("Williams", "Jessica");
        personMap.put("Brown", "Michael");
        personMap.put("Jones", "Jessica");
        personMap.put("Garcia", "David");
        personMap.put("Martinez", "Emily");
        personMap.put("Davis", "Orest"); // Suppose there's a person with the first name "Orest"
        personMap.put("Taylor", "Emma");

        System.out.println("Map before changes: ");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

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

        System.out.println("\nMap after change: ");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}

