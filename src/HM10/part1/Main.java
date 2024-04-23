package HM10.part1;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static HashSet<Integer> union(HashSet firstNum, HashSet secondNum) {
        HashSet<Integer> finalSet = new HashSet<>();
        finalSet.addAll(firstNum);
        finalSet.addAll(secondNum);
        return finalSet;
    }

    public static HashSet<Integer> intersection(HashSet firstNum, HashSet secondNum) {
        HashSet<Integer> finalSet = new HashSet<>();
        finalSet.addAll(firstNum);
        finalSet.addAll(secondNum);
        return finalSet;
    }

    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(-4, -3, -2, -1, 0, 1, 2, 3, 4));
        HashSet<Integer> un = union(set1, set2);
        HashSet<Integer> ints = intersection(set1, set2);
        System.out.println("Union of two sets: ");
        for (Integer el : un) {
            System.out.println(el + " ");
        }
        System.out.println("Intersection of two sets: ");
        for (Integer el : ints) {
            System.out.println(el + "\t");
        }
    }
}
