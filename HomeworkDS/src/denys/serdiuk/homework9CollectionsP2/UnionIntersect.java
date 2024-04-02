package denys.serdiuk.homework9CollectionsP2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UnionIntersect {

	public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
		Set<T> unionSet = new HashSet<>(set1);
		unionSet.addAll(set2);
		return unionSet;
	}

	public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
		Set<T> intersectedSet = new HashSet<>(set1);
		intersectedSet.retainAll(set2);
		return intersectedSet;
	}

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);

		Set<Integer> set2 = new HashSet<>();
		set2.add(3);
		set2.add(4);
		set2.add(5);

		System.out.println(union(set1, set2));
		System.out.println(intersect(set1, set2));

		HashMap<String, String> personMap = new HashMap<>();
		personMap.put("Denys", "Serdiuk");
		personMap.put("Anna", "Dow");
		personMap.put("Anna", "Smith");
		personMap.put("Brake", "Test");

		System.out.println(personMap);
		personMap.remove("Brake");
		System.out.println(personMap);

	}

}
