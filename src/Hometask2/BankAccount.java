package Hometask2;


public class BankAccount {
        private String accountNumber;
        private double balance;
        public BankAccount(String accountNumber, double initialBalance) {
            this.accountNumber = accountNumber;
            this.balance = initialBalance;
        }
        public void deposit(double newDepositAmount) {
            this.balance = this.balance + newDepositAmount;
            System.out.println(this.balance);
            System.out.println(balance);
        }

        public void withdraw(double withdrawAmount) {
            if (getBalance() >= withdrawAmount) {
                this.balance = this.balance - withdrawAmount;
            }
        }
        public double getBalance() {
            return this.balance;
        }
    }
