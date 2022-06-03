package com.techelevator.bank;

public class MoneyMarketChecking extends Checking{


    public void printStatement() {
        System.out.println("I am a MM statement " + getAccountNumber());
    }
}
