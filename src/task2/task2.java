public class Task2 {
    static int min;
    static int[] arr = new int[] {125, 131, 117, 775, 6};

    public static void main(String[] args) {
        findSmallestNum(arr);
        System.out.println("Smallest number in the array: " + min);
    }

    public static void findSmallestNum(int[] arr) {
        min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
    }
}

