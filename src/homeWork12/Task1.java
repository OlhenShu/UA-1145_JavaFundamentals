package homeWork12;

import java.util.Scanner;

public class Task1 {

    static int div(int a, int b) {
        return a/b;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the first number: ");
            int firstNum = sc.nextInt();
            System.out.println("Enter the second number: ");
            int secondNum = sc.nextInt();
            int result = div(firstNum,secondNum);
            System.out.println("Result: "+result);
        }catch (Exception exception){
            System.out.println("Exception occurred: " + exception.getMessage());
            //exception.printStackTrace();
        }
    }

}
