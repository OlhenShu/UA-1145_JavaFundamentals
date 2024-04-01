package edu10.Lesson;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class AppMap {
	public static void main(String[] args) {
		Map<Object, String> map = new HashMap<>();
		// Map<Object, String> map = new TreeMap<>(new MyComp());
		//Map<Object, String> map = new TreeMap<>();
		map.put("key1", "one");
		map.put(new Object(), "two");
		map.put(1, "3");
		map.put(new Object(), "three");
		map.put(null, "is_simple_null");
		System.out.println("map = " + map);
		map.put(null, "is_second_null");
		System.out.println("next map = " + map);
		//
		/*-
		System.out.println("First");
		for (Map.Entry<Object, String> entry : map.entrySet()) {
			System.out.println("key = " + entry.getKey() + " value = " + entry.getValue());
		}
		*/
		// /*-
		String res = map.remove(1);
		System.out.println("res = " + res);
		System.out.println("Second");
		for (Iterator<Map.Entry<Object, String>> i = map.entrySet().iterator(); i.hasNext();) {
			Map.Entry<Object, String> entry = i.next();
			System.out.println("key = " + entry.getKey() + " value = " + entry.getValue());
		}
		//
		res = map.remove(2);
		System.out.println("res = " + res);
		System.out.println("element by \"key1\" = " + map.get("key1"));
		System.out.println("non existing element by \"key12\" = " + map.get("key12"));
		// */
	}
}
