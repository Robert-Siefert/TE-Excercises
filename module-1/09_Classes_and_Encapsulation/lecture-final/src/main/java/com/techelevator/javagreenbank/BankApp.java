package com.techelevator.javagreenbank;

public class BankApp {

    public static void main(String[] args) {

        //savings account 1
//        SavingsAccount savingsAccount = new SavingsAccount();
//        double initialBalance = savingsAccount.getBalance();
//        System.out.println("Initial Balance:" + initialBalance);
//        double updatedBalance = savingsAccount.deposit(500);
//        System.out.println("Updated Balance:" + updatedBalance);
//
//        updatedBalance = savingsAccount.withdraw(12.00);
//        System.out.println(updatedBalance);
//
//        //savings account 2
//        SavingsAccount vacationAccount = new SavingsAccount();
//        System.out.println(vacationAccount.getBalance());
//        double bal = vacationAccount.deposit(10);
//        System.out.println(bal);


        SavingsAccount newSavingsAccount = new SavingsAccount(75.00, "ABC123");

        System.out.println(newSavingsAccount.getBalance());



    }
}
