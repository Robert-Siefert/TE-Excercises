package com.techelevator.bank;

public abstract class Account {



    private double balance;
    private String accountNumber;


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void calculateObnoxiousFees() {
        //do something bad here...
    }

    public abstract void printStatement();

}
