package Project_Budjet_Manager;

public class IncomeManager {
    private static double balance = 0.00;

    public static double getBalance() {
        return balance;
    }

    public static void setBalance(double balance) {
        IncomeManager.balance = balance;
    }

    public static double addToIncome(double incomeAdded) {
        if (balance + incomeAdded >= 0.00) {
            balance += incomeAdded;
        } else {
            balance = 0.00;
        }
        return balance;
    }

    static void subtractBalance(double expenses) {
        if (balance - expenses >= 0.00) {
            balance -= expenses;
        } else {
            balance = 0.00;
        }
    }
}
