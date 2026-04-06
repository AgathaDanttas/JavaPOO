package src.bank;

import java.util.Date;

public class Transaction {
    enum Type {
        DEPOSIT, WITHDRAW, TRANSFER
    }

    private Type type;
    private double value;
    private Date date;

    @Override
    public String toString() {
        return "[" + type + "] R$" + value + " - " + date;
    }

    public Transaction(Type type, double value) {
        this.type = type;
        this.value = value;
        this.date = new Date();
    }

    public Type getType() {
        return this.type;
    }

    public double getValue() {
        return this.value;
    }

    public Date getDate() {
        return this.date;
    }
}
