package Practicals.Pr9.Ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CollectionOfTenIntegers {

    public static void main(String[] args) {

        int numberOfElements = 10;

        ArrayList<Integer> myCollection = new ArrayList<>(numberOfElements);

        Random random = new Random();

        int bound = 50;

        for (int i = 0; i < numberOfElements; i++) {
            myCollection.add(random.nextInt(bound));
        }
        System.out.println("First set of numbers: " + myCollection);

        ArrayList<Integer> newCollection = new ArrayList<>();

        int numberForComparison1 = 5;

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > numberForComparison1) {
                newCollection.add(myCollection.get(i));
            }
        }
        System.out.println("Numbers more then " + numberForComparison1 + ": " + newCollection);

        int numberForComparison2 = 20;

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > numberForComparison2) {
                myCollection.remove(i);
                i--;
            }
        }
        System.out.println("Numbers less then " + numberForComparison2 + ": " + myCollection);
        System.out.println();

        addToList(myCollection, 1, 1);
        addToList(myCollection, 7, -3);
        addToList(myCollection, 4, -4);

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("position - " + (i + 1) + ", value of element – " + myCollection.get(i));
        }

        System.out.println();
        Collections.sort(myCollection);
        System.out.println("Sorted list: " + myCollection);
    }

    public static void addToList(ArrayList<Integer> list, int index, int number) {
        if (list.size() < index) {
            list.add(number);
        } else {
            list.add(index, number);
        }
    }
}
