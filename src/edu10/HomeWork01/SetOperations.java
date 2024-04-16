package edu10.HomeWork01;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    // Union method
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    // Intersection method
    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        // Test union
        Set<Integer> unionResult = union(set1, set2);
        System.out.println("Union: " + unionResult);

        // Test intersection
        Set<Integer> intersectResult = intersect(set1, set2);
        System.out.println("Intersection: " + intersectResult);
    }
}
