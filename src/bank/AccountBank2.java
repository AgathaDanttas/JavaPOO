package src.bank;

import java.util.List;
import java.util.ArrayList;

public class AccountBank2 {
    private int number;
    private String titular;
    private double balance;
    private List<Transaction> transactions;

    public AccountBank2(int number, String titular) {
        this(number, titular, 0.0);
    }

    public AccountBank2(int number, String titular, double balance) {
        this.number = number;
        this.titular = titular;
        this.balance = Math.max(balance, 0.0);
        this.transactions = new ArrayList<>();

    }

    public boolean isValueValid(double value) {
        return value > 0;
    }

    public boolean hasSufficientBalance(double value) {
        return value <= this.balance;
    }

    public boolean deposit(double value) {
        if (isValueValid(value)) {
            this.balance += value;
            transactions.add(new Transaction(Transaction.Type.DEPOSIT, value));
            return true;
        }
        return false;
    }

    public boolean withdraw(double value, double fee) {
        if (isValueValid(value) && hasSufficientBalance(value + fee)) {
            return withdraw(value + fee);
        }
        return false;
    }

    public boolean withdraw(double value) {
        if (isValueValid(value) && hasSufficientBalance(value)) {
            this.balance -= value;
            transactions.add(new Transaction(Transaction.Type.WITHDRAW, value));
            return true;
        }
        return false;
    }

    public boolean transfer(double value, AccountBank2 dest) {
        if (dest == null) return false;
        if (withdraw(value)) {
            dest.deposit(value);
            return true;
        }
        return false;
    }

    public int getNumber() {
        return this.number;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getBalance() {
        return this.balance;
    }

    public List<Transaction> getTransactions() {
        return new ArrayList<>(transactions);
    }

}
