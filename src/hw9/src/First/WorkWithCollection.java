package First;
import java.util.*;

public class WorkWithCollection {
    static Random random = new Random();

    // filling array list with "random" method
    public static ArrayList<Integer> arrayListFill(ArrayList<Integer> arrayList, int size) {
        for (int i = 0; i < size; i++) {
            int number = random.nextInt(-100, 100);
            arrayList.add(number);
        }
        System.out.println("Starting array:");
        return arrayList;
    }

    // swap the maximum and minimum elements in the list
    public static ArrayList<Integer> swapMinMax(ArrayList<Integer> arrayList) {
        System.out.println(" " + "\nMinimal and maximal numbers are successfully swaped: ");
        ArrayList<Integer> copiedList = new ArrayList<>(arrayList);
        int min = Collections.min(copiedList);
        int max = Collections.max(copiedList);
        for (int i = 0; i < copiedList.size(); i++) {
            if (copiedList.get(i) == min) {
                copiedList.set(i, max);
            } else if (copiedList.get(i) == max) {
                copiedList.set(i, min);
            }
        }
        System.out.println("Minimal number is: " + min);
        System.out.println("Maximal number is: " + max);
        System.out.println("Updated array: ");
        return copiedList;
    }

    // insert a random three-digit number before the first negative element of the list
    public static ArrayList<Integer> insertRandomThreeDigit(ArrayList<Integer> arrayList) {
        ArrayList<Integer> listWithRandomThreeDigit = new ArrayList<>(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) < 0) {
                System.out.println(" ");
                System.out.println("First negative number is " + listWithRandomThreeDigit.get(i));
                System.out.println("Position of " + listWithRandomThreeDigit.get(i) + " is " + i);
                int randomThreeDigitNumber = random.nextInt(100, 1000);
                System.out.println("Random three digital number is " + randomThreeDigitNumber);
                listWithRandomThreeDigit.add(i, randomThreeDigitNumber);
                break;
            }
        }
        System.out.println("Updated array: ");
        return listWithRandomThreeDigit;
    }

    // insert a zero between all neighboring elements collection myCollection with different signs
    public static ArrayList<Integer> insertZero(ArrayList<Integer> arrayList) {
        System.out.println(" " + "\nZero-elements are successfully added between elements with different signs");
        ArrayList<Integer> listWithZeroes = new ArrayList<>(arrayList);
        for (int i = 0; i < listWithZeroes.size() - 1; i++) {
            if (listWithZeroes.get(i) > 0 && listWithZeroes.get(i + 1) < 0 ||
                    listWithZeroes.get(i) < 0 && listWithZeroes.get(i + 1) > 0) {
                listWithZeroes.add(i + 1, 0);
                i++;
            }
        }
        System.out.println("Updated array: ");
        return listWithZeroes;
    }

    //copy the first k elements of the myCollection to the list1, in direct order, and the rest to the list2 in reverse order.
    public static ArrayList<Integer> collectionCopy(ArrayList<Integer> arrayList, int k) throws IllegalAccessException {
        if(k > 10) {
            throw new IllegalAccessException("Elements value must be lower than 10");
        }
        System.out.println(" " + "\n" + k + " elements are successfully copied to object list1 in direct order");
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i = 0; i < k; i++) {
            list1.add(i, arrayList.get(i));
        }
        System.out.println(list1);
        ArrayList<Integer> list2 = new ArrayList<>();
       ArrayList<Integer> reversedList = new ArrayList<>(arrayList.reversed());
        System.out.println("myCollection was reversed successfully");
        int v = 10 - k;
        if(v == 0) {
            System.out.println("All elements are in list1");
        } else {
            for(int i = 0; i < v; i++) {
                list2.add(i, reversedList.get(i));
            }
            System.out.println("Other reversed elements from myCollection are successfully copied to list2");
            return list2;
        }
        System.out.println("ArrayList list1: ");
        return list1;
    }

    //In a list myCollection remove the last even element (if there are even elements in the list).
    // If there is no such element, display a message.
    public static ArrayList<Integer> removeLastEvenElement(ArrayList<Integer> arrayList) {
        System.out.println(" " + "\nLast even number is successfully removed");
        ArrayList<Integer> listWithoutLastEvenElement = new ArrayList<>(arrayList);
        int lastEvenElementIndex = -1;
        for (int i = 0; i < listWithoutLastEvenElement.size(); i++) {
            if (listWithoutLastEvenElement.get(i) % 2 == 0) {
                lastEvenElementIndex = i;
            }
        }

        if (lastEvenElementIndex != -1) {
            listWithoutLastEvenElement.remove(lastEvenElementIndex);
        } else {
            System.out.println("There are no even numbers in list");
        }
        return listWithoutLastEvenElement;
    }

    //Remove from the list myCollection the element following the first minimum.
    // If the minimum element is the last one, nothing needs to be removed.
    public static ArrayList<Integer> removeFirtsFollowing(ArrayList<Integer> arrayList) {
        System.out.println(" ");
        ArrayList<Integer> listWithoutFirstFollowing= new ArrayList<>(arrayList);
        int minIndex = listWithoutFirstFollowing.indexOf(Collections.min(listWithoutFirstFollowing));
        if(minIndex < listWithoutFirstFollowing.size() - 1) {
            listWithoutFirstFollowing.remove(minIndex + 1);
            System.out.println("The number following first minimal number is successfully removed from list");
        } else {
            System.out.println("The minimal number is the last in the list");
        }
        return listWithoutFirstFollowing;
    }
}
