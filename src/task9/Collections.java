import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static int generateNum() {
        Random rand = new Random();
        return rand.nextInt();
    }

    public static void createArray(List<Integer> myCollection) {
        for (int i = 0; i < 10; i++) {
            myCollection.add(generateNum());
        }
    }

    public static void findFirstNegativeEl(List<Integer> myCollection) {
        Random rand = new Random();
        int randThreeDigit = rand.nextInt(900) + 100;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                if (i > 0) {
                    myCollection.set(i - 1, randThreeDigit);
                } else {
                    myCollection.set(i, randThreeDigit);
                }
                break;
            }
        }
    }
    public static void insertZero(List<Integer> myCollection) {
        for (int i = 0; i < myCollection.size() - 1; i++) {
            int current = myCollection.get(i);
            int next = myCollection.get(i + 1);

            if ((current < 0 && next > 0) || (current > 0 && next < 0)) {
                myCollection.add(i + 1, 0);
                i++;
            }
        }
    }
    public static void copyEl(int  k, List<Integer> myCollection) {

        List<Integer> list1 = myCollection.subList(0, k);
        List<Integer> list2 = myCollection.stream().skip(list1.size()).collect(Collectors.toList()).reversed();

        System.out.println(myCollection);
        System.out.println("Non-reversed: " + list1);
        System.out.println("Reversed: " + list2);

    }
    public static void removeLastEven(List<Integer> myCollection){
        for(int i = myCollection.size(); i >= 0; i--) {
            if (myCollection.get(myCollection.size() - 1) % 2 == 0) {
                myCollection.remove(myCollection.size() - 1);
                break;
            } else {
                System.out.println("No even elements on the list! :(");
            }
        }
    }
    public static void minimumEl(List<Integer> myCollection){
        int minIndex = myCollection.indexOf(Collections.min(myCollection));
        System.out.println(minIndex);
        if(myCollection.size() - 1 == minIndex){
            System.out.println("Nothing to remove");
        } else  {
            myCollection.remove(minIndex);
        }
    }


    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<Integer>();
        createArray(myCollection);
        int maxIndex = myCollection.indexOf(Collections.max(myCollection));
        int minIndex = myCollection.indexOf(Collections.min(myCollection));

        int temp = myCollection.get(maxIndex);
        myCollection.set(maxIndex, myCollection.get(minIndex));
        myCollection.set(minIndex, temp);

        copyEl(2, myCollection);

        minimumEl(myCollection);
        System.out.println("Original list: " + myCollection);

        findFirstNegativeEl(myCollection);
        System.out.println("3-digit number: " + myCollection);
    }
}
