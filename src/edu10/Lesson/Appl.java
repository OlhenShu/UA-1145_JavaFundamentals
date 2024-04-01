package edu10.Lesson;


import java.util.*;

public class Appl {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Set<String> set = new HashSet<>();
        //Set<String> set = new LinkedHashSet<>();
        Set<String> set = new TreeSet<>();
        set.add("First");
        set.add("Second");
        set.add("Third");
        set.add("Four");
        set.add("Hash");
        for (String object : set) {
            System.out.println(object);
        }
        //
        List<String> list = List.of("First", "Second");
        //is there an element in the collection
        boolean isContains=set.contains("First");
        System.out.println("isContains = " + isContains);
        //
        //removes all elements from the calling collection
        set.removeAll(list);
        //
        //removes all elements except those from the calling collection
        //set.retainAll(list);
        System.out.println("set = " + set);
    }
}