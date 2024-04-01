package edu10.Lesson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ApplListIter {

    public static void main(String[] args) {
        //
        // Iterator
		/*-
		List<String> list = new ArrayList<>();
		list.add("First element");
		list.add("Second element");
		list.add(0, "One more first element");
		list.add("Second element");
		//
		// Print Elements
//		System.out.println("elements: " + list);
		//
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println("list.get(" + i + ")= " + list.get(i));
//		}
		//
//		for (String current : list) { // implicit inner iterator
//			System.out.println("current = " + current);
//		}
		//
		Iterator<String> iterator = list.iterator(); // get iterator
		while (iterator.hasNext()) {
			String current = iterator.next();
			System.out.println("current: " + current);
		}
		*/
        // /*-
        List<String> list = new ArrayList<>();
        list.add("First element");
        list.add("Second element");
        list.add(0, "One more first element");
        list.add("Second element");
        //
        // Print
        System.out.println("Start elements: " + list);
        //
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println("Current Element = " + list.get(i));
//            if (list.get(i).contains("Second")) {
//                list.remove(i);
//            }
//        }
        //
//        for (String current : list) {
//            System.out.println(current);
//            if (current.contains("Second")) {
//                list.remove(current);
//            }
//        }
        //
        // Standart API of Java Collection
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String current = iterator.next();
            System.out.println("element = " + current);
            if (current.contains("Second")) {
                iterator.remove();
            }
        }
        // */
        // Print
        System.out.println("Final elements: " + list);
    }
}
