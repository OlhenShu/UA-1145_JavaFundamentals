package edu10.Lesson;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class AppBigSort {

    public void bubbleInt(int[] a) {
        int t = 0;
        boolean isContinue = true;
        for (int i = 0; isContinue && i < a.length - 1; i++) {
            isContinue = false;
            for (int j = 0; j < a.length - 1 - i; j++) {
                //System.out.print(".");
                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    isContinue = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 100000;
        AppBigSort sort = new AppBigSort();
        int[] arr = new int[n];
        Random random = new Random();
        //
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(n);
        }
        //
        long timeStart = System.currentTimeMillis();
        //sort.bubbleInt(arr); // O(n^2)
        Arrays.sort(arr); // O(n*log(n))
        long timeEnd = System.currentTimeMillis();
        System.out.println("Duration = " + 1.0 * (timeEnd - timeStart) / 1000.0);
        //
        //System.out.println("Result = " + Arrays.toString(arr));
    }
}
