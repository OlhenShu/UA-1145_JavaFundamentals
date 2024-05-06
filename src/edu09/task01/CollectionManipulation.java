package edu09.task01;

import java.util.*;

public class CollectionManipulation {
    final static int COUNT_OF_RANDOM = 10;
    final static int BOUND_OF_RANDOM = 100;

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> myCollection = new ArrayList<>();

        for (int i = 0; i < COUNT_OF_RANDOM; i++) {
            myCollection.add(i, random.nextInt(BOUND_OF_RANDOM) - 10);
        }
        System.out.println("Collection of random numbers, before modification: " + myCollection);

        swapMaxToMin(myCollection);
        System.out.println("After swap max to min elements:" + myCollection);

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, random.nextInt(100, 999));
                break;
            }
        }

        System.out.println("After add random three-digit number: " + myCollection);

        for (int i = 1; i < myCollection.size(); i++) {
            if ((myCollection.get(i - 1) < 0 && myCollection.get(i) > 0)
                    || ((myCollection.get(i - 1) > 0 && myCollection.get(i) < 0))) {
                myCollection.add(i, 0);
            }
        }
        System.out.println("After zero insertion: " + myCollection);

        //Let int k be six;
        int k = 6;
        List<Integer> list1 = new LinkedList<>(myCollection.subList(0, k));
        System.out.println("First-half list: " + list1);

        //first realisation of list2:
      /*  List<Integer> list2 = new ArrayList<>(myCollection.subList(k, myCollection.size()));
               list2.sort(Collections.reverseOrder());*/
        List<Integer> list2 = new ArrayList<>();
        for (int i = myCollection.size() - 1; i >= k; i--) {
            list2.add(myCollection.get(i));
        }
        System.out.println("Second-half list, in reverse order: " + list2);

        removeLastEvenElement(myCollection);
        System.out.println("List myCollection after remove last even element: " + myCollection);

        int minIndex = myCollection.indexOf(Collections.min(myCollection));
        if (minIndex != (myCollection.size() - 1)) {
            myCollection.remove(minIndex + 1);
        }

        System.out.println("List myCollection after removing the element following the minimum." + myCollection);
    }

    public static void swapMaxToMin(List<Integer> list) {
        assert list != null;
        int minIndex = list.indexOf(Collections.min(list));
        int maxIndex = list.indexOf(Collections.max(list));

        Collections.swap(list, minIndex, maxIndex);
    }

    public static void removeLastEvenElement(List<Integer> list) {
        boolean foundEven = false;

        for (int i = (list.size() - 1); i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                foundEven = true;
                break;
            }
        }
        if (!foundEven) {

            System.out.println("There are no even elements in the list.");
        }
    }
}
