package edu09.collections_part1;

import java.util.*;

public class Main {
    // Constants for bounds and size
    private static final int MIN_BOUND = -100;
    private static final int MAX_BOUND = 100;
    private static final int COLLECTION_SIZE = 10;

    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int maxNumber = MIN_BOUND - 1;  //on different line (done)
        int minNumber = MAX_BOUND + 1;
        int k;

        //for (int i = 0; i < 10; i++) { //don`t use concrete numbers, create constant for bounds and size (done)
        Random random = new Random();
        for (int i = 0; i< COLLECTION_SIZE; i++){
            int temp = random.nextInt(MIN_BOUND, MAX_BOUND + 1);
            maxNumber = Math.max(maxNumber, temp);
            minNumber = Math.min(minNumber, temp);
            myCollection.add(temp);
        }
        System.out.println("Random " + COLLECTION_SIZE + " numbers: ");
        int minPos = 0, maxPos = 0;
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.print(myCollection.get(i) + " ");
            if (myCollection.get(i) == minNumber) minPos = i;
            if (myCollection.get(i) == maxNumber) maxPos = i;
        }
        System.out.println("\nMaximum: " + maxNumber + " Minimum: " + minNumber);
        Collections.swap(myCollection, minPos, maxPos);
        System.out.println("Array after swap: ");
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.print(myCollection.get(i) + " ");
        }
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i + 1, new Random().nextInt(100, 999));
                break;
            }
        }
        System.out.println("\nArray after insert three digit number: ");
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.print(myCollection.get(i) + " ");
        }
        for (int i = 0; i < myCollection.size() - 1; i++) {
            if (myCollection.get(i) * myCollection.get(i + 1) < 0) {
                myCollection.add(i + 1, 0);
            }
        }

        System.out.println("\nArray after insert zero between neighboring elements: ");
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.print(myCollection.get(i) + " ");
        }

        //list1.addAll(myCollection.subList(0, k));
        System.out.println("\nInput k (first k elements): ");
        k = in.nextInt();

        while (k > myCollection.size()) {
            System.out.println("Warning: k is greater than the number of elements in myCollection");
            System.out.println("Only the first " + myCollection.size() + " elements will be added to list1, " +
                    "and the rest will be added to list2 in reverse order");
            System.out.println("\nInput k (first k elements): ");
            k = in.nextInt();
        }

        list1.addAll(myCollection.subList(0, Math.min(k, myCollection.size())));
        list2.addAll(myCollection.subList(k, myCollection.size()));
        Collections.reverse(list2);

        System.out.println("\nArray list1: ");
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println("\nArray list2: ");
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }

        boolean flagEven = true;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0 && myCollection.get(i) != 0) {
                myCollection.remove(i);
                flagEven = false;
                break;
            }
        }
        if (flagEven) {
            System.out.println("\nEven elements not found");
        } else {
            System.out.println("\nArray after removing last even element: ");
            for (int i = 0; i < myCollection.size(); i++) {
                System.out.print(myCollection.get(i) + " ");
            }
        }

        int minIndex = myCollection.indexOf(Collections.min(myCollection));
        if (minIndex != myCollection.size() - 1) {
            myCollection.remove(minIndex + 1);
            System.out.println("\nArray after removing element: ");
            for (int i = 0; i < myCollection.size(); i++) {
                System.out.print(myCollection.get(i) + " ");
            }
        } else {
            System.out.println("\nMinimum is last element");
        }

        in.close();
    }
}