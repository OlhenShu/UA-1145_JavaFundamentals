import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Doe", "John");
        personMap.put("Smith", "Alice");
        personMap.put("Johnson", "Ivan");
        personMap.put("Brown", "Nina");
        personMap.put("Williams", "Orest");
        personMap.put("Jones", "David");
        personMap.put("Wilson", "Viktoria");
        personMap.put("Taylor", "Sashko");
        personMap.put("Anderson", "Omelian");
        personMap.put("Clark", "Orest");

        System.out.println("Initial map:");
        displayMap(personMap);

        // Check if there are at least two persons with the same first name
        boolean hasDuplicateFirstName = personMap.values().stream()
                .anyMatch(name -> personMap.values().stream().filter(n -> n.equals(name)).count() > 1);
        System.out.println("Are there at least two persons with the same first name? " + hasDuplicateFirstName);

        // Remove the person whose first name is "Orest"
        personMap.entrySet().removeIf(entry -> entry.getValue().equals("Orest"));

        System.out.println("\nMap after removing 'Orest':");
        displayMap(personMap);
    }

    private static void displayMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Last Name: " + entry.getKey() + ", First Name: " + entry.getValue());
        }
    }
}
