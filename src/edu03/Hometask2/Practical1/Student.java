
// TODO
package Hometask2;

import org.jetbrains.annotations.NotNull;
import java.lang.Integer;


//Practical 3-digit number SUM
 public class Student {
    public static int threeDigitNumber(int number) {
        int third = number % 10;
        int second = (number / 10) % 10;
        int first = (number / 100) % 10;
        int sum = first + second + third;
        return sum;
    }
}
class Square {
     public static double calculateSquareRoot(double number) {
         double output = Math.pow(number, 0.5);
         return output;
     }
    public static double calculateSquare(double number) {
        return (number * number);
    }
    public static double calculateCube(double number) {
         return (number * number * number);
    }
}

class Main {
    public int x = 10;
    public String a = "Hello";
    public static void main(String[] args) {
        Student.threeDigitNumber(123);
        Square.calculateSquareRoot(144);
        Square.calculateSquareRoot(100);
        Square.calculateSquareRoot(16);
        BankAccount bankAccount = new BankAccount("Nina", 123.9);
        System.out.println(bankAccount.getBalance());
    }
}