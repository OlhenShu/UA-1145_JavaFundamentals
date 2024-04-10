package HomeWorks.HW10.Ex2;

import java.util.HashMap;
import java.util.Locale;

public class RunnerPersonMap {

    public static void main(String[] args) {

        HashMap<String, String> personMap = new HashMap<>();
        personMap.put("Black", "Kate");
        personMap.put("Red", "Bill");
        personMap.put("White", "Bob");
        personMap.put("Green", "Nick");
        personMap.put("Brown", "Ann");
        personMap.put("Purple", "Rose");
        personMap.put("Pink", "Alice");
        personMap.put("Orange", "Bill");
        personMap.put("Yellow", "Den");
        personMap.put("Blue", "Den");
        System.out.println(personMap);


        boolean is_hasDuplicates = findDuplicatesInMap(personMap);
        if (is_hasDuplicates) {
            System.out.println("There are some people with same names in the map");
        } else {
            System.out.println("There aren't people with same names in the map");
        }
        personMap.remove(findKeyViaName(personMap, "Bob"));
        System.out.println(personMap);

    }

    public static String findKeyViaName(HashMap<String, String> map, String name) {
        for (String lName : map.keySet()) {
            if (map.get(lName).toLowerCase(Locale.ROOT).equals(name.toLowerCase(Locale.ROOT))) {
                return lName;
            }
        }
        return "";
    }

    public static boolean findDuplicatesInMap(HashMap<String, String> map) {
        boolean is_hasDuplicates = true;
        HashMap<String, String> tmpMap = new HashMap<>();
        for (String lName : map.keySet()) {
            tmpMap.put(map.get(lName), lName);
        }
        if (map.size() == tmpMap.size()) {
            is_hasDuplicates = false;
        }
        return is_hasDuplicates;
    }
}
