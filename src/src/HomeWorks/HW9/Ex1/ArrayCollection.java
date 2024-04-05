package HomeWorks.HW9.Ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayCollection {
    static final Random random = new Random();

    public static void main(String[] args) {

        int numberOfElements = 10;

        ArrayList<Integer> myCollection = new ArrayList<>(numberOfElements);

        int upperLimit = 10;
        int lowerLimit = -10;

        for (int i = 0; i < numberOfElements; i++) {
            myCollection.add(random.nextInt(upperLimit - lowerLimit + 1) + lowerLimit);
        }

        System.out.println("First set of numbers: " + myCollection);

        swapMinAndMax(myCollection);
        System.out.println("Set of numbers after swapping min and max value: " + myCollection);

        insertRandomThreeDigitNumber(myCollection);
        System.out.println("Set of numbers after inserting a 3 digit number before the first negative number: " + myCollection);

        insertZero(myCollection);
        System.out.println("Set of numbers after inserting a  zero between all neighboring elements with different signs: " + myCollection);

        int k = 2;

        ArrayList<Integer> list1 = new ArrayList<>(myCollection.subList(0, k));
        ArrayList<Integer> list2 = new ArrayList<>(myCollection.subList(k, myCollection.size()));
        Collections.reverse(list2);
        System.out.println("Set of first " + k + " numbers in direct order: " + list1);
        System.out.println("Set of the rest numbers in reverse order: " + list2);

        removeLastEven(myCollection);
        System.out.println("Set of numbers after removing the last even number: " + myCollection);

        removeAfterMin(myCollection);
        System.out.println("Set of numbers after removing the next number after minimum: " + myCollection);
    }

    public static void removeAfterMin(ArrayList<Integer> list) {
        ArrayList<Integer> copyList = new ArrayList<>(list);
        Collections.sort(copyList);

        int minValue = copyList.get(0);
        int minIndex = list.indexOf(minValue);

        if (minIndex != list.size() - 1) {
            list.remove(minIndex + 1);
        }
    }

    public static void removeLastEven(ArrayList<Integer> list) {
        boolean is_findEven = false;
        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i) % 2 != 0 || list.get(i) == 0) {
            } else {
                list.remove(i);
                is_findEven = true;
                break;
            }
        }
        if (!is_findEven) {
            System.out.println("There are no even numbers in the set");
        }
    }

    public static void insertZero(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if ((list.get(i) * list.get(i + 1)) < 0) {
                list.add((i + 1), 0);
            }
        }
    }

    public static void swapMinAndMax(ArrayList<Integer> list) {
        ArrayList<Integer> copyList = new ArrayList<>(list);
        Collections.sort(copyList);

        int minValue = copyList.get(0);
        int maxValue = copyList.get(copyList.size() - 1);

        int minIndex = list.indexOf(minValue);
        int maxIndex = list.indexOf(maxValue);

        Collections.swap(list, maxIndex, minIndex);
    }

    public static void insertRandomThreeDigitNumber(ArrayList<Integer> list) {
        int indexOfNegativeNumb = list.size() - 1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                indexOfNegativeNumb = i;
                break;
            }
        }
        list.add(indexOfNegativeNumb, (random.nextInt(900) + 100));
    }
}