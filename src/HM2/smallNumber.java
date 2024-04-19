package HM2;

import java.util.Scanner;

public class smallNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray;
        myArray = new int[3];
        //better
        //int[] myArray = new int[3];
        System.out.println("Input 3 numbers: ");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = sc.nextInt();
        }
        int smallestNum = smallerNum(myArray);
        System.out.println("The smallest number: " + smallestNum);
    }

    public static int smallerNum(int[] myArray) {//better findSmallest
        int count = myArray[0];//why count? maybe better "smallest"
        for (int i = 0; i < myArray.length - 1; ++i) {
            if (count < myArray[i]) {
                return count;
            } else {
                count = myArray[i];
            }
        }
        return count;
//        int smallest = myArray[0];
//        for (int i = 1; i < myArray.length; i++) {
//            if (myArray[i] < smallest) {
//                smallest = myArray[i];
//            }
//        }
//        return smallest;
    }
}
