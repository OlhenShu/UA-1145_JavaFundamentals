package homeworks.homework_edu10.Homework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(48, 5, 1, 2, 6));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(48, 3, 9, 1, 5));

        Set<Integer> unionRes = union(set1, set2);
        System.out.println("Union set1 and set2 is: " + unionRes);

        Set<Integer> intersectRes = intersect(set1, set2);
        System.out.println("Intersect set1 and set2 is: " + intersectRes);


    }

    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);
        return intersectSet;
    }

}
