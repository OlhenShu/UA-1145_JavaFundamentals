package edu09.HomeWork01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Declare collection myCollection of 10 integers and fill it (from the console or random).
        List<Integer> myCollection = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(-100, 100));
        }

        System.out.println("Original list: " + myCollection);

        //=======================================================================================================
        /*
        1. Swap the maximum and minimum elements in the list.
         */
        int maxIndex = myCollection.indexOf(Collections.max(myCollection));
        int minIndex = myCollection.indexOf(Collections.min(myCollection));
        Collections.swap(myCollection, maxIndex, minIndex);
        System.out.println("Swapped list: " + myCollection);

        //=======================================================================================================
        /*
        2. Insert a random three-digit number before the first negative element of the list
        */
        System.out.println("=".repeat(40));

        Random threeDigits = new Random();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, threeDigits.nextInt(100, 999));
                break;
            }
        }
        System.out.println("Random 3-digit number inserted before the first neg element: " + myCollection);

        //=======================================================================================================
        /*
         3. Insert a zero between all neighboring elements collection myCollection with different signs
        */
        System.out.println("=".repeat(40));

        for (int i = 0; i < myCollection.size() - 1; i++) {
            if ((myCollection.get(i) >= 0 && myCollection.get(i + 1) < 0) || myCollection.get(i) < 0 && myCollection.get(i + 1) >= 0) {
                myCollection.add(i + 1, 0);
                i++;
            }
        }

        System.out.println("Zeroes added between all neighboring elements with diff signs: " + myCollection);

        //=======================================================================================================
        /*
        4. Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the
        list2 in reverse order
        */
        System.out.println("=".repeat(40));

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1 = List.copyOf(myCollection.subList(0, myCollection.size() / 2));
        list2 = new ArrayList<>(List.copyOf((myCollection.subList(myCollection.size() / 2, myCollection.size()))));
        Collections.reverse(list2);

        System.out.println("Copy the first k elements of the myCollection to the list1, in direct order: " + list1);
        System.out.println("Copy the rest to the list2 in reverse order: " + list2);

        //=======================================================================================================
        /*
        5. In a list myCollection remove the last even element (if there are even elements in the list). If
        there is no such element, display a message.
        */
        System.out.println("=".repeat(40));
        int lastEvenIndex = -1;

        for (int i = myCollection.size() - 1; i >= 0; i--) {
            int num = myCollection.get(i);

            if (num % 2 == 0) {
                lastEvenIndex = i;
                myCollection.remove(i);
                System.out.println("Removed last even element: " + num);
                break;
            }
        }
        if (lastEvenIndex == -1) {
            System.out.println("There are no even elements in the list");
        }
        System.out.println(myCollection);

        //=======================================================================================================
        /*
        6. Remove from the list myCollection the element following the first minimum. If the minimum
        element is the last one, nothing needs to be removed.
        */
        System.out.println("=".repeat(40));
        int minimumIndex = myCollection.indexOf(Collections.min(myCollection));
        if (minimumIndex == myCollection.size() - 1) {
            System.out.println("Nothing needs to be removed");
        } else {
            System.out.println("Minimal value is: " + Collections.min(myCollection));
            System.out.println("Index of minimal is: " + minimumIndex);
            myCollection.remove(minimumIndex + 1);
            System.out.println(myCollection);
        }


    }
}
