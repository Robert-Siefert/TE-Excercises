package com.techelevator.javagreenbank;

public class SavingsAccount {

    private String accountNumber;
    private double balance;


    public SavingsAccount(double balance, String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public SavingsAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double deposit(double amountToDeposit) {
        if (amountToDeposit > 0) {
            this.balance += amountToDeposit;
        }
        return this.balance;
    }

    public double withdraw(double amountToWithdraw) {
        if (this.balance > amountToWithdraw) {
            this.balance -= amountToWithdraw;
        }
        return this.balance;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
