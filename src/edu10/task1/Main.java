package edu10.task1;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static HashSet<Integer> union(HashSet first, HashSet second) {
        HashSet<Integer> resultSet = new HashSet<>();
        resultSet.addAll(first);
        resultSet.addAll(second);
        return resultSet;
    }

    public static HashSet<Integer> intersection(HashSet first, HashSet second) {
        HashSet<Integer> resultSet = new HashSet<>();
        resultSet.addAll(first);
        resultSet.retainAll(second);
        return resultSet;
    }

    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 0, -5));

        HashSet<Integer> un = union(set1, set2);
        HashSet<Integer> is = intersection(set1, set2);

        System.out.println("Union of two sets: ");
        for (Integer element : un) {
            System.out.print(element + " ");
        }

        System.out.println("\nIntersection of two sets: ");
        for (Integer element : is) {
            System.out.print(element + " ");
        }
    }
}