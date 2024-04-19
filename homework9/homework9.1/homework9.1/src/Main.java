import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Declare and fill the collection
        List<Integer> myCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            myCollection.add(scanner.nextInt());
        }

        // Swap the maximum and minimum elements
        int minIndex = 0, maxIndex = 0;
        int minValue = myCollection.get(0), maxValue = myCollection.get(0);
        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i) < minValue) {
                minValue = myCollection.get(i);
                minIndex = i;
            }
            if (myCollection.get(i) > maxValue) {
                maxValue = myCollection.get(i);
                maxIndex = i;
            }
        }
        Collections.swap(myCollection, minIndex, maxIndex);
        System.out.println("After swapping min and max elements: " + myCollection);

        // Insert a random three-digit number before the first negative element
        Random random = new Random();
        int randomThreeDigitNumber = random.nextInt(900) + 100;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, randomThreeDigitNumber);
                break;
            }
        }
        System.out.println("After inserting random number: " + myCollection);

        // Insert a zero between all neighboring elements with different signs
        List<Integer> tempList = new ArrayList<>(myCollection);
        for (int i = 1; i < tempList.size(); i++) {
            if (tempList.get(i) * tempList.get(i - 1) < 0) {
                myCollection.add(i, 0);
            }
        }
        System.out.println("After inserting zeros: " + myCollection);

        // Copy the first k elements to list1, rest to list2
        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, 5));
        List<Integer> list2 = new LinkedList<>(myCollection.subList(5, myCollection.size()));
        Collections.reverse(list2);
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        // Remove the last even element from myCollection
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                break;
            }
        }
        System.out.println("After removing last even element: " + myCollection);

        // Remove element following the first minimum
        int firstMinIndex = myCollection.indexOf(Collections.min(myCollection));
        if (firstMinIndex != myCollection.size() - 1) {
            myCollection.remove(firstMinIndex + 1);
        } else {
            System.out.println("The minimum element is the last one, nothing to remove.");
        }
        System.out.println("After removing element following the first minimum: " + myCollection);
    }
}
