package edu09.practical;

import java.util.*;

public class Task3 {
    final static int COUNT_OF_RANDOM = 10;
    final static int BOUND_OF_RANDOM = 100;

    public static void main(String[] args) {

        List<Integer> myCollection = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < COUNT_OF_RANDOM; i++) {
            myCollection.add(rand.nextInt(BOUND_OF_RANDOM) - 10); // Random number between -10 and 100
        }
        System.out.println("Original collection: " + myCollection);

        // Step 2: Find positions of elements greater than 5
        ArrayList<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        System.out.println("Positions of elements greater than 5: " + newCollection);

        // Step 3: Remove elements greater than 20
        Iterator<Integer> iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number > 20) {
                iterator.remove(); // Remove the current element
            }
        }

        System.out.println("After removing elements greater than 20: " + myCollection);

        // Step 4: Insert elements at specified positions
        try {
            myCollection.add(2, 1); // Position 2
            myCollection.add(8, 3); // Position 8
            myCollection.add(5, -4); // Position 5
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Attempted to insert at an invalid position.");
        }
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("Position – " + i + ", value of element – " + myCollection.get(i));
        }

        // Step 5: Sort and print the collection
        Collections.sort(myCollection);
        System.out.println("Sorted collection: " + myCollection);
    }
}
