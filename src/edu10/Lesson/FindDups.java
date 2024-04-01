package edu10.Lesson;

import java.util.*;

public class FindDups {
	public static void main(String[] args) {
		/*-
		Set<String> s = new HashSet<>();
		//List<String> s = new LinkedList<>();
		for (int i = 0; i < args.length; i++) {
		    if (!s.add(args[i])) {
		        System.out.println("Duplicate detected: " + args[i]);
		    }
		}
		System.out.println("Elements: " + s);
		*/
		// /*-
		//Set<Employee> s = new HashSet<>();
		Set<Employee> s = new TreeSet<>(new Employee.ByNameAndId());
		//Set<Employee> s = new TreeSet<>();
		boolean b;
		//new Employee(123, "Ivan").hashCode();
		//new Employee(123, "Ivan").equals(null);
		b = s.add(new Employee(123, "Ivan"));
		System.out.println("s.add(new Employee(123, \"Ivan\")) = " + b);
		b = s.add(new Employee(124, "Petro"));
		System.out.println("s.add(new Employee(124, \"Petro\")) = " + b);
		b = s.add(new Employee(123, "Ivan"));
		System.out.println("s.add(new Employee(123, \"Ivan\")) = " + b);
		//
		b = s.add(null);
		System.out.println("s.add(null) = " + b);
		b = s.add(null);
		System.out.println("s.add(null) = " + b);
		//
		System.out.println("Employee: " + s);
//		for (Employee current : s) {
//			System.out.println("employee: " + current
//					+ "  hashCode(): " + current.hashCode());
//		}
		//Employee e = new Employee(123, "Ivan");
		//e.equals(e);
		//
//		for (Employee current : s) {
//			System.out.println("employee: " + current // current.toString()
//					+ "  hashCode(): " + (current != null ? current.hashCode(): null));
//		}
		// */
	}
}
