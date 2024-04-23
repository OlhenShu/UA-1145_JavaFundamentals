package HM10.part2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> personMap = new HashMap<>();
        personMap.put("Smith", "John");
        personMap.put("Johnson", "Emily");
        personMap.put("Williams", "Michael");
        personMap.put("Brown", "Jessica");
        personMap.put("Jones", "Christopher");
        personMap.put("Garcia", "Orest");
        personMap.put("Davis", "Daniel");

        changeMap(personMap);
    }

    public static void changeMap(HashMap<String, String> personMap) {
        List<String> keys = new ArrayList<>();
        for (HashMap.Entry<String, String> pair : personMap.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            if (value.equals("Orest")) {
                keys.add(key);
            }
        }
        for (String ch : keys) {
            personMap.remove(ch);
        }
        printPerson(personMap);
    }

    public static void printPerson(HashMap<String, String> personMap) {
        for (HashMap.Entry<String, String> pair : personMap.entrySet()) {
            String value = pair.getKey();
            System.out.println(value + " ");
            value = pair.getValue();
            System.out.println(value);
            ;
        }
    }
}
