package com.techelevator.bank;

public class Savings extends Account {


    public void printStatement() {
        System.out.println("I am a savings statement " + getAccountNumber());
    }
}
