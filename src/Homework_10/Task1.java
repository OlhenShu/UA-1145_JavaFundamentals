package Homework_10;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        // Step 3. Filling the Sets
        Set<String> strings1 = new HashSet<>();
        Set<String> strings2 = new HashSet<>();

        strings1.add("apple");
        strings1.add("banana");
        strings1.add("orange");
        strings1.add("kiwi");
        strings1.add("grape");

        strings2.add("banana");
        strings2.add("grape");
        strings2.add("peach");
        strings2.add("watermelon");
        strings2.add("orange");

        // Step 4. Testing methods
        Set<String> unitedStrings = union(strings1, strings2);
        System.out.println(unitedStrings);

        Set<String> intersectedStrings = intersect(strings1, strings2);
        System.out.println(intersectedStrings);

    }

    // Step 1. Develop parameterized methods union(Set set1, Set set2)
    public static Set<String> union(Set<String> set1, Set<String> set2) {
        Set<String> strings = new HashSet<>(set1);

        strings.addAll(set2);
        return strings;
    }

    // Step 2. Develop parameterized methods intersect(Set set1, Set set2)
    public static Set<String> intersect(Set<String> set1, Set<String> set2) {
        Set<String> set = new HashSet<>();

        for (String element1 : set1) {
            if (set2.contains(element1)) {
                set.add(element1);
            }
        }
        return set;
    }

}
