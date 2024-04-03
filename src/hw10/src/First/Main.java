package First;

import java.util.*;

import static java.lang.System.in;

public class Main {
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4,5,6,7,8));
        Set<Integer> union = union(set1, set2);
        Set<Integer> intersection = intersection(set1, set2);
        System.out.println(union);
        System.out.println(intersection);
    }
}
