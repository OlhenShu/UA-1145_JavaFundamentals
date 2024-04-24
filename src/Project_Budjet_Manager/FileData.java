package Project_Budjet_Manager;

import java.util.List;

public class FileData {
    private final double balance;
    private final List<Purchase> purchases;

    public FileData(double balance, List<Purchase> purchases) {
        this.balance = balance;
        this.purchases = purchases;
    }

    public double getBalance() {
        return balance;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }
}