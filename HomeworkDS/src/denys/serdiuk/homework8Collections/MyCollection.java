package denys.serdiuk.homework8Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class MyCollection {
	static Random random = new Random();

// Task 1.1
	public static String swapMaxMin(ArrayList<Integer> myCollection) {
		int max = myCollection.get(0);
		int min = myCollection.get(0);

		for (int i = 0; i < myCollection.size(); i++) {
			// finding the max and min numbers
			for (int j = 0; j < myCollection.size(); j++) {
				if (max < myCollection.get(i)) {
					max = myCollection.get(i);
				}
				if (min > myCollection.get(i)) {
					min = myCollection.get(i);
				}
			}
		}
		int temp = max;
		myCollection.set(myCollection.indexOf(max), min);
		myCollection.set(myCollection.indexOf(min), temp);

		return "Min: " + min + " max: " + max + " swapping... " + myCollection + " - task 1.1";
	}

//task 1.2		
	public static String addRandomBeforeNegative(ArrayList<Integer> myCollection) {
		for (int j = 0; j < myCollection.size(); j++) {
			if (myCollection.isEmpty() || myCollection.get(0) < 0) {
				myCollection.add(0, random.nextInt(900) + 100);
				break;
			} else if (myCollection.get(j) < 0) {
				myCollection.add(j, (random.nextInt(900) + 100));
				break;
			}
		}
		return myCollection + " - task 1.2";
	}

// task 1.3
	public static String insertZero(ArrayList<Integer> myCollection) {

		int size = myCollection.size();
		for (int i = 0; i <= size + 1; i++) {
			if (myCollection.get(i) < 0 && myCollection.get(i + 1) > 0) {
				myCollection.add(i + 1, 0);
			} else if (myCollection.get(i) > 0 && myCollection.get(i + 1) < 0) {
				myCollection.add(i + 1, 0);
			}
		}
		return myCollection + " - task 1.3";

	}

//task 1.4
	public static String divideAndConquer(int k, ArrayList<Integer> myCollection) {
		ArrayList<Integer> list1 = new ArrayList<>();

		ArrayList<Integer> list2 = new ArrayList<>();

		for (int i = 0; i < k; i++) {
			list1.add(myCollection.get(i));
		}
		for (int j = myCollection.size() - 1; j > k; j--) {
			list2.add(myCollection.get(j));
		}

		return "list 1: " + list1 + " list 2 reverted: " + list2 + " - task 1.4";
	}

//task 1.5
	public static String removeLastEven(ArrayList<Integer> myCollection) {

		for (int i = myCollection.size() - 1; i > 0; i--) {
			if (myCollection.get(i) % 2 == 0) {
				myCollection.remove(i);
				break;
			}
		}

		return "Removed last even: " + myCollection + " - task 1.5";
	}

//task 1.6
	public static String removeSecondAfterMin(ArrayList<Integer> myCollection) {
		int minIndex = 0;
		int min = myCollection.get(0);

		for (int i = 0; i < myCollection.size(); i++) {
			if (myCollection.get(i) < min) {
				min = myCollection.get(i);
				minIndex = myCollection.indexOf(min);
			}
		}

		if (myCollection.size() - 1 == minIndex) {
			return "Nothing to remove the min number is the last one";
		}
		myCollection.remove(minIndex + 1);

		return "Removed number after minimal " + min + " the updated list: " + myCollection;
	}

	public static void main(String[] args) {

		ArrayList<Integer> myCollection = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			// filling the array with random numbers from -100 till 100
			myCollection.add((int) (random.nextInt(201) - 99));
		}

		System.out.println("Initial generated list: " + myCollection);
		// 1.1
		System.out.println(swapMaxMin(myCollection));
		// 1.2
		System.out.println(addRandomBeforeNegative(myCollection));
		// 1.3
		System.out.println(insertZero(myCollection));
		// 1.4
		System.out.println(divideAndConquer(2, myCollection));
		// recap
		System.out.println("myCollection: " + myCollection);
		// 1.5
		System.out.println(removeLastEven(myCollection));
		// 1.6
		System.out.println(removeSecondAfterMin(myCollection));

	}
}
