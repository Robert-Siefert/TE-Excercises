package com.techelevator.bank;

public abstract class Checking extends Account{

    private int startingCheckNumber;

    public int getStartingCheckNumber() {
        return startingCheckNumber;
    }

    public void setStartingCheckNumber(int startingCheckNumber) {
        this.startingCheckNumber = startingCheckNumber;
    }

    public abstract void printStatement();


}
