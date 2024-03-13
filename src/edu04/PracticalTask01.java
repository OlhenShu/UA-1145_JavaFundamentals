package edu04;

import java.util.Scanner;

public class PracticalTask01 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = SCANNER.nextInt();
        int num2 = SCANNER.nextInt();
        int num3 = SCANNER.nextInt();

        int count = 0;
        if (num1 % 2 != 0) count++;
        if (num2 % 2 != 0) count++;
        if (num3 % 2 != 0) count++;

        System.out.println("There are " + count + " odd numbers");
    }
}

//
//public class main {
//    public static int method(byte b) {
//        return b+1;
//    }
//
//    public main() {
//    }
//
//    public static int method(int b) {
//        return b+2;
//    }
//    public static int method(short b) {
//        return b+3;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(method(5));
//    }
//}
//class Main {
//    public int x = 10;
//    public String str= "Hello";
//
//    public static void main(String[] args) {
//        System.out.println(str);
//        System.out.println(x);
//    }
//}

//class TemperatureConverter {
//    public static double fahrenheitToCelsius(double fahrenheit) {
//        // Convert Fahrenheit to Celsius using the conversion formula
//        double celsius = (fahrenheit - 32) * 5 / 9;
//        return celsius;
//    }
//
//    public static void main(String[] args) {
//        // Test the method
//        double fahrenheit = 98.6;
//        double celsius = fahrenheitToCelsius(fahrenheit);
//        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius.");
//    }
//}

//class DigitSumCalculator {
//
//    public static int calculateDigitSum(int number) {
//        // Check if the number is a three-digit number
//        if (number < 100 || number > 999) {
//            throw new IllegalArgumentException("Input must be a three-digit number.");
//        }
//
//        // Extract individual digits and calculate their sum
//        int digit1 = number / 100;
//        int digit2 = (number / 10) % 10;
//        int digit3 = number % 10;
//
//        return digit1 + digit2 + digit3;
//    }
//
//    public static void main(String[] args) {
//        // Test the method
//        int number = 123;
//        int sum = calculateDigitSum(number);
//        System.out.println("Sum of positive digits of " + number + ": " + sum);
//    }
//}
//class BankAccount {
//    private String accountNumber;
//    private double balance;
//
//    public BankAccount(String accountNumber, double initialBalance) {
//        this.accountNumber = accountNumber;
//        this.balance = initialBalance;
//    }
//
//    public void setAccountNumber(String accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//
//    public static void main(String[] args) {
//        BankAccount account = new BankAccount("123456789", 1000.0);
//        System.out.println("Account Number: " + account.getAccountNumber());
//        System.out.println("Initial Balance: $" + account.getBalance());
//
//        account.setBalance(1500.0);
//        System.out.println("Updated Balance: $" + account.getBalance());
//    }
//}

//class BankAccount {
//    // Private fields
//    private String accountNumber;
//    private double balance;
//
//    // Constructor
//    public BankAccount(String accountNumber, double initialBalance) {
//        this.accountNumber = accountNumber;
//        this.balance = initialBalance;
//    }
//
//    // Setter method for accountNumber
//    public void setAccountNumber(String accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    // Setter method for balance
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//
//    // Getter method for balance
//    public double getBalance() {
//        return balance;
//    }
//
//    // Method to deposit money into the account
//    public void deposit(double amount) {
//        balance += amount;
//    }
//
//    // Method to withdraw money from the account
//    public void withdraw(double amount) {
//        if (amount > balance) {
//            System.out.println("Insufficient funds. Withdrawal unsuccessful.");
//        } else {
//            balance -= amount;
//        }
//    }
//
//    public static void main(String[] args) {
//        // Test the BankAccount class
//        BankAccount account = new BankAccount("123456789", 1000.0);
//        System.out.println("Initial Balance: $" + account.getBalance());
//
//        // Deposit some money
//        account.deposit(500.0);
//        System.out.println("Balance after deposit: $" + account.getBalance());
//
//        // Withdraw some money
//        account.withdraw(200.0);
//        System.out.println("Balance after withdrawal: $" + account.getBalance());
//
//        // Attempt to withdraw more money than the balance
//        account.withdraw(2000.0);
//        System.out.println("Final Balance: $" + account.getBalance());
//    }
//}