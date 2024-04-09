package homework12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskTwo {
    static public final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        userCheckNumbers();
        }
    private static final int start = 1;
    private static final int end = 50;
    private static final int[] userNumbers=new int[10];

    public static void userCheckNumbers() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.print("Введіть " + (i + 1) + " число: ");
                int num = readNumber(start, end);
                userNumbers[i]=num;
            }catch (NumberFormatException e){
                System.out.println("Ви ввели не число. Введіть тепер число.");
                i--;
            }catch (IllegalArgumentException ex){
                System.out.println("Ви вийшли з меж від 1 до 50. Введіть тепер число у цій межі.");
                i--;
            }
        }
        System.out.println("Введені числа які входять у межу від 1 до 50: ");
        for(int number:userNumbers)
            System.out.print(number+" ");
    }


    public static int readNumber(int start, int end){
        int num;
        try{
            num = Integer.parseInt(SCANNER.nextLine());
            if (num<start||num>end)
                throw new IllegalArgumentException("Ви вийшли з меж від 1 до 50");
        }catch (NumberFormatException e) {
            throw new NumberFormatException();
        }
        return num;
    }
}
