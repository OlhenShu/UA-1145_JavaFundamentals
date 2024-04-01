package practical_tasks.pt4;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number " + (i + 1) + " :");
            if (scanner.nextInt() % 2 != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
