package com.techelevator;

public class CheckingAccount extends BankAccount {

    final private int OVERDRAFT_FEE = 10;


    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw){
        if (this.getBalance()-amountToWithdraw <= -100) {
            return this.getBalance();
        }
        if(this.getBalance()-amountToWithdraw < 0){
           return super.withdraw(amountToWithdraw+OVERDRAFT_FEE);
        }
        return super.withdraw(amountToWithdraw);
    }


}
