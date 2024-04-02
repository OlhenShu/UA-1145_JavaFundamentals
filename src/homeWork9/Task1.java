package homeWork9;

import java.util.*;
import java.util.stream.IntStream;

public class Task1 {
    private final List<Integer> myCollection = new LinkedList<>();
    private final Random random = new Random();
    private List<Integer> list1 = new LinkedList<>();
    private List<Integer> list2 = new LinkedList<>();

    void fillListWithRandomIntegers() {
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(-99, 100));
        }
    }

    void swapMaxMinElements() {
        int naxIndex = 0;
        int minIndex = 0;
        Integer maxValue = myCollection.getFirst();
        Integer minValue = myCollection.getFirst();
        for (int i = 0; i < myCollection.size(); i++) {
            Integer currValue = myCollection.get(i);
            if (currValue > maxValue) {
                maxValue = currValue;
                naxIndex = i;
            }
            if (currValue < minValue) {
                minValue = currValue;
                minIndex = i;
            }
        }
        Collections.swap(myCollection, naxIndex, minIndex);
    }

    void printCollection() {
        myCollection.forEach(number -> System.out.print(number + " "));
    }

    void printLists() {
        list1.forEach(number -> System.out.print(number + " "));
        System.out.println("");
        list2.forEach(number -> System.out.print(number + " "));
    }

    void insertRandomNumBeforeFirstNegative() {
        int index = IntStream.range(0, myCollection.size())
                .filter(n -> myCollection.get(n) < 0)
                .findFirst().orElse(-1);
        myCollection.add(index, random.nextInt(100, 999));
    }

    void insertZeroBetweenDiffSignElements() {
        for (int i = 0; i < myCollection.size() - 1; i++) {
            boolean diffSign = (myCollection.get(i) < 0 && myCollection.get(i + 1) > 0)
                    || (myCollection.get(i) > 0 && myCollection.get(i + 1) < 0);

            if (diffSign) {
                myCollection.add(i + 1, 0);
                i++;
            }
        }
    }

    void copyElemToDiffLists() {
        list1 = new LinkedList<>(myCollection.subList(0, 5));
        Collections.sort(list1);

        list2 = new LinkedList<>(myCollection.subList(5, 10));
        list2.sort(Collections.reverseOrder());
    }

    void removeLastEvenNum() {
        int evenNumIndex = 0;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) % 2 == 0) {
                evenNumIndex = i;
            }
        }
        if (evenNumIndex != 0) {
            myCollection.remove(evenNumIndex);
        } else {
            System.out.println("There is no even numbers in the list.");
        }
    }

    void removeElemAfterFirstNegative() {
        int index = IntStream.range(0, myCollection.size())
                .filter(n -> myCollection.get(n) < 0)
                .findFirst().orElse(-1);
        if (index == -1)
            System.out.println("First negative number is the last in the list, " +
                    "no removal was performed.");
        else myCollection.remove(index + 1);
    }
}

class RunTask1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();

        task1.fillListWithRandomIntegers();
        task1.printCollection();

//      <Swap the maximum and minimum elements in the list.>
//      System.out.println("");
//      task1.swapMaxMinElements();
//      task1.printCollection();

//      <Insert a random three-digit number before the first negative element of the list>
//      System.out.println("");
//      task1.insertRandomNumBeforeFirstNegative();
//      task1.printCollection();

//      <Insert a zero between all neighboring elements collection myCollection with different signs>
//      System.out.println("");
//      task1.insertZeroBetweenDiffSignElements();
//      task1.printCollection();

//      <Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the
//      list2 in reverse order.>
//      System.out.println("");
//      task1.copyElemToDiffLists();
//      task1.printLists();

//      <In a list myCollection remove the last even element (if there are even elements in the list). If
//      there is no such element, display a message.System.out.println("");>
//      task1.removeLastEvenNum();
//      task1.printCollection();

//      <Remove from the list myCollection the element following the first minimum. If the minimum
//      element is the last one, nothing needs to be removed.System.out.println("");>
//      task1.removeElemAfterFirstNegative();
//      task1.printCollection();
    }
}