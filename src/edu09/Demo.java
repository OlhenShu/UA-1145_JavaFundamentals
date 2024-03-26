package edu09;

import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.addFirst("zero");
        list.add(1, "hello");
        // list.get(Integer.parseInt("hello"));
        String el = list.get(1);
        System.out.println(el);
        System.out.println(list.size());

        List<String> list1 = List.of("one", "two");
        list.addAll(2, list1);
        System.out.println(list);
        //list1.addFirst("hello");
        System.out.println(list1);
        //  list.remove("hello");
        //  list.remove(1);
        System.out.println(list);
        list.removeAll(list1);
        System.out.println(list);


    }
}
