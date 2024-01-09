package src.com.smartsaver.student;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private double balance;
    private List<String> transactionHistory;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Initial balance: $" + initialBalance);
    }
    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
        balance -= amount;
        transactionHistory.add("Withdrew: $" + amount);
    } else {
        System.out.println("Insufficient funds to withdraw $" + amount);
    }
}
    public double getBalance() {
        return balance;
    }
    public List<String> getTransactionHistory() {
        return transactionHistory;
    }
}

