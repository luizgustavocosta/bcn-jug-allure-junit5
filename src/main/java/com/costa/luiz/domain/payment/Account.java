package com.costa.luiz.domain.payment;

import com.costa.luiz.domain.infrastructure.Model;

@Model
public class Account {

    private final String name;
    private final String iban;
    private double balance;

    public Account(String name, String iban, double balance) {
        this.name = name;
        this.iban = iban;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getIban() {
        return iban;
    }

    public double getBalance() {
        return balance;
    }

    public double balanceOperation(Operation operation, double value) {
        if (value < 0d) {
            throw new IllegalArgumentException("The value should be greater than zero");
        }
        switch (operation) {
            case DEBIT:
                this.balance -= value;
                break;
            case CREDIT:
                this.balance += value;
                break;
            default:
                throw new IllegalArgumentException("The Operation should be "+Operation.CREDIT+" or "+Operation.DEBIT);
        }
        return this.balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", iban='" + iban + '\'' +
                ", balance=" + balance +
                '}';
    }
}
