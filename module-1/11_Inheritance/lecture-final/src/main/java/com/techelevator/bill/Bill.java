package com.techelevator.bill;

public class Bill {

    private double balance;
    private String accountNumber;

    public Bill (String accountNumber, double balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;

    }



    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void payBill(double amountToPay) {

        this.balance = this.balance - amountToPay;

    }

    public void addToBill(double amountToAdd) {

        this.balance = this.balance + amountToAdd;
    }

    public void printBill () {

        System.out.println("Account Number: " + accountNumber + " Balance Due: " + balance );

    }



}
