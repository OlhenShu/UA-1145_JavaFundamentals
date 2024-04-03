package edu09.collections_part1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int maxNumber = -1, minNumber = 101, k;
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int temp = random.nextInt(-100, 100);
            maxNumber = Math.max(maxNumber, temp);
            minNumber = Math.min(minNumber, temp);
            myCollection.add(temp);
        }
        System.out.println("Random 10 numbers: ");
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
        System.out.println("\nInput k (first k elements): ");
        k = in.nextInt();
        list1.addAll(myCollection.subList(0, k));
        list2.addAll(myCollection.subList(k, myCollection.size()).reversed());

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
            System.out.println("\nEven elements not find");
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
    }
}