package Second;

public class Main {
    public static void main(String[] args) {
        int[] number = new int[10];
        for (int i = 0; i < number.length; i++) {
            try {
                number[i] = Number.readNumber(1, 100);
                if (i > 0 && number[i] <= number[i - 1]) {
                    throw new IllegalArgumentException("New number must be higher than number before");
                }
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
                System.out.println("Please enter new number, which will be correct for this task: ");
                // return to the previous element of the array, if the entered one does not match the condition
                i--;
            }
        }
        Number.output(number);
    }
}