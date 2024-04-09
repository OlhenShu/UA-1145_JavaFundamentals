package homework12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskOne {
    static public final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        createTwoNumbers();
    }
    public static void createTwoNumbers(){
        try{
            System.out.println("Перше число: ");
            double num1 = SCANNER.nextDouble();
            System.out.println("Друге число: ");
            double num2 = SCANNER.nextDouble();
            double result = div(num1,num2);
            System.out.println("Результат: "+result);
        }catch (InputMismatchException e){
            System.out.println("Ви ввели не число");
        }catch (IllegalArgumentException ex){
            System.out.println("Числа є менші нуля");
        } catch (Exception exc){
            System.out.println("Невідома помилка");
        }
    }
    public static double div(double num1, double num2){
        if(num1<0||num2<0) {
            throw new IllegalArgumentException("Числа є менші нуля");
        }
        return num1/num2;
    }
}
