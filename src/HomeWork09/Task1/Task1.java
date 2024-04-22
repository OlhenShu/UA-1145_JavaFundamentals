package HomeWork09.Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(-50, 50));
        }
        System.out.println("My collection: " + myCollection);
        System.out.println();

        //Task 1 (Swap the maximum and minimum elements in the list)

        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i) < myCollection.get(minIndex)) {
                minIndex = i;
            }
            if (myCollection.get(i) > myCollection.get(maxIndex)) {
                maxIndex = i;
            }
        }
        Collections.swap(myCollection, minIndex, maxIndex);
        System.out.println("After swapping min and max elements:");
        System.out.println(myCollection);
        System.out.println();

        //Task2 (Insert a random three-digit number before the first negative element of the list)

        int randomThreeDigitNumber = random.nextInt(999);
        int negativeIndex = -1;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                negativeIndex = i;
                break;
            }
        }
        if (negativeIndex != -1) {
            myCollection.add(negativeIndex, randomThreeDigitNumber);
        }

        System.out.println("Random is Number: " + randomThreeDigitNumber);
        System.out.println("Аfter changing the number before the firsts negative element of the list: "
                + myCollection);
        System.out.println();

        //Task3 (Insert a zero between all neighboring elements collection myCollection with different signs)
        for (int i = 0; i < myCollection.size() - 1; i++) {
            if ((myCollection.get(i) >= 0 && myCollection.get(i + 1) < 0)
                    || myCollection.get(i) < 0 && myCollection.get(i + 1) >= 0) {
                myCollection.add(i + 1, 0);
                i++;
            }
        }
        System.out.println("Zero between all neighboring elements collection myCollection "
                + myCollection);
        System.out.println();

        //Task4 (Copy the first k elements of the myCollection to the list1, in direct order,
        // and the rest to the list2 in reverse order.)

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int k = 5;

        list1.addAll(myCollection.subList(0, k));
        for (int i = myCollection.size() - 1; i >= k; i--) {
            list2.add(myCollection.get(i));
        }
        System.out.println("First " + k + " elements in direct order): " + list1);
        System.out.println("Remaining elements in reverse order): " + list2);
        System.out.println();

        //Task5 (In a list myCollection remove the last even element (if there are even elements in the list).
        // If there is no such element, display a message.)
        boolean removed = false;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                removed = true;
                break;
            }
        }
        System.out.println("Last even element removed successfully.");
        System.out.println("Updated list: " + myCollection);
        System.out.println();

        //Task6 (Remove from the list myCollection the element following the first minimum. If the minimum
        //element is the last one, nothing needs to be removed)

        int minimumIndex = myCollection.indexOf(Collections.min(myCollection));
        if (minimumIndex == myCollection.size() - 1) {
            System.out.println("Nothing removed");
        } else {
            System.out.println("Index of minimal is: " + minimumIndex);
            System.out.println("Minimal value is: " + Collections.min(myCollection));
            myCollection.remove(minimumIndex + 1);
            System.out.println(myCollection);
        }
    }

}

