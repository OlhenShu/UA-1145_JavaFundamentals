package edu14;

import java.util.Optional;

public class Java8Tester133 {
    public static void main(String[] args) {
        Integer value1 = null;
        Integer value2 = 10;
        // Optional.ofNullable - allows passed parameter to be null.
        Optional<Integer> a = Optional.ofNullable(value1);
        // Optional.of - throws NullPointerException if passed parameter is null
        Optional<Integer> b = Optional.of(value2);

        System.out.println("First parameter is present: " + a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());
        System.out.println(sum(a, b));    // sum1(value1, value2)
    }

    public static Integer sum(Optional<Integer> a, Optional<Integer> b) {
        // Optional.orElse - returns the value if present otherwise returns
        // the default value passed.
        Integer value1 = a.orElse(0);
        // Optional.get - gets the value, value should be present
        Integer value2 = b.get();
        return value1 + value2;
    }

//    public static Integer sum1(Integer v1, Integer v2) {
//        if ((v1 != null) && (v2 != null)) {
//            return v1 + v2;
//        } // return v1 + v2;
//    }
}

