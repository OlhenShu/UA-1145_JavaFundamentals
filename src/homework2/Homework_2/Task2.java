package Homework_2;

import java.util.Scanner;

public class Task2 {
    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;
    public Task2() {
        this.firstNumber = getNum("Input the first number: ");;
        this.secondNumber = getNum("Input the second number: ");
        this.thirdNumber =  getNum("Input the third number: ");
    }

    private static int getNum(String prom) {
        System.out.println(prom);
        Scanner scann = new Scanner(System.in);
        return Integer.parseInt(scann.nextLine());
    }

    private int smallestNumber() {
        return Math.min(Math.min(firstNumber, secondNumber), thirdNumber);
    }

    public void Smallest() {
        int smallest = smallestNumber();
        System.out.println("The smallest number is: " + smallest);
    }
    public static void main(String[] args) {
        Task2 task = new Task2();
        task.Smallest();}

}


