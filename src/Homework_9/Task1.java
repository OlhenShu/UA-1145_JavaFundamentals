package Homework_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task1 {
    final static int COUNT_OF_RANDOM = 10;
    final static int BOUND_OF_RANDOM = 100;
    final static int THREE_DIGIT_RANDOM_BOUND = 900;

    public static void main(String[] args) {

        List<Integer> myCollection = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < COUNT_OF_RANDOM; i++) {
            myCollection.add(rand.nextInt(BOUND_OF_RANDOM) - 50); // Random number between -50 and 50
        }
        System.out.println("1. Original collection: " + myCollection);

        // Step 2. Swap the maximum and minimum elements in the list:
        ArrayList<Integer> swappedList = new ArrayList<>(myCollection);
        int max = swappedList.get(0);
        int min = swappedList.get(0);

        for (int i = 1; i < swappedList.size(); i++) {
            if (swappedList.get(i) > max) {
                max = swappedList.get(i);
            }
            if (swappedList.get(i) < min) {
                min = swappedList.get(i);
            }
        }
        swappedList.set(swappedList.indexOf(min), max);
        swappedList.set(swappedList.indexOf(max), min);

        System.out.println("2. Swapped min and max in collection: " + swappedList);

        // Step 3. Insert a random three-digit number before the first negative element of the list:
        ArrayList<Integer> addThreeDigitNumberList = new ArrayList<>(myCollection);
        for (int i = 0; i < addThreeDigitNumberList.size(); i++) {
            if (addThreeDigitNumberList.get(i) < 0) {
                // Insert a random 3-digit number:
                addThreeDigitNumberList.add(i, rand.nextInt(THREE_DIGIT_RANDOM_BOUND) + 100);
                break;
            }
        }

        System.out.println("3. 3-digit number added in collection: " + addThreeDigitNumberList);

        // Step 4. Insert a zero between all neighboring elements collection myCollection with different signs
        ArrayList<Integer> insertZeroList = new ArrayList<>(myCollection);

        boolean isPositive = true;
        if (insertZeroList.get(0) < 0) {
            isPositive = false;
        }
        for (int i = 0; i < insertZeroList.size(); i++) {
            if (isPositive && insertZeroList.get(i) < 0) {
                insertZeroList.add(i, 0);
                isPositive = false;
            } else if (!isPositive && insertZeroList.get(i) > 0) {
                insertZeroList.add(i, 0);
                isPositive = true;
            }
        }

        System.out.println("4. Zeros added in collection: " + insertZeroList);

        // Step 5. Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the
        // list2 in reverse order.

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>(myCollection.size());

        int k = rand.nextInt(myCollection.size());

        for (int i = 0; i < k; i++) {
            list1.add(myCollection.get(i));
        }

        for (int i = k; i < myCollection.size(); i++) {
            list2.add(myCollection.get(i));
        }

        System.out.println("5. Random k = " + k);
        System.out.println("   List1: " + list1);
        System.out.println("   List2: " + list2.reversed());

        // Step 6. In a list myCollection remove the last even element (if there are even elements in the list). If
        // there is no such element, display a message.
        ArrayList<Integer> lastEvenList = new ArrayList<>(myCollection);

        int lastEven = -1;
        for (int i = 0; i < lastEvenList.size(); i++) {
            if (lastEvenList.get(i) % 2 == 0) {
                lastEven = i;
            }
        }

        if (lastEven < 0) {
            System.out.println("6. There is no even numbers in the collection.");
        } else {
            lastEvenList.remove(lastEven);
            System.out.println("6. Last even number was removed from the collection: " + lastEvenList);
        }

        // Step 7. Remove from the list myCollection the element following the first minimum. If the minimum
        // element is the last one, nothing needs to be removed.
        ArrayList<Integer> firstMinimumList = new ArrayList<>(myCollection);

        int minimum = firstMinimumList.get(0);
        for (int i = 1; i < firstMinimumList.size(); i++) {
            if (firstMinimumList.get(i) < minimum) {
                minimum = firstMinimumList.get(i);
            }
        }

        if (firstMinimumList.indexOf(minimum) == firstMinimumList.size() - 1) {
            System.out.println("7. The minimum element is the last one in collection.");
        } else {
            firstMinimumList.remove(firstMinimumList.indexOf(minimum));
            System.out.println("7. Collection without first minimum is: " + firstMinimumList);
        }

    }


}
