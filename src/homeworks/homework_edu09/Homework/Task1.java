package homeworks.homework_edu09.Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task1 {
    final static int COUNT_OF_RANDOM = 10;
    final static Random random = new Random();


    public static void main(String[] args) {
        List<Integer> myCollection = collectionOfRandoms();
        System.out.println("Original collection: " + myCollection);

        swapMaxAndMin(myCollection);
        System.out.println("Collection after swapping max and min elements: " + myCollection);

        randomNumberBeforeNegative(myCollection);
        System.out.println("Collection after inserting a random three-digit number : " + myCollection);

        zeroBetweenDifferentSigns(myCollection);
        System.out.println("Collection after adding zero between all neighboring elements with different signs: "
                + myCollection);

        kNewTwoList(myCollection);

        removeLastEven(myCollection);
        System.out.println("Collection after removing the last even element: " + myCollection);

        removeFirstMin(myCollection);


    }

    private static List<Integer> collectionOfRandoms() {
        List<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i < COUNT_OF_RANDOM; i++) {
            myCollection.add(random.nextInt(100) - 50);
        }
        return myCollection;

    }

    private static void swapMaxAndMin(List<Integer> myCollection) {
        int maxIndex = myCollection.indexOf(Collections.max(myCollection));
        int minIndex = myCollection.indexOf(Collections.min(myCollection));
        Collections.swap(myCollection, maxIndex, minIndex);

    }


    private static void randomNumberBeforeNegative(List<Integer> myCollection) {
        int negativeNumber = -1;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                negativeNumber = i;
                break;
            }
        }
        int randomThreeDigitNumber = random.nextInt(900) + 100;
        if (negativeNumber != -1) {
            myCollection.add(negativeNumber, randomThreeDigitNumber);
        }

    }


    private static void zeroBetweenDifferentSigns(List<Integer> myCollection) {
        int numbZero = 0;
        for (int i = 0; i < myCollection.size() - 1; i++) {
            int currentNumber = myCollection.get(i);
            int nextNumber = myCollection.get(i + 1);

            if (currentNumber > 0 && nextNumber < 0 || currentNumber < 0 && nextNumber > 0) {
                myCollection.add(i + 1, 0);
                i++;
            }
        }

    }

    private static void kNewTwoList(List<Integer> myCollection) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        int k = 5;

        for (int i = 0; i < k && i < myCollection.size(); i++) {
            list1.add(myCollection.get(i));
        }

        for (int i = myCollection.size() - 1; i >= k; i--) {
            list2.add(myCollection.get(i));
        }
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
    }


    private static void removeLastEven(List<Integer> myCollection) {
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                return;
            }
        }
        System.out.println("No even element found in the list to remove.");
    }

    private static void removeFirstMin(List<Integer> myCollection) {
        int minIndex = myCollection.indexOf(Collections.min(myCollection));
        if (minIndex != -1 && minIndex < myCollection.size() - 1) {
            myCollection.remove(minIndex + 1);
            System.out.println("Element following the first minimum has been removed.");
        } else {
            System.out.println("The minimum element is the last one. Nothing needs to be removed.");
        }
        System.out.println(myCollection);
    }


}



