package task3;

public class FindMaxAndMinNumber {
    static int max = 0;
    static int min = 0;

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 4};
        findValue(arr);
    }

    public static void findValue(int[] arr) {
        max = arr[0];
        min = arr[0];
        findMax(arr);
        findMin(arr);
    }

    public static void findMax(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum value: " + max);
    }

    public static void findMin(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum value: " + min);
    }
}
