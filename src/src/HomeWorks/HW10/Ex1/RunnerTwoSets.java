package HomeWorks.HW10.Ex1;

import java.util.HashSet;
import java.util.Set;

public class RunnerTwoSets {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        //For small task like this, make sense use Set.of
//        Set<Integer> set1 = Set.of(2, 4, 6, 8, 10, 12);
//        Set<Integer> set2 = Set.of(1, 2, 3, 4, 5, 6);
        set1.add(2);
        set1.add(4);
        set1.add(6);
        set1.add(8);
        set1.add(10);
        set1.add(12);
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        HashSet<Integer> unionSet = unionSets(set1, set2);
        System.out.println(unionSet);

        HashSet<Integer> intersectSet = intersectSets(set1, set2);
        System.out.println(intersectSet);
    }

    public static HashSet<Integer> unionSets(Set<Integer> set1, Set<Integer> set2) {
        HashSet<Integer> newSet = new HashSet<>(set1);
        newSet.addAll(set2);
        return newSet;
    }

    public static HashSet<Integer> intersectSets(Set<Integer> set1, Set<Integer> set2) {
        HashSet<Integer> newSet = new HashSet<>();
        for (Integer i : set1) {
            if (set2.contains(i)) {
                newSet.add(i);
            }
        }
        return newSet;
    }
    //The intersection method can be made more efficient by checking which set is smaller and iterating over it,
    // which reduces the number of containment checks

    //It's minimize the number of contains calls
    // by always iterating over the smaller set and checking against the larger one.
}
//public static Set<Integer> intersectSets(Set<Integer> set1, Set<Integer> set2) {
//    Set<Integer> smaller = set1.size() <= set2.size() ? set1 : set2;
//    Set<Integer> larger = set1.size() > set2.size() ? set1 : set2;
//
//    Set<Integer> newSet = new HashSet<>();
//    for (Integer i : smaller) {
//        if (larger.contains(i)) {
//            newSet.add(i);
//        }
//    }
//    return newSet;
//}