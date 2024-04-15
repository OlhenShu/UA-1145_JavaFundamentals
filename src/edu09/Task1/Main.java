package edu09.Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> myCollection = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.println("Please write numbers of collection: ");
        for (int i = 0; i < 10; i++) {
            myCollection.add(scanner.nextInt());
        }

        int min = Collections.min(myCollection);
        int max = Collections.max(myCollection);


        int minIndex = myCollection.indexOf(min);
        int maxIndex = myCollection.indexOf(max);

        System.out.println("Before swap: ");
        System.out.println(myCollection);

        Collections.swap(myCollection, minIndex, maxIndex);

        System.out.println("After swap: ");
        System.out.println(myCollection);

        for (int i = 0; i < myCollection.size() - 1; i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, 123);
                break;
            }

        }
        for (int i = 0; i < myCollection.size() - 1; i++) {
            if (myCollection.get(i) < 0 && myCollection.get(i + 1) > 0) {
                myCollection.add(i + 1, 0);
            }
            if (myCollection.get(i) > 0 && myCollection.get(i + 1) < 0) {
                myCollection.add(i + 1, 0);

            }
        }
        System.out.println(myCollection);
        list1.addAll(myCollection);
        list2.addAll(myCollection);
        Collections.reverse(list2);

        System.out.println(list1 + "\n" + list2);
        int lastEvenNumber = 0;
        for (int num : list2) {
            if (num % 2 == 0) {
                lastEvenNumber = num;
                break;
            }
        }

        if (lastEvenNumber == 0) {
            System.out.println("There is no even number in collection");
        } else {
            myCollection.remove((Integer) lastEvenNumber);
        }

        if (min != myCollection.getLast()) {
            myCollection.remove((Integer) min);
        }

        System.out.println("Collection after all modification:" + myCollection);

    }
}
