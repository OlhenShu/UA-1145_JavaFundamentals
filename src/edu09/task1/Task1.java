package edu09.task1;

import java.util.*;

// 1. Declare collection myCollection of 10 integers and fill it (from the console or random).
public class Task1 {
    final static int COUNT_OF_RANDOM = 10;
    final static int BOUND_OF_RANDOM = 100;

    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < COUNT_OF_RANDOM; i++) {
            myCollection.add(rand.nextInt(BOUND_OF_RANDOM) - 10); // Random number between -10 and 100
        }
        System.out.println("Original collection: " + myCollection);

        // Step 1: Swap the maximum and minimum elements in the list
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i) < myCollection.get(minIndex)) minIndex = i;
            if (myCollection.get(i) > myCollection.get(maxIndex)) maxIndex = i;
        }
        Collections.swap(myCollection, minIndex, maxIndex);
        System.out.println("Swapped min and max elements: " + myCollection);

        // Step 2: Insert a random three-digit number before the first negative element of the list
        int randomNum = rand.nextInt(100) + 10;
        int negIndex = myCollection.indexOf(myCollection.stream().filter(n -> n < 0).findFirst().orElse(null));
        if (negIndex != -1) myCollection.add(negIndex, randomNum);
        System.out.println("Inserted random three-digit number before the first negative element: " + myCollection);

        // Step 3: Insert a zero between all neighboring elements collection myCollection with different signs
        ListIterator<Integer> iterator = myCollection.listIterator();
        while (iterator.hasNext()) {
            int num1 = iterator.next();
            if (iterator.hasNext()) {
                int num2 = iterator.next();
                if ((num1 >= 0 && num2 < 0) || (num1 < 0 && num2 >= 0)) {
                    iterator.previous();
                    iterator.add(0);
                    iterator.next();
                }
                else {
                    iterator.previous();
                }
            }
        }
        System.out.println("Inserted zero between neighboring elements with different signs: " + myCollection);

        // Step 4: Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the list2 in reverse order
        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, 5));
        List<Integer> list2 = new ArrayList<>(myCollection.subList(5, 10));
        Collections.reverse(list2);
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);

        // Step 5: In a list myCollection remove the last even element (if there are even elements in the list).
        // If there is no such element, display a message.
        int lastEvenIndex = -1;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                lastEvenIndex = i;
                break;
            }
        }
        if (lastEvenIndex != -1) {
            myCollection.remove(lastEvenIndex);
            System.out.println("Removed last even element: " + myCollection);
        } else {
            System.out.println("No even elements found in the list.");
        }

        // Step 6: Remove from the list myCollection the element following the first minimum.
        // If the minimum element is the last one, nothing needs to be removed.
        int min = Collections.min(myCollection);
        int minIndex2 = myCollection.indexOf(min);
        if (minIndex2 < myCollection.size() - 1) myCollection.remove(minIndex2 + 1);
        System.out.println("Removed element following the first minimum: " + myCollection);
    }
}