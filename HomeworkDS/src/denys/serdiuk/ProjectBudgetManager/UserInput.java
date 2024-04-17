package denys.serdiuk.ProjectBudgetManager;

import java.util.Scanner;

public class UserInput {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //System.out.println(ListExpenses.listExpenses());
        BankAccount myBalance = new BankAccount();
        Menu.menu(myBalance);
    }
}
