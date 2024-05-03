package homeWork10;

import java.util.HashSet;
import java.util.Set;

//Good job!
public class UnionIntersect {

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(1);

        Set<Integer> unionSet = union(set1, set2);
        for (Integer value : unionSet) {
            System.out.println(value);
        }

        Set<Integer> intersectSet = intersect(set1, set2);
        for (Integer value : intersectSet) {
            System.out.println(value);
        }

    }

}


