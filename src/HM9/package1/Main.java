package HM9.package1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> myCollection = generateRandomNumbers(10);
        printList(myCollection);

        int minNumber = findMin(myCollection);
        int maxNumber = findMax(myCollection);
        System.out.println("Maximum: " + maxNumber + " Minimum: " + minNumber);

        swapMinMax(myCollection);
        System.out.println("Array after swap: ");
        printList(myCollection);

        insertThreeDigitNumber(myCollection);
        System.out.println("Array after insert three digit number: ");
        printList(myCollection);

        insertZeroBetweenSigns(myCollection);
        System.out.println("Array after insert zero between neighboring elements: ");
        printList(myCollection);

        System.out.println("Input k (first k elements): ");
        int k = in.nextInt();
        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, k));
        List<Integer> list2 = new ArrayList<>(myCollection.subList(k, myCollection.size()));
        Collections.reverse(list2);

        System.out.println("Array list1: ");
        printList(list1);

        System.out.println("Array list2: ");
        printList(list2);

        removeLastEvenElement(myCollection);
    }

    public static List<Integer> generateRandomNumbers(int count) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            numbers.add(random.nextInt(200) - 100); // Генерация случайного числа от -100 до 100
        }
        return numbers;
    }

    public static void printList(List<Integer> list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int findMin(List<Integer> list) {
        return Collections.min(list);
    }

    public static int findMax(List<Integer> list) {
        return Collections.max(list);
    }

    public static void swapMinMax(List<Integer> list) {
        int min = findMin(list);
        int max = findMax(list);
        int minIndex = list.indexOf(min);
        int maxIndex = list.indexOf(max);
        Collections.swap(list, minIndex, maxIndex);
    }

    public static void insertThreeDigitNumber(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.add(i + 1, new Random().nextInt(100, 1000));
                break;
            }
        }
    }

    public static void insertZeroBetweenSigns(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) * list.get(i + 1) < 0) {
                list.add(i + 1, 0);
            }
        }
    }

    public static void removeLastEvenElement(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0 && list.get(i) != 0) {
                list.remove(i);
                System.out.println("\nArray after removing last even element: ");
                printList(list);
                return;
            }
        }
        System.out.println("\nEven elements not found");
    }
}

