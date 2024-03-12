package task3;

class InputNumbers {
    public static void main(String[] args) {
        float arr[] = {-5.9f, 3.8f, 2f};
        checker(arr);
    }

    public static void checker(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] < -5) || (arr[i] > 5)) {
                System.out.println("Number is not in between 5 and -5");
                return;
            }
            System.out.println("Numbers are in between 5 and -5");
        }
    }
}