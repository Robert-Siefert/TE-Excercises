package com.techelevator;

public class SavingsAccount extends BankAccount {
    private final int SERVICE_CHARGE = 2;
    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw){
        if (this.getBalance() - (amountToWithdraw + SERVICE_CHARGE) <0){
            return this.getBalance();
        }
        if(this.getBalance() - amountToWithdraw < 150) {

            return super.withdraw(amountToWithdraw+ SERVICE_CHARGE);
        }
        return super.withdraw(amountToWithdraw);


    }
}
