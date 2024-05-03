package denys.serdiuk.ProjectBudgetManager;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class BankAccount {
    private double income;
    static final ArrayList<Purchase> purchases = new ArrayList<>();
    private double balance;

    public BankAccount() {
    }

    public void withdrawIncome(double purchase){
        balance -= purchase;
    }
    public String getPurchases() {
        if (purchases.isEmpty()){
            return "The purchase list is empty";
        }
        return purchases.toString();
    }
    public void addPurchases(Purchase newPurchase) {
    	try {
        purchases.add(newPurchase);
    	} catch(InputMismatchException e) {
    		System.out.println("wrong purchase format");
    	}
    }

    public double getIncome() {
        return income;
    }

    public double getBalance() {
        return balance;
    }

    public void setIncome(double income) {
    	
        this.income = income;
    }

    public void setBalance(double balance) {
        this.balance += balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "income=" + income +
                ", purchases=" + purchases +
                ", balance=" + balance +
                '}';
    }
}
