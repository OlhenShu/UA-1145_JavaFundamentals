package Second;

import java.util.*;

public class Person {

    public static void output(Map<String, String> map) {
        System.out.println("The contents of the map is: ");
        for(var mapEntry : map.entrySet()) {
            System.out.println(mapEntry.getValue() + " " + mapEntry.getKey());
        }
    }

    public static boolean areThereTwoPersonsWithName(Map<String, String> map) {
        System.out.println(" ");
        boolean isPresent = false;
        Set<String> valueSet = new HashSet<>();
        for (var mapEntry : map.entrySet()) {
            if (!valueSet.add(mapEntry.getValue())) {
                if (!isPresent) {
                    System.out.println("Duplicate values found:");
                    isPresent = true;
                }
                System.out.println(mapEntry.getValue() + " with key " + mapEntry.getKey());
            }
        }
        return isPresent;
    }

    public static void removeByFirstName(Map<String, String> map, String firstName) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals(firstName)) {
                iterator.remove();
            }
        }
        System.out.println("\nContents of the map after removal:");
        output(map);
        System.out.println("Removed object with value ''"  +firstName  +"''");
    }
}