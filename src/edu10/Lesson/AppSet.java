package edu10.Lesson;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AppSet {
    public static void main(String[] args) {
        // /*
        Set<String> set = new HashSet<>();
        List<String> list = List.of("First", "Second");
        //
        set.add("First");
        set.add("Second");
        set.add("Third");
        for (String object : set) {
            System.out.println(object);
        }
        System.out.println("set = " + set);
        //
        //add an element that already exists in the collection
        boolean addElement = set.add("First");
        System.out.println("First element: " + addElement);
        //
        //count of elements in the collection
        int count = set.size();
        System.out.println("Count of elements : " + count);
        //
        //is there an element in the collection
        boolean isContains = set.contains("First");
        System.out.println("Contains the given element : " + isContains);
        //
        //removes all elements from the calling collection
        System.out.println("=============================");
        set.removeAll(list);
        //
        // removes all elements except those from the calling collection
        //set.retainAll(list);
        for (String object : set) {
            System.out.println(object);
        }
        // */
    }
}
