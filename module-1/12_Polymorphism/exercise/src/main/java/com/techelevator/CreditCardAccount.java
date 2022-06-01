package com.techelevator;

public class CreditCardAccount implements Accountable {
    private String accountHolderName;
    private String accountNumber;
    private int debt;
    public CreditCardAccount(String accountHolder, String accountNumber){
        accountHolderName = accountHolder;
        this.accountNumber = accountNumber;
        debt = 0;
    }
    public int pay(int amountToPay){
        debt -= amountToPay;
        return debt;
    }
    public int charge(int amountToCharge){
        debt += amountToCharge;
        return debt;
    }

    public String getAccountHolder() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getDebt() {
        return debt;
    }

    @Override
    public int getBalance() {
        int balance = 0-debt;
        return balance;
    }
}
