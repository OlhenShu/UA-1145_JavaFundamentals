package Second;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Smith", "Noah");
        personMap.put("Johnson", "Emma");
        personMap.put("Williams", "Orest");
        personMap.put("Jones", "Liam");
        personMap.put("Brown", "Olivia");
        personMap.put("Davis", "William");
        personMap.put("Miller", "Ava");
        personMap.put("Moore", "Orest");
        personMap.put("Taylor", "Isabella");
        personMap.put("Harris", "Orest");

        Person.output(personMap);
        System.out.println("Are there at least two persons with the same first name among these people? "
                + Person.areThereTwoPersonsWithName(personMap));
        Person.removeByFirstName(personMap, "Orest");
        System.out.println("Are there at least two persons with the same first name among these people? "
                + Person.areThereTwoPersonsWithName(personMap));
        Person.removeByFirstName(personMap, "Isabella");
        System.out.println("Are there at least two persons with the same first name among these people? "
                + Person.areThereTwoPersonsWithName(personMap));
    }
}
