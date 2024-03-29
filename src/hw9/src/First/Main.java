package First;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        ArrayList<Integer> myCollection = new ArrayList<>();
        myCollection = WorkWithCollection.arrayListFill(myCollection, 10);
        System.out.println(myCollection);
        ArrayList<Integer> swapedList = WorkWithCollection.swapMinMax(myCollection);
        System.out.println(swapedList);
        ArrayList<Integer> listWithThreeDigitalNumber = WorkWithCollection.insertRandomThreeDigit(myCollection);
        System.out.println(listWithThreeDigitalNumber);
        ArrayList<Integer> listWithInsertedZero = WorkWithCollection.insertZero(myCollection);
        System.out.println(listWithInsertedZero);
        ArrayList<Integer> listCollectionCopy = WorkWithCollection.collectionCopy(myCollection, 8);
        System.out.println(listCollectionCopy);
        ArrayList<Integer> listWithRemovedLastEvenNumber = WorkWithCollection.removeLastEvenElement(myCollection);
        System.out.println(listWithRemovedLastEvenNumber);
        ArrayList<Integer> listWithoutFirstFollowing = WorkWithCollection.removeFirtsFollowing(myCollection);
        System.out.println(listWithoutFirstFollowing);
    }
}
