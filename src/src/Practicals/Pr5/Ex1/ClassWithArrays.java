package Practicals.Pr5.Ex1;

import java.util.Arrays;
import java.util.Scanner;

public class ClassWithArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringArray = {"word", "letter", "sentence", "abstract", "poem", "text"};
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));

        int[] numbArray = {5, 18, -4, 0, 199};
        System.out.println(findAverageOfNumbs(numbArray));

        System.out.print("What number will we looking for? Input here: ");
        int numbForSearching = scanner.nextInt();

        if (checkTheNumbInArray(numbArray,  numbForSearching)){
            System.out.printf("There is the number %d in the array!", numbForSearching);
        }
        else {
            System.out.printf("There isn`t the number %d in the array!", numbForSearching);
        }
    }

    public static boolean checkTheNumbInArray(int[] arr, int numb) {
        int[] numbArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(numbArr);
        int index = Arrays.binarySearch(numbArr, numb);

        if (index >= 0) {
            return true;
        }
        return false;
    }

    public static int findAverageOfNumbs(int[] arr) {
        int count = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            count++;
        }
        return sum / count;
    }
}
